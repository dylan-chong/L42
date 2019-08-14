grammar L42;
@header {package is.L42.generated;}
CastOp: '<:';
Uop: '!' | '~';
OP0: '^' | ':' | '<-' | '<<' | '++' | '--' | '**'; // right associative
OP1: '+' | '-' | '*' | '/'  | '>>' | '->'; // left associative 
OP2: '==' | '<' | '>' | '>=' | '<=' | '!='; // unassiociative //InKw need to be added in the usage sites
OP3: '=>' | '&&' | '||'; // right associative, will be short circuting
OpUpdate: ':=' | '^=' | '<-=' | '<<=' | '+=' | '-=' | '*=' | '/=' | '++=' | '--=' | '**=' | '>>=' | '->=';
Mdf: 'fwd mut' | 'fwd imm' |'imm' | 'mut' | 'lent' | 'read' | 'capsule' | 'class';
VoidKW:'void';
VarKw:'var';
Info:('#norm{' | '#typed{') CHARDocText* '}';
CatchKw: 'catch';
InterfaceKw:'interface';
IfKw:'if';
ElseKw:'else';
WhileKw:'while';
ForKw:'for';
InKw:'in';
LoopKw: 'loop';
Throw: 'return'|'error'|'exception';
WhoopsKw: 'whoops';
MethodKw: 'method';
DotDotDot:'...';
Slash:'\\';
slash: Slash;
PathSel: '\''FPathSel;
pathSel: PathSel;

fragment IdUp: '_'* ('A'..'Z'|'$');
fragment IdLow: '_'* 'a'..'z';
fragment IdChar: 'a'..'z' | 'A'..'Z' | '$' | '_' | '0'..'9';
fragment CHAR:
'A'..'Z'|'a'..'z'|'0'..'9' | '(' | ')' | '[' | ']' | '<' | '>' |'&'|'|'|'*'|'+'|'-'|'=' | '/' | '!' | '?' | ';' | ':' | ',' | '.' | ' ' | '~' | '@' | '#' | '$' | '%' | '`' | '^' | '_' | '\\' | '{' | '}' | '"' | '\'' | '\n';
fragment CHARInStringSingle:
'A'..'Z'|'a'..'z'|'0'..'9' | '(' | ')' | '[' | ']' | '<' | '>' |'&'|'|'|'*'|'+'|'-'|'=' | '/' | '!' | '?' | ';' | ':' | ',' | '.' | ' ' | '~' | '@' | '#' | '$' | '%' | '`' | '^' | '_' | '\\' | '{' | '}' |         '\'';//no \n and "
fragment CharsUrl:
'A'..'Z'|'a'..'z'|'0'..'9' | '(' | ')' | '<' | '>' |'&'|'|'|'*'|'+'|'-'|'=' | '/' | '!' | '?' | ';' | ':' | ',' | '.' | ' ' | '~' | '@' | '#' | '$' | '%' | '`' | '^' | '_' | '\\'  ;
fragment CHARDocText:
'A'..'Z'|'a'..'z'|'0'..'9' | '(' | ')' | '[' | ']' | '<' | '>' |'&'|'|'|'*'|'+'|'-'|'=' | '/' | '!' | '?' | ';' | ':' | ',' | '.' | ' ' | '~' | '#' | '$' | '%' | '`' | '^' | '_' | '\\' | '"' | '\'' | '\n'; //no {}@
fragment URL:CharsUrl+;
ReuseURL:'reuse' Whitespace* '['URL']';
NativeURL:'native' Whitespace* '['URL']';
fragment Fn: '0' | '1'..'9' ('0'..'9')*;
fragment Fx: IdLow IdChar*;
StringSingle: '"' CHARInStringSingle* '"';
string: StringSingle;//TODO: will also match multilineStr and interpolation
Number : '0'..'9' ('.'|'_'|'-'|'0'..'9')*;
MUniqueNum: Fx('#' Fx)*'::'Fn;
MHash: ('#$' | '#'+)? Fx('#' Fx)* ('::'Fn)?;
X:  Fx;
SlashX:'\\'Fx;
slashX:SlashX;
m: MUniqueNum|MHash|X;
x: X;
CsP: C(ClassSep C)*;
ClassSep: '.';
fragment C: IdUp ('A'..'Z'|'$'|'a'..'z'|'0'..'9')*;
UnderScore:'_';//need to be not earlier then here, after X and CsP
OR:' ('| ',(' | '\n(';
ORNS:'(';
Doc: '@'FPathSel | '@'FPathSel?'{'DocText'}';
fragment FS:(MUniqueNum|MHash|X) FParXs;
fragment FParXs: '(' ')' | '(' X ( (' '|',')X )* ')';
fragment FPathSel: FS('.'X)? |FParXs('.'X)? | CsP( ('.'FS|FParXs)('.'X)? )?;
fragment DocText: | CHARDocText DocText | Doc DocText | '{' DocText '}' DocText;
doc:Doc;

