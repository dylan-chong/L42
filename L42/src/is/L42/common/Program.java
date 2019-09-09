package is.L42.common;

import static is.L42.tools.General.L;
import static is.L42.tools.General.bug;
import static is.L42.tools.General.popL;
import static is.L42.tools.General.range;
import static is.L42.tools.General.toOneOr;
import static is.L42.tools.General.todo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import is.L42.generated.C;
import is.L42.generated.CT;
import is.L42.generated.Core;
import is.L42.generated.Core.Doc;
import is.L42.generated.Core.T;
import is.L42.generated.Full;
import is.L42.generated.Half;
import is.L42.generated.LL;
import is.L42.generated.Mdf;
import is.L42.generated.Op;
import is.L42.generated.P;
import is.L42.generated.Pos;
import is.L42.generated.S;
import is.L42.generated.ST;
import is.L42.visitors.CloneVisitor;
import is.L42.visitors.CollectorVisitor;
import is.L42.visitors.Visitable;

public class Program implements Visitable<Program>{
  @Override public Program accept(CloneVisitor v) {return v.visitProgram(this); }
  @Override public void accept(CollectorVisitor v) {v.visitProgram(this);}
  @Override public boolean wf() {return Constants.wf.test(this);}
  @Override public String toString() {return Constants.toS.apply(this);}
  public final LL top;
  public final PTails pTails;
  public Program(LL top,PTails pTails){this.top=top;this.pTails=pTails;}
  public static Program flat(LL top){return new Program(top,PTails.empty);}
  public static final Core.L emptyL=new Core.L(L(),false,L(),L(),L(),Core.L.Info.empty,L());
  public static final Core.L emptyLInterface=emptyL.withInterface(true);
  public LL of(P path){
    if(path==P.pAny){return emptyLInterface;}
    if(path==P.pVoid){return emptyL;}
    if(path==P.pLibrary){return emptyL;}
    return this.pop(path.toNCs().n()).top.cs(path.toNCs().cs());
    }
  public Program pop(int n){
    assert n>=0;
    if(n==0){return this;}
    return this.pop().pop(n-1);
    }
  public Program pop(){
    if(!pTails.hasC()){return new Program(pTails.coreL(),pTails.tail());}
    var newTop=pTails.ll().withCs(L(pTails.c()),
      nc->nc.withE(pTails.ll()),
      nc->nc.withL((Core.L)pTails.ll())
      );
    return new Program(newTop,pTails.tail());
    }
  public Program push(C c,LL ll){return new Program(ll,pTails.pTailC(c, top));}
  public Program push(LL ll){return new Program(ll,pTails.pTailSingle((Core.L)top));}
  public Program push(C c){return push(c,top.c(c));}
  public Program update(LL ll){return new Program(ll,pTails);}
  public Program navigate(P.NCs p){
    Program res=this.pop(p.n());
    for(C c:p.cs()){res=res.push(c);}
    return res;
    }
  public P from(P p,P.NCs source){
    if(!p.isNCs()){return p;}
    return from(p.toNCs(),source);
    }
  public P.NCs from(P.NCs p,P.NCs source){
    assert minimize(source)==source;
    int k=source.cs().size();
    int m=source.n();
    int n=p.n();
    var cs=p.cs();
    if(n>=k){return minimize(P.of(m+n-k, cs));}
    if(n==0 && cs.isEmpty()){return source;}//optimization
    List<C> resCs=L(c->{
      c.addAll(source.cs().subList(0, k-n));
      c.addAll(cs);
      });
    var res=P.of(m,resCs);
    assert res==minimize(res):
      res+" "+minimize(res);
    return res;
    }
  public Core.E from(Core.E e,P.NCs source){
    assert minimize(source)==source;
    return fromVisitor(source).visitE(e);
    }
  private CloneVisitor fromVisitor(P.NCs source){
    return new CloneVisitor(){//no need to override visitT(Half.T)
      @Override public ST visitSTMeth(ST.STMeth stMeth){
        return minimize(super.visitSTMeth(stMeth));
        }
     @Override public ST visitSTOp(ST.STOp stOp){ 
        return minimize(super.visitSTOp(stOp));
        }
      @Override public Core.T visitT(Core.T  t){
        return t.withP(from(t.p(),source));
        }
      @Override public P visitP(P p){
        return from(p,source);
        }
      @Override public Full.L visitL(Full.L l){throw bug();}
      @Override public Core.L visitL(Core.L l){
        return new From(Program.this,source,0).visitL(l);
        }
      };
    }
  public T from(T t,P.NCs source){return fromVisitor(source).visitT(t);}
  public Core.MH from(Core.MH mh,P.NCs source){return fromVisitor(source).visitMH(mh);}
  public List<T> from(List<T> ts,P.NCs source){return fromVisitor(source).visitTs(ts);}

