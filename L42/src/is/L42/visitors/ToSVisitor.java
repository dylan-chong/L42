package is.L42.visitors;
import static is.L42.tools.General.range;

import java.util.List;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

import is.L42.generated.*;

public class ToSVisitor extends CollectorVisitor{
  StringBuilder result=new StringBuilder();
  String currentIndent="";
  void nl(){result.append("\n");result.append(currentIndent);}
  void indent(){currentIndent+="  ";}
  void deIndent(){currentIndent=currentIndent.substring(2);}
  char last(){return result.charAt(result.length()-1);}
  void c(String s){
    assert !s.startsWith(",") || last()!='(':
      s;
    assert !s.startsWith(";") || ( last()!=';'&&  last()!='}'):
      s;
    result.append(s);
    }
  void sp(){result.append(" ");}

  void separeFromChar(){
    char last=last();
    if(Character.isLetter(last) || Character.isDigit(last) || last=='$'){
    result.append(" ");}
    }
  void kw(String s){
    separeFromChar();
    c(s);
  }

  private static final IntConsumer empty=i->{}; 
  void seqHas(IntConsumer prefix, List<? extends HasVisitable> elements,String sep){
    for(int i:range(elements)){
      if(i!=0){c(sep);}
      prefix.accept(i);
      elements.get(i).visitable().accept(this);
      }
    }
  
  void seq(IntConsumer prefix, List<? extends Visitable<?>>elements,String sep){
    for(int i:range(elements)){
      if(i!=0){c(sep);}
      prefix.accept(i);
      elements.get(i).accept(this);
      }
    }

  public void visitMdf(Mdf mdf){
    separeFromChar();
    c(mdf.inner);
    }
  public void visitThrow(Throw thr){
    separeFromChar();
    c(thr.inner);
    }
  public void visitOp(Op op){
    if(op==Op.In){c(" in ");}
    else{c(op.inner);}
    }  
  
  public void visitC(C c){
    separeFromChar();
    c(c.inner());
    if(c.hasUniqueNum()){c("::"+c.uniqueNum());}
    }

  public void visitP(P p){
    separeFromChar();
    if(p==P.pAny){c("Any");return;}
    if(p==P.pLibrary){c("Library");return;}
    if(p==P.pVoid){c("Void");return;}
    var p0=p.toNCs();
    c("This"+p0.n());
    seq(i->c("."),p0.cs(),"");
    }

  public void visitS(S s){
    separeFromChar();
    c(s.m());
    if(s.hasUniqueNum()){c("::"+s.uniqueNum());}
    c("(");seq(empty,s.xs(),",");c(")");
    }

  public void visitX(X x){
    separeFromChar();
    c(x.inner());
    }

  public void visitSTMeth(ST.STMeth stMeth){
    visitST(stMeth.st());
    c(".");
    visitS(stMeth.s());
    if(stMeth.i()!=-1){c("."+stMeth.i());}
    }

  public void visitSTOp(ST.STOp stOp){
    visitOp(stOp.op());
    for(var stz:stOp.stzs()){
      c("[");seqHas(empty,stz," ");c("]");
      }
    }

  //public void visitEX(Core.EX x){visitX(x.x());}

  public void visitPCastT(Core.PCastT pCastT){
    visitP(pCastT.p());
    c("<:");
    visitT(pCastT.t());
    }
    
  public void visitEVoid(Core.EVoid eVoid){
    kw("void");
    }
  
  public void visitL(Core.L l){
    boolean inline=HasMultilinePart.inline(l);
    c("{");
    if(inline){indent();}
    if(l.isInterface()){c("interface");}
    if(!l.ts().isEmpty()){
      c("[");seq(empty,l.ts(),", ");c("] ");
      }
    var sp=empty;
    if(inline){sp=i->nl();}
    seq(sp,l.mwts(),"");
    seq(sp,l.ncs(),"");
    sp.accept(0);
    visitInfo(l.info());
    sp.accept(0);
    visitDocs(l.docs());
    if(!l.docs().isEmpty()){sp.accept(0);}
    c("}");
    if(inline){nl();deIndent();}
    }
    
  public void visitInfo(Core.L.Info info){
    separeFromChar();
    if(info.isTyped()){c("#typed}");}
    else {c("#norm{");}
    infoItem("typeDep",info.typeDep());
    infoItem("coherentDep",info.coherentDep());
    infoItem("friendsDep",info.friendsDep());
    infoItem("usedMethDep",info.usedMethDep());
    infoItem("privateImpl",info.privateImpl());
    infoItem("refined",info.refined());
    c("}");
    }
  private void infoItem(String label,List<? extends Visitable<?>> l){
    if(l.isEmpty()){return;}
    c(label+"=("); seq(empty,l,", ");c(")");
    }  
  public void visitMWT(Core.L.MWT mwt){
    visitDocs(mwt.docs());
    visitMH(mwt.mh());
    var _e0=mwt._e();
    if(_e0!=null){
      c("=");
      if(!mwt.nativeUrl().isEmpty()){
        c("native[");
        c(mwt.nativeUrl());
        c("]");
        }
      visitE(_e0);
      }
    }
  
