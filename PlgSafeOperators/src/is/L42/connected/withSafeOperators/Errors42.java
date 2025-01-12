package is.L42.connected.withSafeOperators;

import is.L42.connected.withSafeOperators.ExtractInfo.ClassKind;
import is.L42.connected.withSafeOperators.ExtractInfo.IsUsed;

import tools.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import platformSpecific.javaTranslation.Resources;
import platformSpecific.javaTranslation.Resources.Error;
import sugarVisitors.ToFormattedText;
import ast.Ast.C;
import ast.Ast.Doc;
import ast.Ast.Mdf;
import ast.Ast.MethodSelector;
import ast.Ast.Path;
import ast.Ast.Position;
import ast.Ast.Type;
import ast.Ast;
import ast.ErrorMessage;
import ast.ExpCore;
import ast.ExpCore.ClassB;
import ast.ExpCore.ClassB.Member;
import ast.ExpCore.ClassB.MethodWithType;
import ast.ExpCore.X;
import ast.Util.CsPz;
import auxiliaryGrammar.Functions;
import programReduction.Program;

public class Errors42 {

  //"SourceUnfit", caused by redirect
  public static Error errorSourceUnfit(List<Ast.C> current,Path destExternalPath,ExtractInfo.ClassKind kindSrc,ExtractInfo.ClassKind kindDest,List<Member>unexpected,boolean headerOk,List<Path>unexpectedInterfaces){
      return Resources.Error.multiPartStringError("SourceUnfit",
          "SrcPath",formatPathIn(current), //the path of the class that can not be redirected
          "DestExternalPath",formatPathOut(destExternalPath), //the path of the class that can not be redirected
         // "PrivatePath",""+isPrivate,//the path can not be redirected since is private
          "SrcKind",kindSrc.name(),//the kind of the class at path
          "DestKind",kindDest.name(),
          //"IncompatibleClassKind",""+!headerOk,//if the path can not be redirected because of their respective kinds. This information would make no sense if I can get the kind for dest!
          "UnexpectedMembers",""+ExtractInfo.showMembers(unexpected),//methods that are not present in dest (or present but with different declared vs Interface implemented status)
          "UnexpectedImplementedInterfaces",ExtractInfo.showPaths(unexpectedInterfaces)//sort of interfaces implemented in path but not in dest, more complex for ambiguities
           );
  }
  //"ClassClash" caused by sum, renameClass, renameClassStrict, renameClass
  static Error errorClassClash(List<Ast.C> current,  List<Path> confl/*,ExtractInfo.ClassKind kindA,ExtractInfo.ClassKind kindB*/) {
    return Resources.Error.multiPartStringError("ClassClash",
       "Path",formatPathIn(current),//the path of the clash, in the rename is the path of the destination clash
       //"LeftKind",kindA.name(),//kind of left and right classes
       //"RightKind",kindB.name(),//this allows to infer if the class kinds was compatible
       //Well, is just enough to see if conflict is empty then was incompatible kinds...
       "ConflictingImplementedInterfaces",ExtractInfo.showPaths(confl)//the list of interface that define methods with same name
        );
  }
  //"MethodClash" caused by sum, renameMethod, renameClassStrict, renameClass
  static Error errorMethodClash(List<Ast.C> pathForError, Member mta, Member mtb, boolean excOk, List<Integer> pars, boolean retType, boolean thisMdf,boolean rightIsInterfaceAbstract) {
      return Resources.Error.multiPartStringError("MethodClash",
      "Path",formatPathIn(pathForError),//the path of the clash (that own  the method), in the rename is the path of the destination clash
      "Left",sugarVisitors.ToFormattedText.of(mta).replace("\n","").trim(),//implementation dependend print of the left and right methods
      "Right",sugarVisitors.ToFormattedText.of(mtb).replace("\n","").trim(),
      "LeftKind",ExtractInfo.memberKind(mta),//kind of the left/right methods
      "RightKind",(rightIsInterfaceAbstract)?"InterfaceAbstractMethod":ExtractInfo.memberKind(mtb),
      "DifferentParameters",""+ pars,//number of parameters with different types
      "DifferentReturnType",""+ !retType,//if the return types are different
      "DifferentThisMdf",""+ !thisMdf,//if the modifier for "this" is different
      "IncompatibleException",""+!excOk);//if they have an incompatible exception list
    }
  //"ParameterMismatch" caused by sumMethod
  static Error errorParameterMismatch(List<Ast.C> pathForError, Member mta, Member mtb,  boolean par, boolean mdf,boolean parNameOk) {
      return Resources.Error.multiPartStringError("ParameterMismatch",
       "Path",formatPathIn(pathForError),//the path of the clash (that own  the method), in the rename is the path of the destination clash
      "Left",sugarVisitors.ToFormattedText.of(mta).replace("\n","").trim(),//implementation dependend print of the left and right methods
      "Right",sugarVisitors.ToFormattedText.of(mtb).replace("\n","").trim(),
      "LeftKind",ExtractInfo.memberKind(mta),//kind of the left/right methods
      "RightKind",ExtractInfo.memberKind(mtb),
      "FirstParameterTypeOk",""+ par,//first parameter=return type
      "MdfOk",""+ mdf,// the modifier for "this" is  compatible
      "ParNameContainedInRight",""+ parNameOk// disjoint par names
        );//if they have an incompatible exception list
    }
  //"InvalidOnTopLevel", caused by redirect and addDocumentationOnNestedClass
  static Error errorInvalidOnTopLevel() {
    return Resources.Error.multiPartStringError("InvalidOnTopLevel");
  }
  //"MemberUnavailable", caused by most operations referring to paths and methods
  static enum MemberUnavailable{PrivatePath,PrivateMethod,NonExistentPath,NonExistentMethod}

