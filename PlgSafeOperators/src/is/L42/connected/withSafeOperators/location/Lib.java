package is.L42.connected.withSafeOperators.location;

public class Lib implements Location{
  @Override Lib location(){return null;}
  int nestedsSize(){}
method This nested(Size that)
method
List nesteds()
  List[with i in Count(this.nestedSize()) (use[this.nested(i)])]
List allNesteds()
  List[this]++
  List[with nc in this.nesteds().vals() (
    with nci in nc.allNesteds().vals() (use[nci])
  )]
method Lib nested(Path path) exception NotAvailable (
  with ni in this.root().allNested().vals() (
    if ni.path()==path (return ni)
    )
  exception NotAvailable"Path "[path]"not present"
  )
method Bool has(Path path) (
  unused=this.nested(path:path)
  catch exception NotAvailable Bool.false()
  Bool.true()
  )
      
method Size methodsSize()
method Method method(Size that)
Method.List methods()
  Method.List[with i in Count(this.methodsSize()) (use[this.method(i)])]

method Method method(Selector selector) exception NotAvailable (
  with mi in this.methods() (
    if mi.selector()==selector (return mi)
    )
  exception NotAvailable"Selector "[selector]"not present"
  )
method Bool has(Selector selector) (
  unused=this.method(selector:selector)
  catch exception NotAvailable Bool.false()
  Bool.true()
  )      
method Size implementedsSize()
method Type.Implemented implemented(Size that)
method
Type.Implemented.List implementeds()
  Type.Implemented.List[with i in Count(this.implementedsSize()) (use[this.implemented(i)])]

method Bool implements(class Any clazz){
  if Refactor.equalsClassObj(Any, and:clazz) (
    return Bool.True()
    ) 
   with ti in this.implementeds().vals() (
     with ri=ti.refTo() (
       on Type.RefTo.Binded (
         ci=ri.referredClassObj()
         if Refactor.equalsClassObj(ci, and:clazz) (
          //no need of supertypes since normalized classes has transitive implements already
          return Bool.True()
          )
         )
       )
     )
   return Bool.false()
   }
method Bool implements(Path path) {
   with ti in this.implementeds().vals() (
     with ri=ti.refTo() (
       on Type.RefTo.Lib (
         libi=ri.referredLib()
         if path==libi.path() (
           return Bool.true()
           )
         )
       )
     )
   return Bool.false()
   }   

method Doc doc()
method S kindS()
Kind:Enum"..."
method
Bool isInterface()
  this.kindS()==S"Interface"
Bool isCoherent()
  this.isInterface() | this.kindS()==S"CoherentClass"
$This:MiniData.thisLib()
List:Collection.vector(of:$This)

method Lib root()
method Path path()//last is its name, empty path for root
method Doc nestedDoc()//empty doc if it is root
//even if obtained with a classObj, no method to get it back
//to get a nested classObj, Refactor.navigateClassObj(classAny,Path)->classAny??
}

}