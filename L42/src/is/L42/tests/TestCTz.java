package is.L42.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.opentest4j.AssertionFailedError;

import is.L42.common.CTz;
import is.L42.common.EndError;
import is.L42.common.Err;
import is.L42.common.Parse;
import is.L42.common.Program;
import is.L42.common.Program.InvalidImplements;
import is.L42.common.Program.PathNotExistent;
import is.L42.generated.Core;
import is.L42.generated.Full;
import is.L42.generated.Mdf;
import is.L42.generated.Op;
import is.L42.generated.P;
import is.L42.generated.Pos;
import is.L42.generated.S;
import is.L42.generated.ST;
import is.L42.tools.AtomicTest;
import is.L42.top.Top;
import is.L42.visitors.AuxVisitor;
import is.L42.visitors.FullL42Visitor;
import is.L42.visitors.WellFormedness.NotWellFormed;

import static is.L42.tests.TestHelpers.*;
import static is.L42.tools.General.L;
import static is.L42.tools.General.range;
import static is.L42.tools.General.unreachable;
import static is.L42.common.Err.hole;

import static org.junit.jupiter.api.Assertions.*;

public class TestCTz
extends AtomicTest.Tester{public static Stream<AtomicTest>test(){return Stream.of(new AtomicTest(()->
   plusAcc(List.of(),List.of(st("This")),"")
   ),new AtomicTest(()->
   plusAcc(List.of(st("This","k()")),List.of(st("This"),st("This","k()")),
   "This0.k()=[This0.k(), This0]")
   ),new AtomicTest(()->
   plusAcc(List.of(st("This","k()")),List.of(st("This")),
   "This0.k()=[This0, This0.k()]")

   ),new AtomicTest(()->
   plusAcc(List.of(st("This","k(a,b,c)",3)),List.of(st("This")),
   "This0.k(a,b,c).3=[This0, This0.k(a,b,c).3]")

   ),new AtomicTest(()->
   plusAcc(List.of(st(st("This"),"k(a,b,c)",3)),List.of(st("This","m()")),
   "This0.k(a,b,c).3=[Void, This0.k(a,b,c).3]")

   ),new AtomicTest(()->
   plusAcc(List.of(st("This","m()")),List.of(st("This")),
   "Void=[This0, Void]")

   ),new AtomicTest(()->
   plusAcc(List.of(st("This","k(x)")),List.of(st("This")),
   "This0=[This0]")
   ),new AtomicTest(()->
   plusAcc(List.of(st(st("This","k(x)"),"m()")),List.of(st("This")),
   "Void=[This0, Void]")
   ),new AtomicTest(()->
   plusAcc(List.of(st(st(st("This","k(x)"),"k(x)"),"m()")),List.of(st("This")),
   "Void=[This0, Void]")
   ),new AtomicTest(()->
   plusAcc(List.of(st(st("This","k(x)",1),"m()")),List.of(st("This")),
   "Any.m()=[This0, Any.m()]")
   ),new AtomicTest(()->
   plusAcc(
     L(st(Op.GT,List.of(L(st("This")),L(st("This"))))),
     L(st("This")),
   ">[This0][This0]=[This0, >[This0][This0]]")
   ),new AtomicTest(()->
   plusAcc(
     L(st(Op.LT,List.of(L(st("This")),L(st("This"))))),
     L(st("This")),
   "Void=[This0, Void]")

   ),new AtomicTest(()->
   plusAcc(
     L(st(Op.LT,List.of(L(st("This")),L(st("This")), L(st("Void"))))),
     L(st("This")),
   "Void=[This0, Void]")

   ),new AtomicTest(()->
   plusAcc(
     L(st(Op.LT,List.of(L(st("This")),L(st("This")), L(st("Any"))))),
     L(st("This")),
   "<[This0][This0][Any]=[This0, <[This0][This0][Any]]")

   ),new AtomicTest(()->
   plusAcc(
     L(st(Op.LTEqual,List.of(L(st("This")),L(st("This")), L(st("Any"))))),
     L(st("This")),
   "Void=[This0, Void]")

   ),new AtomicTest(()->
   plusAcc(
     L(st(Op.LTEqual,List.of(L(st("This")),L(st("This")), L(st("Void"))))),
     L(st("This")),
   "Void=[This0, Void]")


  ));}
//TODO: use handlers to check that minimize is called only the minimum amount of times
static Program p=Program.parse("""
  {
   method Void m()
   method This k(Any x)
   method Void #lt0(This a)
   method Void #lt0(This a,Void b)
   method Void #ltequal0(This a,Any b)
   #norm{}}
  """);
public static ST st(String t){
  P p=P.parse(t);
  return new Core.T(Mdf.Immutable,L(),p);
  }
public static ST st(ST st,String s){return new ST.STMeth(st,S.parse(s),-1);}
public static ST st(String st,String s){return st(st(st),s);}
public static ST st(ST st,String s,int i){return new ST.STMeth(st,S.parse(s),i);}
public static ST st(String st,String s,int i){return st(st(st),s,i);}

public static ST st(Op op, List<List<ST>> stzs){return new ST.STOp(op,stzs);}
public static void plusAcc(List<ST> stz,List<ST> stz1,String out){
  CTz ctz=new CTz();
  ctz.plusAcc(p, new ArrayList<>(stz),new ArrayList<>(stz1));
  assertEquals(out,ctz.toString());
  }

public static void topFail(Class<?> kind,String program,String ...output){
  //checkFail(()->new Top().top(L(),Program.parse(program)), output, kind);
  }
}