  public void visitNC(Core.L.NC nc){
    visitDocs(nc.docs());
    visitC(nc.key());
    c("="); 
    visitL(nc.l());
    }
  private void cMethName(S s){
    separeFromChar();
    if(s.hasUniqueNum()){c(s.m()+"::"+s.uniqueNum());}
    else c(s.m());
    }
  public void visitMCall(Core.MCall mCall){
    visitXP(mCall.xP());
    c(".");
    cMethName(mCall.s());
    IntConsumer pName=i->{c(mCall.s().xs().get(i)+"=");};
    c("(");
    seqHas(pName,mCall.es(),", ");
    c(")");
    }
    
  public void visitBlock(Core.Block block){
    boolean inline=HasMultilinePart.inline(block);
    var sp=empty;
    if(inline){sp=i->nl();}
    c("(");
    if(!inline){indent();}
    seq(sp,block.ds(),", ");
    seq(sp,block.ks(),", ");
    visitE(block.e());
    c(")");
    if(!inline){deIndent();nl();}
    }
    
  public void visitLoop(Core.Loop loop){
    kw("loop");
    visitE(loop.e());
    }
    
  public void visitThrow(Core.Throw thr){
    visitThrow(thr.thr());
    visitE(thr.e());
    }
    
  public void visitOpUpdate(Core.OpUpdate opUpdate){
    visitX(opUpdate.x());
    c(":=");
    visitE(opUpdate.e());
    }
    
  public void visitD(Core.D d){
    visitT(d.t());
    visitX(d.x());
    c("=");
    visitE(d.e());
    }

  public void visitK(Core.K k){
    kw("catch");
    visitThrow(k.thr());
    visitT(k.t());
    visitX(k.x());
    visitE(k.e());
    }

  public void visitT(Core.T t){
    visitMdf(t.mdf());
    visitDocs(t.docs());
    visitP(t.p());
    }
      
  public void visitDoc(Core.Doc doc){
    c("@");
    if(doc._pathSel()!=null){visitPathSel(doc._pathSel());}
    if(doc.texts().isEmpty()){return;}
    assert doc.texts().size()==doc.docs().size()+1;
    c("{");
    seq(i->c(doc.texts().get(i)),doc.docs(),"");
    c(doc.texts().get(doc.texts().size()-1));
    c("}");
    }
     
  public void visitPathSel(Core.PathSel pathSel){
    var s0=pathSel._s();
    var x0=pathSel._x();
    visitP(pathSel.p());
    if(s0!=null){c(".");visitS(s0);}
    if(x0!=null){c(".");visitX(x0);}
    }
    
  public void visitMH(Core.MH mh){
    var docs0=mh.docs();
    var t0=mh.t();
    var s0=mh.s();
    var pars0=mh.pars();
    var exceptions0=mh.exceptions();
    visitDocs(docs0);
    visitMdf(mh.mdf());
    c("method");
    visitT(t0);
    cMethName(s0);
    c("(");seq(i->visitT(pars0.get(i)),s0.xs(),", ");c(")");
    if(exceptions0.isEmpty()){return;}
    c("[");seq(empty,exceptions0,", ");c("]");
    }

  public void visitPCastT(Half.PCastT pCastT){
    var p0=pCastT.p();
    var t0=pCastT.t();
    visitP(p0);
    c("<:");
    visitT(t0);
    }
    
  public void visitSlash(Half.Slash slash){
    c("%");
    visitSTz(slash.stz());
    c("%");
    }
    
  public void visitBinOp(Half.BinOp binOp){
    seqHas(empty,binOp.es(),binOp.op().inner);
    }
    
  public void visitMCall(Half.MCall mCall){
    var xP0=mCall.xP();
    var s0=mCall.s();
    var es0=mCall.es();
    visitXP(xP0);
    cMethName(s0);
    c("(");
    seqHas(i->c(s0.xs().get(i)+"="),es0,", ");
    c(")");
    }
    
  public void visitBlock(Half.Block block){
    c("(");//Half stuff can be always inline, toString just for debug
    var ds0=block.ds();
    var ks0=block.ks();
    var e0=block.e();
    seq(empty,ds0,", ");
    seq(empty,ks0,", ");
    visitE(e0);
    c(")");
    }
    