  public List<CT> fromCTz(List<CT>ctz,P.NCs source){return L(ctz,ct->from(ct,source));}
  public CT from(CT ct,P.NCs source){
    assert minimize(source)==source;
    var v=fromVisitor(source);
    return ct.withSt(v.visitST(ct.st())).withT(v.visitT(ct.t()));
    }
  public List<T> collect(P.NCs p){
    LL l=of(p);
    if(!l.isFullL()){return from(((Core.L)l).ts(),p);}
    Full.L fl=(Full.L)l;
    return collect(L(fl.ts(),(c,t)->c.add(from(toCore(t),p))));
    }   
  public List<T> collect(List<T> ts){
    if(ts.isEmpty()){return ts;}
    T t0=ts.get(0);
    ts=popL(ts);
    var recRes=collect(ts);
    var ll=of(t0.p());
    if(!ll.isFullL()){return L(c->{
      if(!recRes.contains(t0)){c.add(t0);}
      for(var ti:((Core.L)ll).ts()){
        T tif=from(ti,t0.p().toNCs());
        if(!recRes.contains(tif)){c.add(tif);}        
        }
      c.addAll(recRes);
      });}
    Full.L l=(Full.L)ll;
    List<T> ts0=L(l.ts(),(c,ti)->from(toCore(ti),t0.p().toNCs()));
    List<T> ts1=collect(ts0);
    return L(c->{//is not worth to remove this 6 lines dup
      if(!recRes.contains(t0)){c.add(t0);}
      for(var ti:ts1){
        if(!recRes.contains(ti)){c.add(ti);}        
        }
      c.addAll(recRes);
      });
    }
  public boolean isSubtype(Stream<P> subPs,P superP){
    return subPs.allMatch(p->isSubtype(p, superP));
    }
  public boolean isSubtype(Stream<T> subTs,T superT){
    return subTs.allMatch(t->isSubtype(t, superT));
    }
  public boolean isSubtype(T subT,T superT){
    if(!isSubtype(subT.mdf(),superT.mdf())){return false;}
    return isSubtype(subT.p(),superT.p());
    }
  public boolean isSubtype(P subP,P superP){
    assert minimize(subP)==subP;
    assert minimize(superP)==superP;
    if(superP==P.pAny){return true;}
    if(subP.equals(superP)){return true;}
    P.NCs subP0=subP.toNCs();
    if(!subP.isNCs()){return false;}
    if(!superP.isNCs()){return false;}
    for(T ti:collect(subP0)){
      P pi=from(ti.p(),subP0);
      assert minimize(pi)==pi;
      if(pi.equals(superP)){return true;}
      } 
    return false;
    }
  public boolean isSubtype(Mdf subM,Mdf superM){
    if(subM==superM){return true;}
    switch(subM){
      case Class:        return false;
      case Capsule:      return superM!=Mdf.Class;
      case Immutable:    return superM.isIn(Mdf.Readable,Mdf.ImmutablePFwd,Mdf.ImmutableFwd);//imm<=read,fwd%Imm //,fwdImm
      case Mutable:      return superM.isIn(Mdf.Lent,Mdf.MutablePFwd,Mdf.Readable,Mdf.MutableFwd);//mut<=lent,fwd%Mut //,read,fwdMut
      case Lent:         return superM==Mdf.Readable;//lent<=read
      case MutablePFwd:  return superM==Mdf.MutableFwd;//fwd%Mut<=fwdMut
      case ImmutablePFwd:return superM==Mdf.ImmutableFwd;//fwd%Imm<=fwdImm
      default: return false;
      }
    }
  @SuppressWarnings("serial")
  public static class InvalidImplements extends EndError{
    public InvalidImplements(List<Pos> poss, String msg) { super(poss, msg);}
    }
  public P origin(S s, P.NCs p) throws InvalidImplements{
    List<T> origins=L(collect(p.toNCs()),(c,t)->{
      if(!refine(s,t.p().toNCs())){c.add(t);}
      });
    if(origins.size()==1){return origins.get(0).p();}
    throw new InvalidImplements(of(p).poss(),
      Err.moreThenOneMethodOrigin(s,origins));
    }
  public boolean refine(S s, P.NCs p){
    for(T t:collect(p)){
      if(of(t.p()).dom().contains(s)){return true;}
      }
    return false;
    }
  public Core.MH toCore(Full.MH mh){
    Mdf mdf=mh._mdf();
    if(mdf==null){mdf=Mdf.Immutable;}
    List<Doc> docs=L(mh.docs(),(c,d)->c.add(toCore(d)));
    T t=toCore(mh.t());
    S s=mh.key();
    List<T> pars=L(mh.pars(),(c,ti)->c.add(toCore(ti)));
    List<T> exceptions=L(mh.exceptions(),(c,ti)->c.add(toCore(ti)));
    return new Core.MH(mdf, docs, t, s, pars, exceptions);
    }
  public T toCore(Full.T t){
    Mdf mdf=t._mdf();
    if(mdf==null){mdf=Mdf.Immutable;}
    List<Doc> docs=L(t.docs(),(c,d)->c.add(toCore(d)));
    if (t._p()!=null){return new T(mdf,docs,minimize(t._p()));}
    int n=findScope(t.cs().get(0),0);
    return new T(mdf,docs,minimize(P.of(n, t.cs())));
    }
    private int findScope(C c, int acc){
      if(top.dom().contains(c)){return acc;}
      if(pTails.isEmpty()){return acc;}
      assert top.isFullL();
      for(Full.Doc d:((Full.L)top).docs()){
        if(d.texts().size()!=1){continue;}
        if(d.texts().get(0).equals("__STOP_SCOPE__")){return acc;}
      }
      return pop().findScope(c, acc+1);
      }
  public Core.Doc toCore(Full.Doc doc){
    List<Doc> docs=L(doc.docs(),(c,d)->c.add(toCore(d)));
    return new Core.Doc(_toCore(doc._pathSel()),doc.texts(), docs);
    }
  public Core.PathSel _toCore(Full.PathSel _p){
    if(_p==null){return null;}
    if(_p._p()==null && _p.cs().isEmpty()){
      return new Core.PathSel(P.coreThis0.p(),_p._s(),_p._x());
      }
    assert _p._p()==null ||_p.cs().isEmpty();
    if(_p._p()!=null){
      return new Core.PathSel(_p._p(),_p._s(),_p._x());
      }
    int n=findScope(_p.cs().get(0),0);   
    return new Core.PathSel(P.of(n,_p.cs()),_p._s(),_p._x());
    }

