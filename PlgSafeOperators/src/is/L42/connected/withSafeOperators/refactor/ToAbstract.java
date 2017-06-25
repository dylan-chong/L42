package is.L42.connected.withSafeOperators.refactor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import ast.Ast;
import ast.PathAux;
import ast.Ast.Doc;
import ast.Ast.MethodSelector;
import ast.ExpCore.ClassB;
import ast.ExpCore.ClassB.Member;
import ast.ExpCore.ClassB.MethodWithType;
import auxiliaryGrammar.Functions;
import facade.PData;
import is.L42.connected.withSafeOperators.Errors42;
import is.L42.connected.withSafeOperators.location.Lib;
import is.L42.connected.withSafeOperators.location.Location;
import is.L42.connected.withSafeOperators.location.Method;
import is.L42.connected.withSafeOperators.pluginWrapper.RefactorErrors;
import is.L42.connected.withSafeOperators.pluginWrapper.RefactorErrors.MethodClash;
import is.L42.connected.withSafeOperators.pluginWrapper.RefactorErrors.PathNotFound;
import is.L42.connected.withSafeOperators.pluginWrapper.RefactorErrors.SelectorNotFound;
import programReduction.Program;
import tools.LambdaExceptionUtil;

public class ToAbstract {
public static ClassB toAbstractPath(PData pData,ClassB cb, String path,String sel) throws SelectorNotFound, PathNotFound, MethodClash{
  return toAbstractAux(pData.p,cb,PathAux.parseValidCs(path),MethodSelector.parse(sel),null);
  }
public static ClassB toAbstractPathDest(PData pData,ClassB cb, String path,String sel,String newSel) throws SelectorNotFound, PathNotFound, MethodClash{
  return toAbstractAux(pData.p,cb,PathAux.parseValidCs(path),MethodSelector.parse(sel),MethodSelector.parse(newSel));
  }
public static ClassB toAbstract(PData pData,ClassB cb,String sel) throws SelectorNotFound, PathNotFound, MethodClash{
  return toAbstractAux(pData.p,cb,Collections.emptyList(),MethodSelector.parse(sel),null);
  }
public static ClassB toAbstractDest(PData pData,ClassB cb, String sel,String newSel) throws SelectorNotFound, PathNotFound, MethodClash{
  return toAbstractAux(pData.p,cb,Collections.emptyList(),MethodSelector.parse(sel),MethodSelector.parse(newSel));
  }

/**
 If both sel and newSel exists, it always check for subtyping
   This make it more resilient.
 If sel is abstract,(if no error) always return cb unmodified. 
   This make it safe on interfaces.
 If a new method is introduced, it is not refine.
 */
public static ClassB toAbstractAux(Program p,ClassB cb, List<Ast.C> path,MethodSelector sel,MethodSelector newSel) throws SelectorNotFound, PathNotFound, MethodClash{
  if(MembersUtils.isPrivate(path)){
    throw new RefactorErrors.PathNotFound(Location.as42Path(path)).msg("Private path");
    }
  if(MembersUtils.isPrivate(sel)){
    throw new RefactorErrors.SelectorNotFound(Location.as42Path(path),sel).msg("Private selector");
    }
  if(newSel!=null && MembersUtils.isPrivate(newSel)){
    throw new RefactorErrors.SelectorNotFound(Location.as42Path(path),newSel).msg("Private selector");
    }
  try{
    ClassB nested=cb.getClassB(path);
    //interfaces are ok if(nested.isInterface()){throw new RefactorErrors.PathNotFound(Location.as42Path(path));}
    if(nested._getMember(sel)==null){throw new RefactorErrors.SelectorNotFound(Location.as42Path(path),sel);}
    }
  catch(ast.ErrorMessage.PathMetaOrNonExistant unused){
    throw new RefactorErrors.PathNotFound(Location.as42Path(path));
    }
  if(path.isEmpty()){return auxToAbstract(p,cb,path,sel,newSel,cb);}
  return cb.onClassNavigateToPathAndDo(path,LambdaExceptionUtil.rethrowFunction(cbi->auxToAbstract(p,cbi,path,sel,newSel,cb)));
  }
  private static ClassB auxToAbstract(Program p,ClassB cb,List<Ast.C> path,MethodSelector sel,MethodSelector newSel,ClassB top) throws MethodClash {
    List<Member> newMs=new ArrayList<>(cb.getMs());
    MethodWithType _mwt = (MethodWithType) cb._getMember(sel);
    boolean isSrcAbstract=!_mwt.get_inner().isPresent();
    MethodWithType mwt1=_mwt.with_inner(Optional.empty());
    Functions.replaceIfInDom(newMs,mwt1);
    if(isSrcAbstract &&newSel==null){ return cb;}
    if(newSel==null){ return cb.withMs(newMs);  }
    MethodWithType mwt2 = (MethodWithType) cb._getMember(newSel);
    if(mwt2==null){
      if(isSrcAbstract){ return cb;}
      mwt2=_mwt.withMs(newSel).withMt(_mwt.getMt().withRefine(false));
      newMs.add(0,mwt2);
      return cb.withMs(newMs);
      }
    boolean ok=Compose.mtGT(p, mwt1.getMt(), mwt2.getMt());
    boolean noTwoImpl=isSrcAbstract ||!mwt2.get_inner().isPresent();
    if(!ok || !noTwoImpl){
      Lib root=Lib.newFromLibrary(top);
      Lib nested=root.navigateCs(path);
      Method m1=new Method(_mwt,nested);
      Method m2=new Method(mwt2,nested);
      throw new RefactorErrors.MethodClash(m1,m2);
      }
    if(isSrcAbstract){return cb;}
    mwt2=mwt2.with_inner(_mwt.get_inner());
    Functions.replaceIfInDom(newMs,mwt2);
    return cb.withMs(newMs);
    }
  }
