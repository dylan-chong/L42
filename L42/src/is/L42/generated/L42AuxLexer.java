// Generated from L42Aux.g4 by ANTLR 4.7.2
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
public class L42AuxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, Dot=14, TDStart=15, ThisKw=16, 
		AnyKw=17, VoidKw=18, LibraryKw=19, C=20, MUniqueNum=21, MHash=22, X=23, 
		Doc=24, W=25, CHARInDoc=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "Dot", "TDStart", "ThisKw", "AnyKw", 
			"VoidKw", "LibraryKw", "C", "IdUp", "IdLow", "IdChar", "CHAR", "CHARInStringSingle", 
			"CharsUrl", "CHARDocText", "URL", "Fn", "Fx", "Number", "MUniqueNum", 
			"MHash", "X", "Doc", "FS", "FParXs", "FPathSel", "DocText", "W", "CHARInDoc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'#norm{'", "'#typed{'", "'}'", "'typeDep='", "'coherentDep='", 
			"'friends='", "'usedMethods='", "'privateSubtypes='", "'refined='", "'canBeClassAny'", 
			"'{'", "'.'", "'@@'", null, "'Any'", "'Void'", "'Library'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "Dot", "TDStart", "ThisKw", "AnyKw", "VoidKw", "LibraryKw", 
			"C", "MUniqueNum", "MHash", "X", "Doc", "W", "CHARInDoc"
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


	public L42AuxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L42Aux.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u0188\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u00cc\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\7\25\u00e1\n\25\f\25"+
		"\16\25\u00e4\13\25\3\25\3\25\3\25\3\25\5\25\u00ea\n\25\3\26\7\26\u00ed"+
		"\n\26\f\26\16\26\u00f0\13\26\3\26\3\26\3\27\7\27\u00f5\n\27\f\27\16\27"+
		"\u00f8\13\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\6\35\u0107\n\35\r\35\16\35\u0108\3\36\3\36\3\36\7\36\u010e\n"+
		"\36\f\36\16\36\u0111\13\36\5\36\u0113\n\36\3\37\3\37\7\37\u0117\n\37\f"+
		"\37\16\37\u011a\13\37\3 \3 \7 \u011e\n \f \16 \u0121\13 \3!\3!\3!\7!\u0126"+
		"\n!\f!\16!\u0129\13!\3!\3!\3!\3!\3!\3\"\3\"\3\"\6\"\u0133\n\"\r\"\16\""+
		"\u0134\5\"\u0137\n\"\3\"\3\"\3\"\7\"\u013c\n\"\f\"\16\"\u013f\13\"\3\""+
		"\3\"\3\"\3\"\5\"\u0145\n\"\3#\3#\3$\3$\3$\3$\5$\u014d\n$\3$\3$\3$\3$\5"+
		"$\u0153\n$\3%\3%\3%\5%\u0158\n%\3%\3%\3&\3&\3&\3&\3&\3&\7&\u0162\n&\f"+
		"&\16&\u0165\13&\3&\3&\5&\u0169\n&\3\'\3\'\3\'\5\'\u016e\n\'\3\'\3\'\3"+
		"\'\5\'\u0173\n\'\5\'\u0175\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5("+
		"\u0183\n(\3)\3)\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61\2\63"+
		"\2\65\2\67\29\2;\2=\2?\2A\27C\30E\31G\32I\2K\2M\2O\2Q\33S\34\3\2\f\4\2"+
		"&&C\\\7\2&&\62;C\\aac|\4\2\f\f\"\u0080\4\2\"#%\u0080\t\2\"#%(*\\^^`|~"+
		"~\u0080\u0080\7\2\f\f\"AC|~~\u0080\u0080\5\2/\60\62;aa\4\2\"\"..\5\2\f"+
		"\f\"\"..\b\2#-//\61AC|~~\u0080\u0080\2\u0193\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2Q\3\2\2\2\2"+
		"S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t`\3\2\2\2\13h\3\2\2\2\rj\3"+
		"\2\2\2\17s\3\2\2\2\21\u0080\3\2\2\2\23\u0089\3\2\2\2\25\u0096\3\2\2\2"+
		"\27\u00a7\3\2\2\2\31\u00b0\3\2\2\2\33\u00be\3\2\2\2\35\u00c0\3\2\2\2\37"+
		"\u00c2\3\2\2\2!\u00c5\3\2\2\2#\u00cd\3\2\2\2%\u00d1\3\2\2\2\'\u00d6\3"+
		"\2\2\2)\u00de\3\2\2\2+\u00ee\3\2\2\2-\u00f6\3\2\2\2/\u00fb\3\2\2\2\61"+
		"\u00fd\3\2\2\2\63\u00ff\3\2\2\2\65\u0101\3\2\2\2\67\u0103\3\2\2\29\u0106"+
		"\3\2\2\2;\u0112\3\2\2\2=\u0114\3\2\2\2?\u011b\3\2\2\2A\u0122\3\2\2\2C"+
		"\u0136\3\2\2\2E\u0146\3\2\2\2G\u0152\3\2\2\2I\u0157\3\2\2\2K\u0168\3\2"+
		"\2\2M\u0174\3\2\2\2O\u0182\3\2\2\2Q\u0184\3\2\2\2S\u0186\3\2\2\2UV\7*"+
		"\2\2V\4\3\2\2\2WX\7+\2\2X\6\3\2\2\2YZ\7%\2\2Z[\7p\2\2[\\\7q\2\2\\]\7t"+
		"\2\2]^\7o\2\2^_\7}\2\2_\b\3\2\2\2`a\7%\2\2ab\7v\2\2bc\7{\2\2cd\7r\2\2"+
		"de\7g\2\2ef\7f\2\2fg\7}\2\2g\n\3\2\2\2hi\7\177\2\2i\f\3\2\2\2jk\7v\2\2"+
		"kl\7{\2\2lm\7r\2\2mn\7g\2\2no\7F\2\2op\7g\2\2pq\7r\2\2qr\7?\2\2r\16\3"+
		"\2\2\2st\7e\2\2tu\7q\2\2uv\7j\2\2vw\7g\2\2wx\7t\2\2xy\7g\2\2yz\7p\2\2"+
		"z{\7v\2\2{|\7F\2\2|}\7g\2\2}~\7r\2\2~\177\7?\2\2\177\20\3\2\2\2\u0080"+
		"\u0081\7h\2\2\u0081\u0082\7t\2\2\u0082\u0083\7k\2\2\u0083\u0084\7g\2\2"+
		"\u0084\u0085\7p\2\2\u0085\u0086\7f\2\2\u0086\u0087\7u\2\2\u0087\u0088"+
		"\7?\2\2\u0088\22\3\2\2\2\u0089\u008a\7w\2\2\u008a\u008b\7u\2\2\u008b\u008c"+
		"\7g\2\2\u008c\u008d\7f\2\2\u008d\u008e\7O\2\2\u008e\u008f\7g\2\2\u008f"+
		"\u0090\7v\2\2\u0090\u0091\7j\2\2\u0091\u0092\7q\2\2\u0092\u0093\7f\2\2"+
		"\u0093\u0094\7u\2\2\u0094\u0095\7?\2\2\u0095\24\3\2\2\2\u0096\u0097\7"+
		"r\2\2\u0097\u0098\7t\2\2\u0098\u0099\7k\2\2\u0099\u009a\7x\2\2\u009a\u009b"+
		"\7c\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d\u009e\7U\2\2\u009e"+
		"\u009f\7w\2\2\u009f\u00a0\7d\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7{\2\2"+
		"\u00a2\u00a3\7r\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7u\2\2\u00a5\u00a6"+
		"\7?\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa"+
		"\7h\2\2\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"\u00ae\7f\2\2\u00ae\u00af\7?\2\2\u00af\30\3\2\2\2\u00b0\u00b1\7e\2\2\u00b1"+
		"\u00b2\7c\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7D\2\2\u00b4\u00b5\7g\2\2"+
		"\u00b5\u00b6\7E\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9"+
		"\7u\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bb\7C\2\2\u00bb\u00bc\7p\2\2\u00bc"+
		"\u00bd\7{\2\2\u00bd\32\3\2\2\2\u00be\u00bf\7}\2\2\u00bf\34\3\2\2\2\u00c0"+
		"\u00c1\7\60\2\2\u00c1\36\3\2\2\2\u00c2\u00c3\7B\2\2\u00c3\u00c4\7B\2\2"+
		"\u00c4 \3\2\2\2\u00c5\u00c6\7V\2\2\u00c6\u00c7\7j\2\2\u00c7\u00c8\7k\2"+
		"\2\u00c8\u00c9\7u\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00cc\5;\36\2\u00cb\u00ca"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\"\3\2\2\2\u00cd\u00ce\7C\2\2\u00ce"+
		"\u00cf\7p\2\2\u00cf\u00d0\7{\2\2\u00d0$\3\2\2\2\u00d1\u00d2\7X\2\2\u00d2"+
		"\u00d3\7q\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7f\2\2\u00d5&\3\2\2\2\u00d6"+
		"\u00d7\7N\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7d\2\2\u00d9\u00da\7t\2\2"+
		"\u00da\u00db\7c\2\2\u00db\u00dc\7t\2\2\u00dc\u00dd\7{\2\2\u00dd(\3\2\2"+
		"\2\u00de\u00e2\5+\26\2\u00df\u00e1\5/\30\2\u00e0\u00df\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e9\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\7<\2\2\u00e6\u00e7\7<\2\2\u00e7\u00e8\3\2\2"+
		"\2\u00e8\u00ea\5;\36\2\u00e9\u00e5\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea*"+
		"\3\2\2\2\u00eb\u00ed\7a\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2"+
		"\2\2\u00f1\u00f2\t\2\2\2\u00f2,\3\2\2\2\u00f3\u00f5\7a\2\2\u00f4\u00f3"+
		"\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\4c|\2\u00fa.\3\2\2\2\u00fb"+
		"\u00fc\t\3\2\2\u00fc\60\3\2\2\2\u00fd\u00fe\t\4\2\2\u00fe\62\3\2\2\2\u00ff"+
		"\u0100\t\5\2\2\u0100\64\3\2\2\2\u0101\u0102\t\6\2\2\u0102\66\3\2\2\2\u0103"+
		"\u0104\t\7\2\2\u01048\3\2\2\2\u0105\u0107\5\65\33\2\u0106\u0105\3\2\2"+
		"\2\u0107\u0108\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109:"+
		"\3\2\2\2\u010a\u0113\7\62\2\2\u010b\u010f\4\63;\2\u010c\u010e\4\62;\2"+
		"\u010d\u010c\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u010a\3\2\2\2\u0112"+
		"\u010b\3\2\2\2\u0113<\3\2\2\2\u0114\u0118\5-\27\2\u0115\u0117\5/\30\2"+
		"\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119"+
		"\3\2\2\2\u0119>\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011f\4\62;\2\u011c"+
		"\u011e\t\b\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120@\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0127"+
		"\5=\37\2\u0123\u0124\7%\2\2\u0124\u0126\5=\37\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2"+
		"\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7<\2\2\u012b\u012c\7<\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\5;\36\2\u012eB\3\2\2\2\u012f\u0130\7%\2\2\u0130\u0137"+
		"\7&\2\2\u0131\u0133\7%\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u012f\3\2"+
		"\2\2\u0136\u0132\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013d\5=\37\2\u0139"+
		"\u013a\7%\2\2\u013a\u013c\5=\37\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0144\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0141\7<\2\2\u0141\u0142\7<\2\2\u0142\u0143\3\2\2"+
		"\2\u0143\u0145\5;\36\2\u0144\u0140\3\2\2\2\u0144\u0145\3\2\2\2\u0145D"+
		"\3\2\2\2\u0146\u0147\5=\37\2\u0147F\3\2\2\2\u0148\u0149\7B\2\2\u0149\u0153"+
		"\5M\'\2\u014a\u014c\7B\2\2\u014b\u014d\5M\'\2\u014c\u014b\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7}\2\2\u014f\u0150\5O("+
		"\2\u0150\u0151\7\177\2\2\u0151\u0153\3\2\2\2\u0152\u0148\3\2\2\2\u0152"+
		"\u014a\3\2\2\2\u0153H\3\2\2\2\u0154\u0158\5A!\2\u0155\u0158\5C\"\2\u0156"+
		"\u0158\5E#\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2"+
		"\2\u0158\u0159\3\2\2\2\u0159\u015a\5K&\2\u015aJ\3\2\2\2\u015b\u015c\7"+
		"*\2\2\u015c\u0169\7+\2\2\u015d\u015e\7*\2\2\u015e\u0163\5E#\2\u015f\u0160"+
		"\t\t\2\2\u0160\u0162\5E#\2\u0161\u015f\3\2\2\2\u0162\u0165\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0166\u0167\7+\2\2\u0167\u0169\3\2\2\2\u0168\u015b\3\2\2\2\u0168"+
		"\u015d\3\2\2\2\u0169L\3\2\2\2\u016a\u016d\5I%\2\u016b\u016c\7\60\2\2\u016c"+
		"\u016e\5E#\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0175\3\2\2"+
		"\2\u016f\u0172\5K&\2\u0170\u0171\7\60\2\2\u0171\u0173\5E#\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u016a\3\2\2\2\u0174"+
		"\u016f\3\2\2\2\u0175N\3\2\2\2\u0176\u0183\3\2\2\2\u0177\u0178\5\67\34"+
		"\2\u0178\u0179\5O(\2\u0179\u0183\3\2\2\2\u017a\u017b\5G$\2\u017b\u017c"+
		"\5O(\2\u017c\u0183\3\2\2\2\u017d\u017e\7}\2\2\u017e\u017f\5O(\2\u017f"+
		"\u0180\7\177\2\2\u0180\u0181\5O(\2\u0181\u0183\3\2\2\2\u0182\u0176\3\2"+
		"\2\2\u0182\u0177\3\2\2\2\u0182\u017a\3\2\2\2\u0182\u017d\3\2\2\2\u0183"+
		"P\3\2\2\2\u0184\u0185\t\n\2\2\u0185R\3\2\2\2\u0186\u0187\t\13\2\2\u0187"+
		"T\3\2\2\2\33\2\u00cb\u00e2\u00e9\u00ee\u00f6\u0108\u010f\u0112\u0118\u011f"+
		"\u0127\u0134\u0136\u013d\u0144\u014c\u0152\u0157\u0163\u0168\u016d\u0172"+
		"\u0174\u0182\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}