  public List<Full.L.M>expandFields(List<Full.L.M> ms){
    return L(ms,(c,m)->{
      if(m instanceof Full.L.NC){return;}
      if(!(m instanceof Full.L.F)){c.add(m);return;}
      Full.L.F f=(Full.L.F)m;
      Core.T t=toCore(f.t());
      Core.T tr=TypeManipulation._toRead(t);
      assert tr!=null;
      //TODO:
      });
    }
    /*
_______
#define expandFields(Ms)=Ms' //need to keep the order
* expandFields(empty)=empty
* expandFields(NC,Ms)=expandFields(Ms) 
* expandFields(M,Ms)=M,expandFields(Ms) 
    M of form MWT or MI
* expandFields(T x,Ms)=read method T x(), expandFields(Ms)
    T = toRead(T)
* expandFields(T x,Ms)=mut method capsuleToLent(T) #x(), expandFields(toRead(T) x,Ms)
    T != toRead(T) // TODO: should we use capsuleToMut(T) instead? I'm really on the fence
* expandFields(var T x,Ms)=mut method Void x(T that), expandFields(T x,Ms)        
*/


  List<Core.MH> methods(P p){//bodies can be recovered later
    if(!p.isNCs()){return L();}
    P.NCs p0=p.toNCs();
    LL ll=of(p0);
    if(!ll.isFullL()){
      return L(((Core.L)ll).mwts(),(c,m)->c.add(from(m.mh(),p0)));
      }
    Full.L l=(Full.L)ll;
    
    return L();
    }
/*
_______
#define methods(p,P0)=MWTs //methods returns a set: the order of the methods is not relevant
* methods(p,P0)=CORE.L.MWTs[from P0;p]
    p(P0)=CORE.L
* methods(p,P0)=MWT1..MWTn //method headers are minimized, not the body
    p(P0)=interface? Ts{ Ms0 }=FULL.L
    Ms=expandFields(Ms0)
    Ps=collect(p,Ts[from P0;p]).Ps
    s1..sn=[ss | P in Ps, ss = expandFields(p(T.P).Ms).ss].flatten().distinct()//an ordered version of {s | P in Ps, s in expandFields(p(P).Ms).ss}
    origin(p;s1,P0)..origin(p;sn,P0) all defined
    [Mi,_]=[MWT| MWT in Ms and MWT.s=si],[MWT| P in Ps such that methods(p,P)(si)=MWT]   for i in 1..n
    MWTi=p♥Mi[with e=e[from P0;p]] if si in p(P0) and P(P0)(s).e?=e
    MWTi=p♥Mi otherwise //this p♥ must also handle method Docs

*/