  static Member checkExistsPathMethod(ClassB cb, List<Ast.C> path,Optional<MethodSelector>ms){
    try{
      Boolean[] isPrivateRef=new Boolean[]{false};//used in closures
      for(C c:path){if(c.isUnique()){isPrivateRef[0]=true;}}
      ClassB cbi=cb.getClassB(path);
      Boolean[] isPrivateMeth=new Boolean[]{false};
      boolean absentMeth=false;
      if(ms.isPresent()){
        Optional<Member> meth=Functions.getIfInDom(cbi.getMs(),ms.get());
        absentMeth=!meth.isPresent();
        if(meth.isPresent()){
          meth.get().match(
            nc->{throw Assertions.codeNotReachable();},
            mi->{throw Assertions.codeNotReachable();},
            mt->{if(mt.getMs().isUnique()){isPrivateMeth[0]=true;}return null;}
            );
          if(!isPrivateMeth[0]){return meth.get();}
          }
        }
      MemberUnavailable kind=null;
      if(absentMeth){kind=MemberUnavailable.NonExistentMethod;}
      if(isPrivateMeth[0]){kind=MemberUnavailable.PrivateMethod;}
      if(isPrivateRef[0]){kind=MemberUnavailable.PrivatePath;}
      if(kind==null){return null;}
      throw Resources.Error.multiPartStringError("MemberUnavailable",
          "Path",formatPathIn(path),
          "Selector",""+((ms.isPresent())?ms.get():""),
          "InvalidKind",""+kind.name(),
          "IsPrivate",""+kind.name().contains("Private"));
      }
    catch(ast.ErrorMessage.PathMetaOrNonExistant e){
      throw Resources.Error.multiPartStringError("MemberUnavailable",
          "Path",formatPathIn(path),
          "Selector",""+((ms.isPresent())?ms.get():""),
          "InvalidKind",""+MemberUnavailable.NonExistentPath,
          "IsPrivate","false");
    }
  }


  //"PathClash", caused by renameClassStrict, if two paths are prefix of one other
  public static Resources.Error errorPrefix(List<Ast.C> a, List<Ast.C> b) {
  boolean aIsLonger=a.size()>b.size();
  List<Ast.C> shorter=aIsLonger?b:a;
  List<Ast.C> longer=aIsLonger?a:b;
  return Resources.Error.multiPartStringError("PathClash",
     "Prefix",""+shorter,
     "Clashing",""+longer);}


