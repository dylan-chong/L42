package ast;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import ast.Ast.Mdf;
import lombok.Value;
import lombok.experimental.Wither;
import l42FVisitors.Visitor;

public class L42F {
public static interface Kind{}
public static enum SimpleKind implements Kind{
Class, Interface, NativeInt32, NativeString, NativeFloat32;
}
@Value @Wither public static class
CD{programReduction.Program p; Kind kind; int cn; List<String>dbgName; List<Integer> cns; List<M> ms;
  public String dbgName() {
    StringBuilder b=new StringBuilder();
    tools.StringBuilders.formatSequence(b, dbgName.iterator(), "£C",s->b.append(s));
    b.append("£Id"+cn);
    return b.toString();
    }
  }

@Value @Wither public static class
TX{T t; String x;}

@Value @Wither public static class
M{
  boolean refine; T returnType;
  Ast.MethodSelector selector; List<TX> txs; Body body;
  }
public static interface Body{}
public static enum SimpleBody implements Body{
  Empty,Setter,Getter,New,NewWithFwd,NewFwd,NativeIntSum;
  }
public static interface E extends Body{
  <T> T accept(Visitor<T> v);
  }

@Value @Wither public static class
Block implements E{ List<D> ds; List<K> ks; E e; T type;
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
X implements E{String inner;
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
Cn implements E{int inner;
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}
  public static final Cn cnAny=new Cn(0);
  public static final Cn cnVoid=new Cn(1);
  public static final Cn cnLibrary=new Cn(2);
  public static final Cn cnResource=new Cn(3);
  }

@Value @Wither public static class
_void implements E{
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}
@Value @Wither public static class
Null implements E{
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
BreakLoop implements E{
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
Throw implements E{Ast.SignalKind kind; String x; T tContext;
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
Loop implements E{E inner;
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
Call implements E{
  int cn; Ast.MethodSelector ms;
  List<String> xs;
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
Use implements E{
  int cn; Ast.MethodSelector ms;
  List<String> xs; E inner;
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
If implements E{
  String condition; E then; E _else;
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
Update implements E{String x1; String x2;
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
Cast implements E{T t; String x;
  @Override public <T> T accept(Visitor<T> v){return v.visit(this);}}

@Value @Wither public static class
K {Ast.SignalKind kind; T t; String x; E e;}

@Value @Wither public static class
D {boolean var; T t; String x; E e;}
@Value @Wither public static class
T {Ast.Mdf mdf; int cn;
  public static final T immAny=new T(Mdf.Immutable,Cn.cnAny.inner);
  public static final T immVoid=new T(Mdf.Immutable,Cn.cnVoid.inner);
  public static final T immLibrary=new T(Mdf.Immutable,Cn.cnLibrary.inner);
  public static final T classAny=new T(Mdf.Class,Cn.cnAny.inner);
  }
}
