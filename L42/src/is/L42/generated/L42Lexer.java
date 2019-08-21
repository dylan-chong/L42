// Generated from L42.g4 by ANTLR 4.7.2
package is.L42.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L42Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, CastOp=8, Uop=9, 
		OP0=10, OP1=11, OP2=12, OP3=13, OpUpdate=14, Mdf=15, VoidKW=16, VarKw=17, 
		Info=18, CatchKw=19, InterfaceKw=20, IfKw=21, ElseKw=22, WhileKw=23, ForKw=24, 
		InKw=25, LoopKw=26, Throw=27, WhoopsKw=28, MethodKw=29, DotDotDot=30, 
		Slash=31, PathSel=32, ReuseURL=33, NativeURL=34, StringSingle=35, Number=36, 
		MUniqueNum=37, MHash=38, X=39, SlashX=40, CsP=41, ClassSep=42, UnderScore=43, 
		OR=44, ORNS=45, Doc=46, BlockComment=47, LineComment=48, Whitespace=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "CastOp", "Uop", 
			"OP0", "OP1", "OP2", "OP3", "OpUpdate", "Mdf", "VoidKW", "VarKw", "Info", 
			"CatchKw", "InterfaceKw", "IfKw", "ElseKw", "WhileKw", "ForKw", "InKw", 
			"LoopKw", "Throw", "WhoopsKw", "MethodKw", "DotDotDot", "Slash", "PathSel", 
			"IdUp", "IdLow", "IdChar", "CHAR", "CHARInStringSingle", "CharsUrl", 
			"CHARDocText", "URL", "ReuseURL", "NativeURL", "Fn", "Fx", "StringSingle", 
			"Number", "MUniqueNum", "MHash", "X", "SlashX", "CsP", "ClassSep", "C", 
			"UnderScore", "OR", "ORNS", "Doc", "FS", "FParXs", "FPathSel", "DocText", 
			"BlockComment", "LineComment", "Whitespace"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "')'", "'='", "'['", "']'", "';'", "'<:'", null, 
			null, null, null, null, null, null, "'void'", "'var'", null, "'catch'", 
			"'interface'", "'if'", "'else'", "'while'", "'for'", "'in'", "'loop'", 
			null, "'whoops'", "'method'", "'...'", "'\\'", null, null, null, null, 
			null, null, null, null, null, null, "'.'", "'_'", null, "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "CastOp", "Uop", "OP0", 
			"OP1", "OP2", "OP3", "OpUpdate", "Mdf", "VoidKW", "VarKw", "Info", "CatchKw", 
			"InterfaceKw", "IfKw", "ElseKw", "WhileKw", "ForKw", "InKw", "LoopKw", 
			"Throw", "WhoopsKw", "MethodKw", "DotDotDot", "Slash", "PathSel", "ReuseURL", 
			"NativeURL", "StringSingle", "Number", "MUniqueNum", "MHash", "X", "SlashX", 
			"CsP", "ClassSep", "UnderScore", "OR", "ORNS", "Doc", "BlockComment", 
			"LineComment", "Whitespace"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public L42Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L42.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0295\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u00a2\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u00a9\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b4\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u00bc\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00df\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0109\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0121\n\23\3\23\7\23\u0124"+
		"\n\23\f\23\16\23\u0127\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u0169\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\7\"\u0183\n\"\f"+
		"\"\16\"\u0186\13\"\3\"\3\"\3#\7#\u018b\n#\f#\16#\u018e\13#\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\6)\u019d\n)\r)\16)\u019e\3*\3*\3*\3*\3"+
		"*\3*\3*\7*\u01a8\n*\f*\16*\u01ab\13*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\7+\u01b9\n+\f+\16+\u01bc\13+\3+\3+\3+\3+\3,\3,\3,\7,\u01c5\n,\f,\16"+
		",\u01c8\13,\5,\u01ca\n,\3-\3-\7-\u01ce\n-\f-\16-\u01d1\13-\3.\3.\7.\u01d5"+
		"\n.\f.\16.\u01d8\13.\3.\3.\3/\3/\7/\u01de\n/\f/\16/\u01e1\13/\3\60\3\60"+
		"\3\60\7\60\u01e6\n\60\f\60\16\60\u01e9\13\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\61\3\61\3\61\6\61\u01f3\n\61\r\61\16\61\u01f4\5\61\u01f7\n\61\3\61"+
		"\3\61\3\61\7\61\u01fc\n\61\f\61\16\61\u01ff\13\61\3\61\3\61\3\61\3\61"+
		"\5\61\u0205\n\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0210"+
		"\n\64\f\64\16\64\u0213\13\64\3\65\3\65\3\66\3\66\7\66\u0219\n\66\f\66"+
		"\16\66\u021c\13\66\3\67\3\67\38\38\38\38\38\38\58\u0226\n8\39\39\3:\3"+
		":\3:\3:\5:\u022e\n:\3:\3:\3:\3:\5:\u0234\n:\3;\3;\3;\5;\u0239\n;\3;\3"+
		";\3<\3<\3<\3<\3<\3<\7<\u0243\n<\f<\16<\u0246\13<\3<\3<\5<\u024a\n<\3="+
		"\3=\3=\5=\u024f\n=\3=\3=\3=\5=\u0254\n=\3=\3=\3=\3=\5=\u025a\n=\3=\3="+
		"\5=\u025e\n=\5=\u0260\n=\5=\u0262\n=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\5>\u0270\n>\3?\3?\3?\3?\3?\7?\u0277\n?\f?\16?\u027a\13?\3?\3?\3?\3"+
		"?\3?\3@\3@\3@\3@\7@\u0285\n@\f@\16@\u0288\13@\3@\5@\u028b\n@\3@\3@\3A"+
		"\6A\u0290\nA\rA\16A\u0291\3A\3A\4\u0278\u0286\2B\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C\2E\2G\2I\2K\2"+
		"M\2O\2Q\2S#U$W\2Y\2[%]&_\'a(c)e*g+i,k\2m-o.q/s\60u\2w\2y\2{\2}\61\177"+
		"\62\u0081\63\3\2\20\4\2##\u0080\u0080\4\2<<``\5\2,-//\61\61\4\2>>@@\4"+
		"\2&&C\\\7\2&&\62;C\\aac|\4\2\f\f\"\u0080\4\2\"#%\u0080\t\2\"#%(*\\^^`"+
		"|~~\u0080\u0080\7\2\f\f\"AC|~~\u0080\u0080\5\2/\60\62;aa\4\2\"\"..\3\3"+
		"\f\f\5\2\f\f\"\"..\2\u02d0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2S\3\2"+
		"\2\2\2U\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\3\u0083\3\2\2\2\5\u0085"+
		"\3\2\2\2\7\u0087\3\2\2\2\t\u0089\3\2\2\2\13\u008b\3\2\2\2\r\u008d\3\2"+
		"\2\2\17\u008f\3\2\2\2\21\u0091\3\2\2\2\23\u0094\3\2\2\2\25\u00a1\3\2\2"+
		"\2\27\u00a8\3\2\2\2\31\u00b3\3\2\2\2\33\u00bb\3\2\2\2\35\u00de\3\2\2\2"+
		"\37\u0108\3\2\2\2!\u010a\3\2\2\2#\u010f\3\2\2\2%\u0120\3\2\2\2\'\u012a"+
		"\3\2\2\2)\u0130\3\2\2\2+\u013a\3\2\2\2-\u013d\3\2\2\2/\u0142\3\2\2\2\61"+
		"\u0148\3\2\2\2\63\u014c\3\2\2\2\65\u014f\3\2\2\2\67\u0168\3\2\2\29\u016a"+
		"\3\2\2\2;\u0171\3\2\2\2=\u0178\3\2\2\2?\u017c\3\2\2\2A\u017e\3\2\2\2C"+
		"\u0184\3\2\2\2E\u018c\3\2\2\2G\u0191\3\2\2\2I\u0193\3\2\2\2K\u0195\3\2"+
		"\2\2M\u0197\3\2\2\2O\u0199\3\2\2\2Q\u019c\3\2\2\2S\u01a0\3\2\2\2U\u01b0"+
		"\3\2\2\2W\u01c9\3\2\2\2Y\u01cb\3\2\2\2[\u01d2\3\2\2\2]\u01db\3\2\2\2_"+
		"\u01e2\3\2\2\2a\u01f6\3\2\2\2c\u0206\3\2\2\2e\u0208\3\2\2\2g\u020b\3\2"+
		"\2\2i\u0214\3\2\2\2k\u0216\3\2\2\2m\u021d\3\2\2\2o\u0225\3\2\2\2q\u0227"+
		"\3\2\2\2s\u0233\3\2\2\2u\u0238\3\2\2\2w\u0249\3\2\2\2y\u0261\3\2\2\2{"+
		"\u026f\3\2\2\2}\u0271\3\2\2\2\177\u0280\3\2\2\2\u0081\u028f\3\2\2\2\u0083"+
		"\u0084\7}\2\2\u0084\4\3\2\2\2\u0085\u0086\7\177\2\2\u0086\6\3\2\2\2\u0087"+
		"\u0088\7+\2\2\u0088\b\3\2\2\2\u0089\u008a\7?\2\2\u008a\n\3\2\2\2\u008b"+
		"\u008c\7]\2\2\u008c\f\3\2\2\2\u008d\u008e\7_\2\2\u008e\16\3\2\2\2\u008f"+
		"\u0090\7=\2\2\u0090\20\3\2\2\2\u0091\u0092\7>\2\2\u0092\u0093\7<\2\2\u0093"+
		"\22\3\2\2\2\u0094\u0095\t\2\2\2\u0095\24\3\2\2\2\u0096\u00a2\t\3\2\2\u0097"+
		"\u0098\7>\2\2\u0098\u00a2\7/\2\2\u0099\u009a\7>\2\2\u009a\u00a2\7>\2\2"+
		"\u009b\u009c\7-\2\2\u009c\u00a2\7-\2\2\u009d\u009e\7/\2\2\u009e\u00a2"+
		"\7/\2\2\u009f\u00a0\7,\2\2\u00a0\u00a2\7,\2\2\u00a1\u0096\3\2\2\2\u00a1"+
		"\u0097\3\2\2\2\u00a1\u0099\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1\u009d\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\26\3\2\2\2\u00a3\u00a9\t\4\2\2\u00a4\u00a5"+
		"\7@\2\2\u00a5\u00a9\7@\2\2\u00a6\u00a7\7/\2\2\u00a7\u00a9\7@\2\2\u00a8"+
		"\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\30\3\2\2"+
		"\2\u00aa\u00ab\7?\2\2\u00ab\u00b4\7?\2\2\u00ac\u00b4\t\5\2\2\u00ad\u00ae"+
		"\7@\2\2\u00ae\u00b4\7?\2\2\u00af\u00b0\7>\2\2\u00b0\u00b4\7?\2\2\u00b1"+
		"\u00b2\7#\2\2\u00b2\u00b4\7?\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ac\3\2\2"+
		"\2\u00b3\u00ad\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\32"+
		"\3\2\2\2\u00b5\u00b6\7?\2\2\u00b6\u00bc\7@\2\2\u00b7\u00b8\7(\2\2\u00b8"+
		"\u00bc\7(\2\2\u00b9\u00ba\7~\2\2\u00ba\u00bc\7~\2\2\u00bb\u00b5\3\2\2"+
		"\2\u00bb\u00b7\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\34\3\2\2\2\u00bd\u00be"+
		"\7<\2\2\u00be\u00df\7?\2\2\u00bf\u00c0\7`\2\2\u00c0\u00df\7?\2\2\u00c1"+
		"\u00c2\7>\2\2\u00c2\u00c3\7/\2\2\u00c3\u00df\7?\2\2\u00c4\u00c5\7>\2\2"+
		"\u00c5\u00c6\7>\2\2\u00c6\u00df\7?\2\2\u00c7\u00c8\7-\2\2\u00c8\u00df"+
		"\7?\2\2\u00c9\u00ca\7/\2\2\u00ca\u00df\7?\2\2\u00cb\u00cc\7,\2\2\u00cc"+
		"\u00df\7?\2\2\u00cd\u00ce\7\61\2\2\u00ce\u00df\7?\2\2\u00cf\u00d0\7-\2"+
		"\2\u00d0\u00d1\7-\2\2\u00d1\u00df\7?\2\2\u00d2\u00d3\7/\2\2\u00d3\u00d4"+
		"\7/\2\2\u00d4\u00df\7?\2\2\u00d5\u00d6\7,\2\2\u00d6\u00d7\7,\2\2\u00d7"+
		"\u00df\7?\2\2\u00d8\u00d9\7@\2\2\u00d9\u00da\7@\2\2\u00da\u00df\7?\2\2"+
		"\u00db\u00dc\7/\2\2\u00dc\u00dd\7@\2\2\u00dd\u00df\7?\2\2\u00de\u00bd"+
		"\3\2\2\2\u00de\u00bf\3\2\2\2\u00de\u00c1\3\2\2\2\u00de\u00c4\3\2\2\2\u00de"+
		"\u00c7\3\2\2\2\u00de\u00c9\3\2\2\2\u00de\u00cb\3\2\2\2\u00de\u00cd\3\2"+
		"\2\2\u00de\u00cf\3\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00d5\3\2\2\2\u00de"+
		"\u00d8\3\2\2\2\u00de\u00db\3\2\2\2\u00df\36\3\2\2\2\u00e0\u00e1\7h\2\2"+
		"\u00e1\u00e2\7y\2\2\u00e2\u00e3\7f\2\2\u00e3\u00e4\7\"\2\2\u00e4\u00e5"+
		"\7o\2\2\u00e5\u00e6\7w\2\2\u00e6\u0109\7v\2\2\u00e7\u00e8\7h\2\2\u00e8"+
		"\u00e9\7y\2\2\u00e9\u00ea\7f\2\2\u00ea\u00eb\7\"\2\2\u00eb\u00ec\7k\2"+
		"\2\u00ec\u00ed\7o\2\2\u00ed\u0109\7o\2\2\u00ee\u00ef\7k\2\2\u00ef\u00f0"+
		"\7o\2\2\u00f0\u0109\7o\2\2\u00f1\u00f2\7o\2\2\u00f2\u00f3\7w\2\2\u00f3"+
		"\u0109\7v\2\2\u00f4\u00f5\7n\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7p\2\2"+
		"\u00f7\u0109\7v\2\2\u00f8\u00f9\7t\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb"+
		"\7c\2\2\u00fb\u0109\7f\2\2\u00fc\u00fd\7e\2\2\u00fd\u00fe\7c\2\2\u00fe"+
		"\u00ff\7r\2\2\u00ff\u0100\7u\2\2\u0100\u0101\7w\2\2\u0101\u0102\7n\2\2"+
		"\u0102\u0109\7g\2\2\u0103\u0104\7e\2\2\u0104\u0105\7n\2\2\u0105\u0106"+
		"\7c\2\2\u0106\u0107\7u\2\2\u0107\u0109\7u\2\2\u0108\u00e0\3\2\2\2\u0108"+
		"\u00e7\3\2\2\2\u0108\u00ee\3\2\2\2\u0108\u00f1\3\2\2\2\u0108\u00f4\3\2"+
		"\2\2\u0108\u00f8\3\2\2\2\u0108\u00fc\3\2\2\2\u0108\u0103\3\2\2\2\u0109"+
		" \3\2\2\2\u010a\u010b\7x\2\2\u010b\u010c\7q\2\2\u010c\u010d\7k\2\2\u010d"+
		"\u010e\7f\2\2\u010e\"\3\2\2\2\u010f\u0110\7x\2\2\u0110\u0111\7c\2\2\u0111"+
		"\u0112\7t\2\2\u0112$\3\2\2\2\u0113\u0114\7%\2\2\u0114\u0115\7p\2\2\u0115"+
		"\u0116\7q\2\2\u0116\u0117\7t\2\2\u0117\u0118\7o\2\2\u0118\u0121\7}\2\2"+
		"\u0119\u011a\7%\2\2\u011a\u011b\7v\2\2\u011b\u011c\7{\2\2\u011c\u011d"+
		"\7r\2\2\u011d\u011e\7g\2\2\u011e\u011f\7f\2\2\u011f\u0121\7}\2\2\u0120"+
		"\u0113\3\2\2\2\u0120\u0119\3\2\2\2\u0121\u0125\3\2\2\2\u0122\u0124\5O"+
		"(\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0129\7\177"+
		"\2\2\u0129&\3\2\2\2\u012a\u012b\7e\2\2\u012b\u012c\7c\2\2\u012c\u012d"+
		"\7v\2\2\u012d\u012e\7e\2\2\u012e\u012f\7j\2\2\u012f(\3\2\2\2\u0130\u0131"+
		"\7k\2\2\u0131\u0132\7p\2\2\u0132\u0133\7v\2\2\u0133\u0134\7g\2\2\u0134"+
		"\u0135\7t\2\2\u0135\u0136\7h\2\2\u0136\u0137\7c\2\2\u0137\u0138\7e\2\2"+
		"\u0138\u0139\7g\2\2\u0139*\3\2\2\2\u013a\u013b\7k\2\2\u013b\u013c\7h\2"+
		"\2\u013c,\3\2\2\2\u013d\u013e\7g\2\2\u013e\u013f\7n\2\2\u013f\u0140\7"+
		"u\2\2\u0140\u0141\7g\2\2\u0141.\3\2\2\2\u0142\u0143\7y\2\2\u0143\u0144"+
		"\7j\2\2\u0144\u0145\7k\2\2\u0145\u0146\7n\2\2\u0146\u0147\7g\2\2\u0147"+
		"\60\3\2\2\2\u0148\u0149\7h\2\2\u0149\u014a\7q\2\2\u014a\u014b\7t\2\2\u014b"+
		"\62\3\2\2\2\u014c\u014d\7k\2\2\u014d\u014e\7p\2\2\u014e\64\3\2\2\2\u014f"+
		"\u0150\7n\2\2\u0150\u0151\7q\2\2\u0151\u0152\7q\2\2\u0152\u0153\7r\2\2"+
		"\u0153\66\3\2\2\2\u0154\u0155\7t\2\2\u0155\u0156\7g\2\2\u0156\u0157\7"+
		"v\2\2\u0157\u0158\7w\2\2\u0158\u0159\7t\2\2\u0159\u0169\7p\2\2\u015a\u015b"+
		"\7g\2\2\u015b\u015c\7t\2\2\u015c\u015d\7t\2\2\u015d\u015e\7q\2\2\u015e"+
		"\u0169\7t\2\2\u015f\u0160\7g\2\2\u0160\u0161\7z\2\2\u0161\u0162\7e\2\2"+
		"\u0162\u0163\7g\2\2\u0163\u0164\7r\2\2\u0164\u0165\7v\2\2\u0165\u0166"+
		"\7k\2\2\u0166\u0167\7q\2\2\u0167\u0169\7p\2\2\u0168\u0154\3\2\2\2\u0168"+
		"\u015a\3\2\2\2\u0168\u015f\3\2\2\2\u01698\3\2\2\2\u016a\u016b\7y\2\2\u016b"+
		"\u016c\7j\2\2\u016c\u016d\7q\2\2\u016d\u016e\7q\2\2\u016e\u016f\7r\2\2"+
		"\u016f\u0170\7u\2\2\u0170:\3\2\2\2\u0171\u0172\7o\2\2\u0172\u0173\7g\2"+
		"\2\u0173\u0174\7v\2\2\u0174\u0175\7j\2\2\u0175\u0176\7q\2\2\u0176\u0177"+
		"\7f\2\2\u0177<\3\2\2\2\u0178\u0179\7\60\2\2\u0179\u017a\7\60\2\2\u017a"+
		"\u017b\7\60\2\2\u017b>\3\2\2\2\u017c\u017d\7^\2\2\u017d@\3\2\2\2\u017e"+
		"\u017f\7)\2\2\u017f\u0180\5y=\2\u0180B\3\2\2\2\u0181\u0183\7a\2\2\u0182"+
		"\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0187\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\t\6\2\2\u0188"+
		"D\3\2\2\2\u0189\u018b\7a\2\2\u018a\u0189\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c\3\2"+
		"\2\2\u018f\u0190\4c|\2\u0190F\3\2\2\2\u0191\u0192\t\7\2\2\u0192H\3\2\2"+
		"\2\u0193\u0194\t\b\2\2\u0194J\3\2\2\2\u0195\u0196\t\t\2\2\u0196L\3\2\2"+
		"\2\u0197\u0198\t\n\2\2\u0198N\3\2\2\2\u0199\u019a\t\13\2\2\u019aP\3\2"+
		"\2\2\u019b\u019d\5M\'\2\u019c\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019fR\3\2\2\2\u01a0\u01a1\7t\2\2\u01a1"+
		"\u01a2\7g\2\2\u01a2\u01a3\7w\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7g\2\2"+
		"\u01a5\u01a9\3\2\2\2\u01a6\u01a8\5\u0081A\2\u01a7\u01a6\3\2\2\2\u01a8"+
		"\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2"+
		"\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01ad\7]\2\2\u01ad\u01ae\5Q)\2\u01ae\u01af"+
		"\7_\2\2\u01afT\3\2\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2\7c\2\2\u01b2\u01b3"+
		"\7v\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5\7x\2\2\u01b5\u01b6\7g\2\2\u01b6"+
		"\u01ba\3\2\2\2\u01b7\u01b9\5\u0081A\2\u01b8\u01b7\3\2\2\2\u01b9\u01bc"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bd\u01be\7]\2\2\u01be\u01bf\5Q)\2\u01bf\u01c0\7_\2\2"+
		"\u01c0V\3\2\2\2\u01c1\u01ca\7\62\2\2\u01c2\u01c6\4\63;\2\u01c3\u01c5\4"+
		"\62;\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9\u01c1\3\2"+
		"\2\2\u01c9\u01c2\3\2\2\2\u01caX\3\2\2\2\u01cb\u01cf\5E#\2\u01cc\u01ce"+
		"\5G$\2\u01cd\u01cc\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0Z\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d6\7$\2\2\u01d3"+
		"\u01d5\5K&\2\u01d4\u01d3\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2"+
		"\2\u01d6\u01d7\3\2\2\2\u01d7\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da"+
		"\7$\2\2\u01da\\\3\2\2\2\u01db\u01df\4\62;\2\u01dc\u01de\t\f\2\2\u01dd"+
		"\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2"+
		"\2\2\u01e0^\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2\u01e7\5Y-\2\u01e3\u01e4"+
		"\7%\2\2\u01e4\u01e6\5Y-\2\u01e5\u01e3\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea\3\2\2\2\u01e9\u01e7\3\2"+
		"\2\2\u01ea\u01eb\7<\2\2\u01eb\u01ec\7<\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee"+
		"\5W,\2\u01ee`\3\2\2\2\u01ef\u01f0\7%\2\2\u01f0\u01f7\7&\2\2\u01f1\u01f3"+
		"\7%\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01ef\3\2\2\2\u01f6\u01f2\3\2"+
		"\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01fd\5Y-\2\u01f9\u01fa\7%\2\2\u01fa\u01fc"+
		"\5Y-\2\u01fb\u01f9\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd"+
		"\u01fe\3\2\2\2\u01fe\u0204\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0201\7<"+
		"\2\2\u0201\u0202\7<\2\2\u0202\u0203\3\2\2\2\u0203\u0205\5W,\2\u0204\u0200"+
		"\3\2\2\2\u0204\u0205\3\2\2\2\u0205b\3\2\2\2\u0206\u0207\5Y-\2\u0207d\3"+
		"\2\2\2\u0208\u0209\7^\2\2\u0209\u020a\5Y-\2\u020af\3\2\2\2\u020b\u0211"+
		"\5k\66\2\u020c\u020d\5i\65\2\u020d\u020e\5k\66\2\u020e\u0210\3\2\2\2\u020f"+
		"\u020c\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212h\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\7\60\2\2\u0215j\3"+
		"\2\2\2\u0216\u021a\5C\"\2\u0217\u0219\5G$\2\u0218\u0217\3\2\2\2\u0219"+
		"\u021c\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021bl\3\2\2\2"+
		"\u021c\u021a\3\2\2\2\u021d\u021e\7a\2\2\u021en\3\2\2\2\u021f\u0220\7\""+
		"\2\2\u0220\u0226\7*\2\2\u0221\u0222\7.\2\2\u0222\u0226\7*\2\2\u0223\u0224"+
		"\7\f\2\2\u0224\u0226\7*\2\2\u0225\u021f\3\2\2\2\u0225\u0221\3\2\2\2\u0225"+
		"\u0223\3\2\2\2\u0226p\3\2\2\2\u0227\u0228\7*\2\2\u0228r\3\2\2\2\u0229"+
		"\u022a\7B\2\2\u022a\u0234\5y=\2\u022b\u022d\7B\2\2\u022c\u022e\5y=\2\u022d"+
		"\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\7}"+
		"\2\2\u0230\u0231\5{>\2\u0231\u0232\7\177\2\2\u0232\u0234\3\2\2\2\u0233"+
		"\u0229\3\2\2\2\u0233\u022b\3\2\2\2\u0234t\3\2\2\2\u0235\u0239\5_\60\2"+
		"\u0236\u0239\5a\61\2\u0237\u0239\5c\62\2\u0238\u0235\3\2\2\2\u0238\u0236"+
		"\3\2\2\2\u0238\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\5w<\2\u023b"+
		"v\3\2\2\2\u023c\u023d\7*\2\2\u023d\u024a\7+\2\2\u023e\u023f\7*\2\2\u023f"+
		"\u0244\5c\62\2\u0240\u0241\t\r\2\2\u0241\u0243\5c\62\2\u0242\u0240\3\2"+
		"\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0247\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\7+\2\2\u0248\u024a\3\2"+
		"\2\2\u0249\u023c\3\2\2\2\u0249\u023e\3\2\2\2\u024ax\3\2\2\2\u024b\u024e"+
		"\5u;\2\u024c\u024d\7\60\2\2\u024d\u024f\5c\62\2\u024e\u024c\3\2\2\2\u024e"+
		"\u024f\3\2\2\2\u024f\u0262\3\2\2\2\u0250\u0253\5w<\2\u0251\u0252\7\60"+
		"\2\2\u0252\u0254\5c\62\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254"+
		"\u0262\3\2\2\2\u0255\u025f\5g\64\2\u0256\u0257\7\60\2\2\u0257\u025a\5"+
		"u;\2\u0258\u025a\5w<\2\u0259\u0256\3\2\2\2\u0259\u0258\3\2\2\2\u025a\u025d"+
		"\3\2\2\2\u025b\u025c\7\60\2\2\u025c\u025e\5c\62\2\u025d\u025b\3\2\2\2"+
		"\u025d\u025e\3\2\2\2\u025e\u0260\3\2\2\2\u025f\u0259\3\2\2\2\u025f\u0260"+
		"\3\2\2\2\u0260\u0262\3\2\2\2\u0261\u024b\3\2\2\2\u0261\u0250\3\2\2\2\u0261"+
		"\u0255\3\2\2\2\u0262z\3\2\2\2\u0263\u0270\3\2\2\2\u0264\u0265\5O(\2\u0265"+
		"\u0266\5{>\2\u0266\u0270\3\2\2\2\u0267\u0268\5s:\2\u0268\u0269\5{>\2\u0269"+
		"\u0270\3\2\2\2\u026a\u026b\7}\2\2\u026b\u026c\5{>\2\u026c\u026d\7\177"+
		"\2\2\u026d\u026e\5{>\2\u026e\u0270\3\2\2\2\u026f\u0263\3\2\2\2\u026f\u0264"+
		"\3\2\2\2\u026f\u0267\3\2\2\2\u026f\u026a\3\2\2\2\u0270|\3\2\2\2\u0271"+
		"\u0272\7\61\2\2\u0272\u0273\7,\2\2\u0273\u0278\3\2\2\2\u0274\u0277\5}"+
		"?\2\u0275\u0277\13\2\2\2\u0276\u0274\3\2\2\2\u0276\u0275\3\2\2\2\u0277"+
		"\u027a\3\2\2\2\u0278\u0279\3\2\2\2\u0278\u0276\3\2\2\2\u0279\u027b\3\2"+
		"\2\2\u027a\u0278\3\2\2\2\u027b\u027c\7,\2\2\u027c\u027d\7\61\2\2\u027d"+
		"\u027e\3\2\2\2\u027e\u027f\b?\2\2\u027f~\3\2\2\2\u0280\u0281\7\61\2\2"+
		"\u0281\u0282\7\61\2\2\u0282\u0286\3\2\2\2\u0283\u0285\13\2\2\2\u0284\u0283"+
		"\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0287\3\2\2\2\u0286\u0284\3\2\2\2\u0287"+
		"\u028a\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028b\t\16\2\2\u028a\u0289\3"+
		"\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d\b@\2\2\u028d\u0080\3\2\2\2\u028e"+
		"\u0290\t\17\2\2\u028f\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u028f\3"+
		"\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\bA\2\2\u0294"+
		"\u0082\3\2\2\2/\2\u00a1\u00a8\u00b3\u00bb\u00de\u0108\u0120\u0125\u0168"+
		"\u0184\u018c\u019e\u01a9\u01ba\u01c6\u01c9\u01cf\u01d6\u01df\u01e7\u01f4"+
		"\u01f6\u01fd\u0204\u0211\u021a\u0225\u022d\u0233\u0238\u0244\u0249\u024e"+
		"\u0253\u0259\u025d\u025f\u0261\u026f\u0276\u0278\u0286\u028a\u0291\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}