  //"InvalidOnMember", caused by pop if there is more then one nested class
  static Error errorInvalidOnMember(Doc doc) {
    return Resources.Error.multiPartStringError("InvalidOnMember",
        "Doc",doc);
  }
  //"AmbiguousPop", caused by pop if there is more then one nested class
  static Error errorAmbiguousPop(ClassB cb) {
    return Resources.Error.multiPartStringError("AmbiguousPop",
        "numberOfNestedClasses",""+cb.getMs().size());
  }
  //"NotBox", caused by pop if the top level is not of box kind
  static Error errorNotBox(ClassB cb, List<MethodSelector> meth, Set<Path> used,ExtractInfo.ClassKind kind) {
    return Resources.Error.multiPartStringError("NotBox",
        "UsedBy",""+used,
        "Supertypes",""+cb.getSupertypes(),
        "ContainsMethods",""+meth,
        "ActualKind",""+kind.name());
  }
  public static void checkMethodClash(List<Ast.C>pathForError,MethodWithType mta, MethodWithType mtb,boolean rightIsInterfaceAbstract){
    boolean implClash=mta.get_inner()!=null && mtb.get_inner()!=null;
    boolean exc=ExtractInfo.isExceptionOk(mta,mtb);
    List<Integer> pars=ExtractInfo.isParTypeOk(mta,mtb);
    boolean retType=mta.getMt().getReturnType().equals(mtb.getMt().getReturnType());
    boolean thisMdf=mta.getMt().getMdf().equals(mtb.getMt().getMdf());
    if(!implClash && exc && pars.isEmpty() && retType && thisMdf && !rightIsInterfaceAbstract){return;}
    if(mta.get_inner()!=null){mta=mta.with_inner(new ExpCore.X(Position.noInfo,"implementation"));}
    if(mtb.get_inner()!=null){mtb=mtb.with_inner(new ExpCore.X(Position.noInfo,"implementation"));}
    throw errorMethodClash(pathForError, mta, mtb, exc, pars, retType, thisMdf,false);
  }
 /* static void checkCoherentMapping(List<PathPath> setVisited) {
    // setVisited is a set of individual redirected classes,
    // created by walking the sub-tree under each cascade redirect.
    // getPath1() is the path in the library before redirecting.
    // getPath2() is the proposed path in the redirected library.
    // We will allow many paths to be redirected into a single new path,
    // but not vice-versa.
    for(PathPath p1:setVisited){
      for(PathPath p2:setVisited){
        if(p1.equals(p2)){continue;}
        if(p1.getPath1().equals(p2.getPath1())){
          throw errorIncoherentRedirectMapping(setVisited, p1.getPath1(),p1.getPath2(),p2.getPath2());
          }
      }
    }
    return;
  }*/
  static Doc formatPathIn(List<Ast.C> path){
    //if(path.isEmpty()){return Doc.factory(Path.outer(0));}
    String res="@";
    for(Ast.C ci:path){res+="."+ci;}
    if(path.isEmpty()){res="@.\n";}
    else {res+="\n";}
    return Doc.factory(true,res);
  }
  static Doc formatPathOut(Path path){
    if(path.isPrimitive()){return Doc.factory(path);}
    assert path.outerNumber()>0;
    return Doc.factory(Path.outer(path.outerNumber()+1,path.getCBar())).withNewlineTerminator();
  }
  static Doc formatPath(Path path){
    if(path.isPrimitive()){return Doc.factory(path).withNewlineTerminator();}
    if(path.outerNumber()==0){return formatPathIn(path.getCBar());}
    return formatPathOut(path);
  }
  public static void checkCompatibleMs(List<Ast.C> pathForError,MethodWithType mem, MethodSelector dest) {
    int sizeA = mem.getMs().getNames().size();
    int sizeB = dest.getNames().size();
    if(sizeA==sizeB){return;}
    List<Integer> parsWrong=new ArrayList<>();
    int min=Math.min(sizeA,sizeB);
    int max=Math.max(sizeA,sizeB);
    for(int i=min;i<max;i++){parsWrong.add(i);}
    List<Type> ts = new ArrayList<>(mem.getMt().getTs());
    for(int i=sizeA;i<sizeB;i++){
      ts.add(ast.Ast.Type.immVoid);
      }
    if(sizeA>sizeB){
      ts=ts.subList(0, sizeB);
    }
    MethodWithType memb = mem.withMs(dest).withMt(mem.getMt().withTs(ts));
    throw errorMethodClash(pathForError, mem,memb, true, parsWrong,true, true, false);

  }
}