BlockComment: '/*' (BlockComment|.)*? '*/'	-> channel(HIDDEN) ; // nesting comments allowed
LineComment: '//' .*? ('\n'|EOF)				-> channel(HIDDEN) ;
Whitespace: (( ' ' | ',' | '\n' )+)-> channel(HIDDEN);

csP: CsP;
t:Mdf? doc* csP;
tLocal: t | Mdf | ; 

eAtomic: x | csP | voidE | fullL | block | slash | pathSel | slashX;
fullL:'{' (header | DotDotDot | ReuseURL) fullM* info? doc*'}';
fullM: fullF | fullMi |fullMWT | fullNC;
fullF: doc* VarKw? t x;
fullMi: doc* MethodKw mOp oR x* ')' '=' e;
fullMWT: doc* fullMH ('=' NativeURL? e)?;
fullNC:  doc* csP '=' e;
header: InterfaceKw? ('['t+']')?;
info: Info;

fullMH: (Mdf doc*)? MethodKw t mOp oR (t x)* ')' ('['t+']')?;
mOp: | m | Uop | OP0 | OP1 | OP2 | OP3;
voidE: VoidKW;
ePostfix: eAtomic (fCall | squareCall | string | cast)*;
fCall: ('.'m)? ORNS par ')';
squareCall: ('.'m)? '[' (par';')* par ']';
cast: CastOp t;
oR: OR |ORNS;
par: e? (x'='e)*;
block: oR d*? e ')' | oR d+ k* whoops? (d* e)? ')' | '{' d+ (k+ whoops? d* | whoops d*)? '}';
d: (dX '=')? e;
dX:VarKw? tLocal x | tLocal UnderScore | tLocal oR (VarKw? tLocal x)+ ')';
k: CatchKw Throw? t x e | CatchKw Throw? t UnderScore e;
whoops: WhoopsKw t+;
eUnary: (Uop|Number)* ePostfix;

eBinary0: eUnary (OP0 eUnary)*;
eBinary1: eBinary0 (OP1 eBinary0)*; //left associative, all op the same
eBinary2: eBinary1 ((OP2|InKw) eBinary1)*; //unassociative, all op the same, thus a<b<c could be resolved as a.#left#1(center:b,right:c)
eBinary3: eBinary2 (OP3 eBinary2)*; //left associative, all op the same
statement: sIf | sWhile | sFor | sLoop | sThrow | sUpdate;
sIf: IfKw e e (ElseKw e)? | IfKw match+ e;
match: t x | t x '=' e | t? oR (t? x)+')' '=' e;
sWhile: WhileKw e e;
sFor: ForKw (dX InKw e)+ e;
sLoop: LoopKw e;
sThrow:Throw e;
sUpdate: x OpUpdate e;
e: statement | eBinary3;

nudeE: e EOF;