  public P minimize(P path){
    if(!path.isNCs()){return path;}
    return minimize(path.toNCs());
    }    
  public P.NCs minimize(P.NCs path){
    if(path.n()==0){return path;}
    if(path.n()==1){return baseMinimize(path);}
    var pathLess1=path.withN(path.n()-1);
    P.NCs tmp=pop().minimize(pathLess1).toNCs();
    if(pathLess1==tmp){tmp=path;}
    else{tmp=tmp.withN(tmp.n()+1);}
    if(tmp.n()==1){return baseMinimize(tmp);}
    return tmp;
    }
  private P.NCs baseMinimize(P.NCs p) {
    assert !pTails.isEmpty();
    if(p.cs().isEmpty()){return p;}
    if(!pTails.hasC()){return p;}
    if(!pTails.c().equals(p.cs().get(0))){return p;}
    return P.of(p.n()-1,popL(p.cs()));
    }
  public ST minimize(ST st){
    throw todo();//TODO:
    }
  public List<ST> minimize(List<ST>stz){
    throw todo();//TODO:
    //requires
    //opOptions
    //chooseT
    //toCore
    //subtype
    }
  public T _chooseT(List<T> ts){
    Mdf _mdf=_mostGeneralMdf(ts.stream().map(t->t.mdf()).collect(Collectors.toSet()));
    if(_mdf==null){return null;}
    var ps=L(ts.stream().map(t->t.p()).filter(p->isSubtype(ts.stream().map(t->t.p()),p)));
    if(ps.size()!=1){return null;}
    return new T(_mdf,L(),ps.get(0));
    }
  private Mdf _mostGeneralMdf(Set<Mdf> mdfs){
    if (mdfs.size()==1){return mdfs.iterator().next();}
    if (mdfs.contains(Mdf.Class)){return null;}
    if (mdfs.contains(Mdf.Capsule) && mdfs.size()==2){
      var i = mdfs.iterator();
      Mdf m=i.next();
      if(m==Mdf.Capsule){m=i.next();}
      assert m!=Mdf.Capsule;
      return m;
      }
    if(TypeManipulation.fwd_or_fwdP_inMdfs(mdfs.stream())){
      if (mdfs.contains(Mdf.Readable)){return null;}
      if (mdfs.contains(Mdf.Lent)){return null;}
      boolean mutIn=false;
      boolean immIn=false;
      for(Mdf m:mdfs){
        if(Mdf.muts.contains(m)){mutIn=true;}
        if(Mdf.imms.contains(m)){immIn=true;}
        }
      if (mutIn && immIn){return null;}
      //we know: more then one, no read/lent, either all imm side or mut side
      if(mdfs.contains(Mdf.ImmutableFwd)){return Mdf.ImmutableFwd;}
      if(mdfs.contains(Mdf.ImmutablePFwd)){return Mdf.ImmutablePFwd;}
      if(mdfs.contains(Mdf.MutableFwd)){return Mdf.MutableFwd;}
      assert mdfs.contains(Mdf.MutablePFwd): mdfs;
      return Mdf.MutablePFwd;
      }
    //if read in mdfs, mdf=read
    if(mdfs.contains(Mdf.Readable)){return Mdf.Readable;}
    if(mdfs.contains(Mdf.Immutable)){return Mdf.Readable;}
    return Mdf.Lent;
    }
  public static class Psi{P p; S s; int i;}
  public List<Psi> opOptions(Op op, List<T>ts){
    return L(c->{for(int i:range(ts)){
      P pi=ts.get(i).p();
      //this.methods(pi)
      }});
    }

  public static Program parse(String s){
    var r=Parse.program("-dummy-",s);
    assert !r.hasErr():r.errorsParser+" "+r.errorsTokenizer+" "+r.errorsVisitor;
    assert r.res.wf();
    return r.res;
    }
  }