  public void visitLoop(Half.Loop loop){
    c("loop");visitE(loop.e());
    }
  public void visitThrow(Half.Throw thr){
    visitThrow(thr.thr());visitE(thr.e());
    }
  public void visitOpUpdate(Half.OpUpdate opUpdate){
    var x0=opUpdate.x();
    var e0=opUpdate.e();
    visitX(x0);
    c(":=");
    visitE(e0);
    }
  public void visitD(Half.D d){
    var t0=d.t();
    var x0=d.x();
    var e0=d.e();
    visitT(t0);
    visitX(x0);
    c("=");
    visitE(e0);
    }
  
  public void visitK(Half.K k){
    var t0=k.t();
    var x0=k.x();
    var e0=k.e();
    c("catch");
    visitThrow(k.thr());
    visitT(t0);
    visitX(x0);
    visitE(e0);
    }

  public void visitT(Half.T t){
    if(t._mdf()!=null){visitMdf(t._mdf());}
    visitSTz(t.stz());
    }

  public void visitCsP(Full.CsP csP){
    if(csP.cs().isEmpty()){visitP(csP._p());return;}
    assert csP._p()==null;
    seq(empty,csP.cs(),".");
    }
    
  public void visitL(Full.L l){
      boolean inline=HasMultilinePart.inline(l);
    c("{");
    if(inline){indent();}
    if(l.isInterface()){c("interface");}
    var ts0=l.ts();
    var ms0=l.ms();
    var docs0=l.docs();
    if(!ts0.isEmpty()){
      c("[");seq(empty,l.ts(),", ");c("] ");
      }
    var sp=empty;
    if(inline){sp=i->nl();}
    seqHas(sp,ms0,"");
    sp.accept(0);
    visitFullDocs(docs0);
    if(!docs0.isEmpty()){sp.accept(0);}
    c("}");
    if(inline){nl();deIndent();}
    }
    
  public void visitF(Full.L.F f){
    var docs0=f.docs();
    var t0=f.t();
    var s0=f.key();
    visitFullDocs(docs0);
    visitT(t0);
    cMethName(s0);
    }
    
  public void visitMI(Full.L.MI mi){
    var docs0=mi.docs();
    var s0=mi.key();
    var e0=mi.e();
    visitFullDocs(docs0);
    c("method");
    visitS(s0);
    c("=");
    visitE(e0);
    }
    
  public void visitMWT(Full.L.MWT mwt){
    var docs0=mwt.docs();
    var mh0=mwt.mh();
    var _e0=mwt._e();
    visitFullDocs(docs0);
    visitMH(mh0);
    if(_e0!=null){
      c("=");
      if(!mwt.nativeUrl().isEmpty()){
        c("native[");
        c(mwt.nativeUrl());
        c("]");
        }
      visitE(_e0);
      }
    }
  
  public void visitNC(Full.L.NC nc){
    var docs0=nc.docs();
    var c0=nc.key();
    var e0=nc.e();
    visitFullDocs(docs0);
    visitC(c0);
    c("=");
    visitE(e0);
    }
    
  public void visitSlash(Full.Slash slash){c("\\");}

  public void visitSlashX(Full.SlashX slashX){c("\\"+slashX.x().inner());}
  
  public void visitEString(Full.EString eString){
    assert eString.es().size()==1;
    assert eString.strings().size()==1;
    var s=eString.strings().get(0);
    assert !s.contains("\n");
    visitE(eString.es().get(0));
    c("\""+s+"\"");
    }
  
  //public void visitEPathSel(Full.EPathSel ePathSel){visitPathSel(ePathSel.pathSel());}

  public void visitUOp(Full.UOp uOp){
    if(uOp._op()!=null){visitOp(uOp._op());}
    if(uOp._num()!=null){
      separeFromChar();
      c(uOp._num());
      }
    visitE(uOp.e());
    }

  public void visitBinOp(Full.BinOp binOp){
    seqHas(empty,binOp.es(),binOp.op().inner);
    }
    
  public void visitCast(Full.Cast cast){
    var e0=cast.e();
    var t0=cast.t();
    visitE(e0);
    c("<:");
    visitT(t0);
    }
  
  public void visitCall(Full.Call call){
    var e0=call.e();
    var s0=call._s();
    var pars0=call.pars();
    visitE(e0);
    if(s0!=null){
      c(".");
      cMethName(s0);
      }
    if(call.isSquare()){c("[");}else{c("(");}
    seq(empty,pars0,"; ");
    visitFullPars(pars0);
    if(call.isSquare()){c("]");}else{c(")");}
    }
  
  public void visitBlock(Full.Block block){
    boolean inline=HasMultilinePart.inline(block);
    var sp=empty;
    if(inline){sp=i->nl();}
    c("(");
    if(!inline){indent();}
    seq(sp,block.ds().subList(0,block.dsAfter()),", ");
    seq(sp,block.ks(),", ");
    if(!block.whoopsed().isEmpty()){
      sp.accept(0);
      c("whoops");
      seq(empty,block.whoopsed(),", ");
      }
    seq(sp,block.ds().subList(block.dsAfter(),block.ds().size()),", ");
    sp.accept(0);
    if(block._e()!=null){visitE(block._e());sp.accept(0);}
    c(")");
    if(!inline){deIndent();nl();}
    }
    
