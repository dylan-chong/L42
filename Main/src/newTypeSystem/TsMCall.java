package newTypeSystem;

import ast.ExpCore.MCall;
import auxiliaryGrammar.Functions;
import tools.Assertions;
import tools.Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ast.Ast.Doc;
import ast.Ast.Mdf;
import ast.Ast.MethodType;
import ast.Ast.NormType;
import ast.Ast.Path;
import ast.ExpCore;
import ast.Ast.Type;

public interface TsMCall extends TypeSystem{
default TOut innerMVPRetype(TOk ri,NormType ti){
  if(Functions.isSubtype(ri.computed.getMdf(),ti.getMdf())){
    assert ri.computed.getMdf()!=Mdf.Mutable; 
    return ri;
    }
  else{
    assert ri.computed.getMdf() == Mdf.Mutable;
    assert ti.getMdf() == Mdf.Capsule;
    TIn ini=ri.in.withE(ri.in.e,ti);
    TOut resi=type(ini);
    return resi;
    }
  }

  default TOut tsMCall(TIn in, MCall s) {
    NormType _rec=GuessTypeCore.of(in, s.getInner());
    Path rec=_rec.getPath();
    MethodType mDec=AlternativeMethodTypes.mtDeclared(in.p,rec,s.getS());
    NormType ret=mDec.getReturnType().getNT();
    ErrorKind kind = TypeSystem.subtype(in.p, ret.getPath(),in.expected.getPath());
    if(kind!=null){return new TErr(in,"",ret,kind);}
    List<MethodType> mTypes = AlternativeMethodTypes.types(mDec);
    MethodType mType=AlternativeMethodTypes._firstMatchReturn(in.p,in.expected,mTypes);
    if (mType==null){
      return new TErr(in,"",ret,ErrorKind.NotSubtypeMdf);
      }
//unachievable return type (T) for method (P.ms) [line numbers of expression and declaration]
//2 type all the parameters with mutOnlyToLent(Ts) //we may include mutOnlyToLent in the computation of the MTypes, instead of in the loop below
    List<TOk> resp=new ArrayList<>();
    List<Type> computed=new ArrayList<>();
    List<ExpCore> annotated=new ArrayList<>();
    ExpCore e0=s.getInner();
    NormType t0=new NormType(mType.getMdf(),rec,Doc.empty());
    TOut _res0=type(in.withE(e0,TypeManipulation.mutOnlyToLent(t0)));
    if(!_res0.isOk()){return improveReceiverError(t0, _res0);}
    TOk res0=_res0.toOk();
    Mdf recMdf=_res0.toOk().computed.getMdf();
    {int i=-1;for(  ExpCore ei:s.getEs()){i+=1;
      NormType ti=mType.getTs().get(i).getNT();
      TOut _resi=type(in.withE(ei,TypeManipulation.mutOnlyToLent(ti)));
      if(!_resi.isOk()){return _resi.toError();}
      resp.add(_resi.toOk());
      computed.add(_resi.toOk().computed);
      annotated.add(_resi.toOk().annotated);
    }}
  MethodType computedMt=new MethodType(false,recMdf,computed,in.expected,Collections.emptyList());
  MethodType mTypeRev=AlternativeMethodTypes._bestMatchMtype(in.p,computedMt,mTypes);
  if (mTypeRev!=null){
    MCall resM=new MCall(res0.annotated,s.getS(),s.getDoc(),annotated,s.getP());
    TOk res=new TOk(in,resM,mTypeRev.getReturnType().getNT());
    // Trs[with r in resp (use[r.Tr])].collapse())
    res=res.trUnion(res0);
    for(TOk oki:resp){res=res.trUnion(oki);}
    return res;
    }
//3 if there is no matching method, we may need to retype some mut
//in capsule caused by mvp:
//it is  not over if there is a mathing method type with mutToCapsule(result param types)
//tsToCaps=Ts[with r in resp (use[mutToCapsule(r.T)])]
//mTypeMVP=_bestMatchMtype(tsToCaps,TSIn.T,mTypes)
  List<Type>tsToCaps=new ArrayList<>();
  for(TOk r: resp){
    Mdf m=r.computed.getMdf();
    if(m==Mdf.MutableFwd || m==Mdf.MutablePFwd){
      return new TErr(in,"impossible to search for mvp since mdf "+m,mTypes.get(0).getReturnType().getNT(),ErrorKind.NotSubtypeClass);
      }
    NormType nt=TypeManipulation.mutToCapsule(r.computed);
    tsToCaps.add(nt);
    }
  computedMt=computedMt.withTs(tsToCaps).withMdf(TypeManipulation.mutToCapsule(computedMt.getMdf()));
  MethodType mTypeMVP=AlternativeMethodTypes._bestMatchMtype(in.p, computedMt, mTypes);
  if (mTypeMVP==null){
    return new TErr(in,"mvp candidate notfound",mTypes.get(0).getReturnType().getNT(),ErrorKind.NotSubtypeClass);
    }
//To be happy, we can retype the obtained mut parameters into expected capsule
  TOut _newRes0=innerMVPRetype(res0,t0.withMdf(mTypeMVP.getMdf()));
  if(!_newRes0.isOk()){return _newRes0;}
  TOk newRes0=_newRes0.toOk();
  List<TOk> newResp=new ArrayList<>();
  {int i=-1;for(TOk ri :resp){i+=1;NormType ti=mTypeMVP.getTs().get(i).getNT();
    TOut outi=innerMVPRetype(ri,ti);
    if(!outi.isOk()){return outi.toError();}
    newResp.add(outi.toOk());
    }}
//return res=makeMCallOK(TSIn,respMVP,mTypeMVP)
  MCall resM=new MCall(newRes0.annotated,s.getS(),s.getDoc(),
    Map.of(r->r.annotated,newResp),s.getP());
  TOk res=new TOk(in,resM,mTypeMVP.getReturnType().getNT());
// Trs[with r in resp (use[r.Tr])].collapse())
  res=res.trUnion(newRes0);
  for(TOk oki:newResp){res=res.trUnion(oki);}
  return res;
  }

default TOut improveReceiverError(NormType t0, TOut _res0) {
TErr err=_res0.toError();
  //if receiver must class, and is not, give better error
  //if receiver must not class, but is class, give better error
  if(t0.getMdf()==Mdf.Class && err.kind==ErrorKind.NotSubtypeMdf){
    return err.withKind(ErrorKind.ClassMethCalledOnNonClass);
    }
  if(err._computed!=null && err._computed.getMdf()==Mdf.Class && err.kind==ErrorKind.NotSubtypeMdf){
    return err.withKind(ErrorKind.NonClassMethCalledOnClass);
    }
  return err;
}
}