  public void visitLoop(Full.Loop loop){
    c("loop");visitE(loop.e());
    }
  public void visitWhile(Full.While sWhile){
    var c0=sWhile.condition();
    var b0=sWhile.body();
    c("while");
    visitE(c0);
    visitE(b0);
    }
  public void visitFor(Full.For sFor){
    var ds0=sFor.ds();
    var b0=sFor.body();
    c("for");
    var es=ds0.stream().map(ds->ds._e()).collect(Collectors.toList());
    seqHas(i->{
      visitVarTx(ds0.get(i)._varTx());
      c(" in ");//force spaces here
      },es,", ");
    visitE(b0);
    }
    
  public void visitThrow(Full.Throw thr){
    visitThrow(thr.thr());visitE(thr.e());
    }
    
  public void visitOpUpdate(Full.OpUpdate opUpdate){
    var x0=opUpdate.x();
    var e0=opUpdate.e();
    visitX(x0);
    visitOp(opUpdate.op());
    visitE(e0);
    }
    
  public void visitIf(Full.If sIf){
    var _c0=sIf._condition();
    var ds0=sIf.matches();
    var then0=sIf.then();
    var _else0=sIf._else();
    kw("if");
    if(_c0!=null){visitE(_c0);}
    if(!ds0.isEmpty()){
      seq(empty,ds0,", ");
      }
    visitE(then0);
    if(_else0!=null){
      kw("else");
      visitE(_else0);
      }
    }
  public void visitD(Full.D d){
    var tx0=d._varTx();
    var txs0=d.varTxs();
    var e0=d._e();
    if(tx0!=null){visitVarTx(tx0);}
    if(!txs0.isEmpty()){
      c("(");seq(empty,txs0,", ");c(")");
      }
    if(e0!=null){c("=");visitE(e0);}
    }
 
  public void visitVarTx(Full.VarTx varTx){
    var t0=varTx._t();
    var x0=varTx._x();
    if(varTx.isVar()){kw("var");}
    if(varTx._mdf()!=null){visitMdf(varTx._mdf());}
    if(t0!=null){visitT(t0);}
    if(x0!=null){visitX(x0);}
    else{c("_");}
    }
  
  public void visitK(Full.K k){
    var t0=k.t();
    var x0=k._x();
    var e0=k.e();
    kw("catch");
    if(k._thr()!=null){visitThrow(k._thr());}
    visitT(t0);
    if(x0!=null){visitX(x0);}
    else {c("_");}
    visitE(e0);
    }
    
  public void visitPar(Full.Par par){
    var e0=par._that();
    var xs0=par.xs();
    var es0=par.es();
    if(e0!=null){visitE(e0);}//////
    if(!xs0.isEmpty()){
      if(e0!=null){c(", ");}
      seqHas(i->{visitX(xs0.get(i));c("=");},es0,", ");
      }
    }
      
  public void visitT(Full.T t){
    var docs0=t.docs();
    var csP0=t.csP();
    if(t._mdf()!=null){visitMdf(t._mdf());}
    visitFullDocs(docs0);
    visitCsP(csP0);
    }
    
  public void visitDoc(Full.Doc doc){
    c("@");
    if(doc._pathSel()!=null){visitPathSel(doc._pathSel());}
    if(doc.texts().isEmpty()){return;}
    assert doc.texts().size()==doc.docs().size()+1;
    c("{");
    seq(i->c(doc.texts().get(i)),doc.docs(),"");
    c(doc.texts().get(doc.texts().size()-1));
    c("}");
    }
      
  public void visitPathSel(Full.PathSel pathSel){
    var s0=pathSel._s();
    var x0=pathSel._x();
    var csP0=pathSel._csP();
    if(csP0!=null){visitCsP(csP0);}
    if(csP0!=null && s0!=null){c(".");}
    if(s0!=null){visitS(s0);}
    if(x0!=null){assert s0!=null;c(".");visitX(x0);}
    }
    
  public void visitMH(Full.MH mh){
    var docs0=mh.docs();
    var t0=mh.t();
    var s0=mh.s();
    var pars0=mh.pars();
    var exceptions0=mh.exceptions();
    visitFullDocs(docs0);
    if(mh._mdf()!=null){visitMdf(mh._mdf());}
    c("method");
    visitT(t0);
    if(mh._op()!=null){visitOp(mh._op());}
    else{cMethName(s0);}
    c("(");seq(i->visitT(pars0.get(i)),s0.xs(),", ");c(")");
    if(exceptions0.isEmpty()){return;}
    c("[");seq(empty,exceptions0,", ");c("]");
    }
  }
