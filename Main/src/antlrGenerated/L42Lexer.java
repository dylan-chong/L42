// Generated from L42.g4 by ANTLR 4.2.2
package antlrGenerated;
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
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SRE=1, SEX=2, SER=3, Mdf=4, ORoundNoSpace=5, ORoundSpace=6, CRound=7, 
		OSquare=8, CSquare=9, OCurly=10, DotDotDot=11, EndType=12, CCurly=13, 
		Colon=14, Semicolon=15, Dot=16, Equal=17, Ph=18, Implements=19, Case=20, 
		If=21, Else=22, While=23, Loop=24, With=25, On=26, In=27, Catch=28, Var=29, 
		Default=30, Interface=31, Method=32, Using=33, Check=34, Refine=35, FieldSpecial=36, 
		WalkBy=37, Stage=38, Path=39, ClassSep=40, MX=41, X=42, HashX=43, HashQX=44, 
		ContextId=45, StringQuote=46, UrlNL=47, Url=48, Doc=49, WS=50, UnOp=51, 
		EqOp=52, BoolOp=53, RelOp=54, DataOp=55, NumParse=56;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'return'", "'exception'", "'error'", "Mdf", "'('", "'\t'", "')'", "'['", 
		"']'", "'{'", "'...'", "'^##'", "'}'", "':'", "';'", "Dot", "'='", "'fwd'", 
		"'implements'", "'case'", "'if'", "'else'", "'while'", "'loop'", "'with'", 
		"'on'", "'in'", "'catch'", "'var'", "'default'", "'interface'", "'method'", 
		"'use'", "'check'", "'refine'", "'##field'", "'##walkBy'", "Stage", "Path", 
		"ClassSep", "MX", "X", "HashX", "HashQX", "ContextId", "StringQuote", 
		"UrlNL", "Url", "Doc", "WS", "UnOp", "EqOp", "BoolOp", "RelOp", "DataOp", 
		"NumParse"
	};
	public static final String[] ruleNames = {
		"Uppercase", "Lowercase", "Digit", "C", "CharsAll", "CharsUrl", "CharsAllStrLine", 
		"CharsAllString", "DocLine", "DocMultiLine", "StrLine", "String", "NumNext", 
		"SRE", "SEX", "SER", "Mdf", "ORoundNoSpace", "ORoundSpace", "CRound", 
		"OSquare", "CSquare", "OCurly", "DotDotDot", "EndType", "CCurly", "Colon", 
		"Semicolon", "Dot", "Equal", "Ph", "Implements", "Case", "If", "Else", 
		"While", "Loop", "With", "On", "In", "Catch", "Var", "Default", "Interface", 
		"Method", "Using", "Check", "Refine", "FieldSpecial", "WalkBy", "Stage", 
		"Path", "ClassSep", "MX", "X", "HashX", "HashQX", "ContextId", "StringQuote", 
		"UrlNL", "Url", "Doc", "WS", "UnOp", "EqOp", "BoolOp", "RelOp", "DataOp", 
		"NumParse"
	};


	public L42Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L42.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2:\u02c9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u0098\n\5\f\5\16\5\u009b\13\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\n\u00a9\n\n\f\n\16\n\u00ac\13\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u00b5\n\13\f\13\16\13\u00b8\13"+
		"\13\3\13\3\13\3\13\3\f\3\f\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\f\3\f\3"+
		"\r\7\r\u00c7\n\r\f\r\16\r\u00ca\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d1"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0101\n\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3$\3$"+
		"\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3"+
		")\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u01c2"+
		"\n\64\3\65\3\65\3\65\3\65\7\65\u01c8\n\65\f\65\16\65\u01cb\13\65\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\7\67\u01d4\n\67\f\67\16\67\u01d7\13\67"+
		"\3\67\3\67\38\38\38\38\38\78\u01e0\n8\f8\168\u01e3\138\39\39\39\39\39"+
		"\79\u01ea\n9\f9\169\u01ed\139\39\39\3:\3:\3:\3:\3:\3:\3:\7:\u01f8\n:\f"+
		":\16:\u01fb\13:\3:\3:\3;\3;\3;\3;\3;\7;\u0204\n;\f;\16;\u0207\13;\3<\3"+
		"<\3<\3<\3<\3<\7<\u020f\n<\f<\16<\u0212\13<\3<\3<\7<\u0216\n<\f<\16<\u0219"+
		"\13<\3<\6<\u021c\n<\r<\16<\u021d\3<\7<\u0221\n<\f<\16<\u0224\13<\3<\3"+
		"<\5<\u0228\n<\3=\3=\3=\3=\3=\3=\3=\6=\u0231\n=\r=\16=\u0232\3=\6=\u0236"+
		"\n=\r=\16=\u0237\3=\3=\3>\3>\3>\3>\3>\3>\3>\6>\u0243\n>\r>\16>\u0244\3"+
		">\6>\u0248\n>\r>\16>\u0249\3?\3?\5?\u024e\n?\6?\u0250\n?\r?\16?\u0251"+
		"\3?\3?\5?\u0256\n?\5?\u0258\n?\3@\6@\u025b\n@\r@\16@\u025c\3@\3@\3A\3"+
		"A\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3B\3B\5B\u0282\nB\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\5D\u02b1\nD\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\5E\u02c1\nE\3F\3F\7F\u02c5\nF\fF\16F\u02c8\13F\3\u00b6"+
		"\2G\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\3\37"+
		"\4!\5#\6%\7\'\b)\t+\n-\13/\f\61\r\63\16\65\17\67\209\21;\22=\23?\24A\25"+
		"C\26E\27G\30I\31K\32M\33O\34Q\35S\36U\37W Y![\"]#_$a%c&e\'g(i)k*m+o,q"+
		"-s.u/w\60y\61{\62}\63\177\64\u0081\65\u0083\66\u0085\67\u00878\u00899"+
		"\u008b:\3\2\17\4\2&\'C\\\4\2aac|\6\2\13\13\"#%(*\u0080\b\2\13\13\"#%("+
		"*|~~\u0080\u0080\4\2\13\13\"\u0080\5\2\13\13\"#%\u0080\4\2\"\"..\5\2\f"+
		"\f\"\"..\4\2##\u0080\u0080\4\2((~~\4\2>>@@\4\2--//\4\2,,\61\61\u0313\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2\2\7\u0091"+
		"\3\2\2\2\t\u0093\3\2\2\2\13\u009c\3\2\2\2\r\u009e\3\2\2\2\17\u00a0\3\2"+
		"\2\2\21\u00a2\3\2\2\2\23\u00a4\3\2\2\2\25\u00af\3\2\2\2\27\u00bc\3\2\2"+
		"\2\31\u00c8\3\2\2\2\33\u00d0\3\2\2\2\35\u00d2\3\2\2\2\37\u00d9\3\2\2\2"+
		"!\u00e3\3\2\2\2#\u0100\3\2\2\2%\u0102\3\2\2\2\'\u0104\3\2\2\2)\u0106\3"+
		"\2\2\2+\u0108\3\2\2\2-\u010a\3\2\2\2/\u010c\3\2\2\2\61\u010e\3\2\2\2\63"+
		"\u0112\3\2\2\2\65\u0116\3\2\2\2\67\u0118\3\2\2\29\u011a\3\2\2\2;\u011c"+
		"\3\2\2\2=\u011e\3\2\2\2?\u0120\3\2\2\2A\u0124\3\2\2\2C\u012f\3\2\2\2E"+
		"\u0134\3\2\2\2G\u0137\3\2\2\2I\u013c\3\2\2\2K\u0142\3\2\2\2M\u0147\3\2"+
		"\2\2O\u014c\3\2\2\2Q\u014f\3\2\2\2S\u0152\3\2\2\2U\u0158\3\2\2\2W\u015c"+
		"\3\2\2\2Y\u0164\3\2\2\2[\u016e\3\2\2\2]\u0175\3\2\2\2_\u0179\3\2\2\2a"+
		"\u017f\3\2\2\2c\u0186\3\2\2\2e\u018e\3\2\2\2g\u01c1\3\2\2\2i\u01c3\3\2"+
		"\2\2k\u01cc\3\2\2\2m\u01ce\3\2\2\2o\u01da\3\2\2\2q\u01e4\3\2\2\2s\u01f0"+
		"\3\2\2\2u\u01fe\3\2\2\2w\u0227\3\2\2\2y\u0229\3\2\2\2{\u023b\3\2\2\2}"+
		"\u0257\3\2\2\2\177\u025a\3\2\2\2\u0081\u0260\3\2\2\2\u0083\u0281\3\2\2"+
		"\2\u0085\u0283\3\2\2\2\u0087\u02b0\3\2\2\2\u0089\u02c0\3\2\2\2\u008b\u02c2"+
		"\3\2\2\2\u008d\u008e\t\2\2\2\u008e\4\3\2\2\2\u008f\u0090\t\3\2\2\u0090"+
		"\6\3\2\2\2\u0091\u0092\4\62;\2\u0092\b\3\2\2\2\u0093\u0099\5\3\2\2\u0094"+
		"\u0098\5\3\2\2\u0095\u0098\5\5\3\2\u0096\u0098\5\7\4\2\u0097\u0094\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\n\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009c\u009d\t\4\2\2\u009d\f\3\2\2\2\u009e\u009f\t\5\2\2\u009f\16\3\2"+
		"\2\2\u00a0\u00a1\t\6\2\2\u00a1\20\3\2\2\2\u00a2\u00a3\t\7\2\2\u00a3\22"+
		"\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7\61\2\2\u00a6\u00aa\3\2\2\2"+
		"\u00a7\u00a9\5\17\b\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00ae\7\f\2\2\u00ae\24\3\2\2\2\u00af\u00b0\7\61\2\2\u00b0\u00b1\7,\2"+
		"\2\u00b1\u00b6\3\2\2\2\u00b2\u00b5\5\17\b\2\u00b3\u00b5\7\f\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00ba\7,\2\2\u00ba\u00bb\7\61\2\2\u00bb\26\3\2\2\2\u00bc\u00c0\7)\2\2"+
		"\u00bd\u00bf\5\17\b\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c4\7\f\2\2\u00c4\30\3\2\2\2\u00c5\u00c7\5\21\t\2\u00c6\u00c5\3\2\2"+
		"\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\32"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00d1\5\7\4\2\u00cc\u00cd\7/\2\2\u00cd"+
		"\u00d1\5\7\4\2\u00ce\u00cf\7\60\2\2\u00cf\u00d1\5\7\4\2\u00d0\u00cb\3"+
		"\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\34\3\2\2\2\u00d2"+
		"\u00d3\7t\2\2\u00d3\u00d4\7g\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7w\2\2"+
		"\u00d6\u00d7\7t\2\2\u00d7\u00d8\7p\2\2\u00d8\36\3\2\2\2\u00d9\u00da\7"+
		"g\2\2\u00da\u00db\7z\2\2\u00db\u00dc\7e\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de"+
		"\7r\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7k\2\2\u00e0\u00e1\7q\2\2\u00e1"+
		"\u00e2\7p\2\2\u00e2 \3\2\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7t\2\2\u00e5"+
		"\u00e6\7t\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7t\2\2\u00e8\"\3\2\2\2\u00e9"+
		"\u00ea\7e\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7u\2\2"+
		"\u00ed\u0101\7u\2\2\u00ee\u00ef\7o\2\2\u00ef\u00f0\7w\2\2\u00f0\u0101"+
		"\7v\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7c\2\2\u00f4"+
		"\u0101\7f\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7g\2\2\u00f7\u00f8\7p\2\2"+
		"\u00f8\u0101\7v\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc"+
		"\7r\2\2\u00fc\u00fd\7u\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff\7n\2\2\u00ff"+
		"\u0101\7g\2\2\u0100\u00e9\3\2\2\2\u0100\u00ee\3\2\2\2\u0100\u00f1\3\2"+
		"\2\2\u0100\u00f5\3\2\2\2\u0100\u00f9\3\2\2\2\u0101$\3\2\2\2\u0102\u0103"+
		"\7*\2\2\u0103&\3\2\2\2\u0104\u0105\7\13\2\2\u0105(\3\2\2\2\u0106\u0107"+
		"\7+\2\2\u0107*\3\2\2\2\u0108\u0109\7]\2\2\u0109,\3\2\2\2\u010a\u010b\7"+
		"_\2\2\u010b.\3\2\2\2\u010c\u010d\7}\2\2\u010d\60\3\2\2\2\u010e\u010f\7"+
		"\60\2\2\u010f\u0110\7\60\2\2\u0110\u0111\7\60\2\2\u0111\62\3\2\2\2\u0112"+
		"\u0113\7`\2\2\u0113\u0114\7%\2\2\u0114\u0115\7%\2\2\u0115\64\3\2\2\2\u0116"+
		"\u0117\7\177\2\2\u0117\66\3\2\2\2\u0118\u0119\7<\2\2\u01198\3\2\2\2\u011a"+
		"\u011b\7=\2\2\u011b:\3\2\2\2\u011c\u011d\7\60\2\2\u011d<\3\2\2\2\u011e"+
		"\u011f\7?\2\2\u011f>\3\2\2\2\u0120\u0121\7h\2\2\u0121\u0122\7y\2\2\u0122"+
		"\u0123\7f\2\2\u0123@\3\2\2\2\u0124\u0125\7k\2\2\u0125\u0126\7o\2\2\u0126"+
		"\u0127\7r\2\2\u0127\u0128\7n\2\2\u0128\u0129\7g\2\2\u0129\u012a\7o\2\2"+
		"\u012a\u012b\7g\2\2\u012b\u012c\7p\2\2\u012c\u012d\7v\2\2\u012d\u012e"+
		"\7u\2\2\u012eB\3\2\2\2\u012f\u0130\7e\2\2\u0130\u0131\7c\2\2\u0131\u0132"+
		"\7u\2\2\u0132\u0133\7g\2\2\u0133D\3\2\2\2\u0134\u0135\7k\2\2\u0135\u0136"+
		"\7h\2\2\u0136F\3\2\2\2\u0137\u0138\7g\2\2\u0138\u0139\7n\2\2\u0139\u013a"+
		"\7u\2\2\u013a\u013b\7g\2\2\u013bH\3\2\2\2\u013c\u013d\7y\2\2\u013d\u013e"+
		"\7j\2\2\u013e\u013f\7k\2\2\u013f\u0140\7n\2\2\u0140\u0141\7g\2\2\u0141"+
		"J\3\2\2\2\u0142\u0143\7n\2\2\u0143\u0144\7q\2\2\u0144\u0145\7q\2\2\u0145"+
		"\u0146\7r\2\2\u0146L\3\2\2\2\u0147\u0148\7y\2\2\u0148\u0149\7k\2\2\u0149"+
		"\u014a\7v\2\2\u014a\u014b\7j\2\2\u014bN\3\2\2\2\u014c\u014d\7q\2\2\u014d"+
		"\u014e\7p\2\2\u014eP\3\2\2\2\u014f\u0150\7k\2\2\u0150\u0151\7p\2\2\u0151"+
		"R\3\2\2\2\u0152\u0153\7e\2\2\u0153\u0154\7c\2\2\u0154\u0155\7v\2\2\u0155"+
		"\u0156\7e\2\2\u0156\u0157\7j\2\2\u0157T\3\2\2\2\u0158\u0159\7x\2\2\u0159"+
		"\u015a\7c\2\2\u015a\u015b\7t\2\2\u015bV\3\2\2\2\u015c\u015d\7f\2\2\u015d"+
		"\u015e\7g\2\2\u015e\u015f\7h\2\2\u015f\u0160\7c\2\2\u0160\u0161\7w\2\2"+
		"\u0161\u0162\7n\2\2\u0162\u0163\7v\2\2\u0163X\3\2\2\2\u0164\u0165\7k\2"+
		"\2\u0165\u0166\7p\2\2\u0166\u0167\7v\2\2\u0167\u0168\7g\2\2\u0168\u0169"+
		"\7t\2\2\u0169\u016a\7h\2\2\u016a\u016b\7c\2\2\u016b\u016c\7e\2\2\u016c"+
		"\u016d\7g\2\2\u016dZ\3\2\2\2\u016e\u016f\7o\2\2\u016f\u0170\7g\2\2\u0170"+
		"\u0171\7v\2\2\u0171\u0172\7j\2\2\u0172\u0173\7q\2\2\u0173\u0174\7f\2\2"+
		"\u0174\\\3\2\2\2\u0175\u0176\7w\2\2\u0176\u0177\7u\2\2\u0177\u0178\7g"+
		"\2\2\u0178^\3\2\2\2\u0179\u017a\7e\2\2\u017a\u017b\7j\2\2\u017b\u017c"+
		"\7g\2\2\u017c\u017d\7e\2\2\u017d\u017e\7m\2\2\u017e`\3\2\2\2\u017f\u0180"+
		"\7t\2\2\u0180\u0181\7g\2\2\u0181\u0182\7h\2\2\u0182\u0183\7k\2\2\u0183"+
		"\u0184\7p\2\2\u0184\u0185\7g\2\2\u0185b\3\2\2\2\u0186\u0187\7%\2\2\u0187"+
		"\u0188\7%\2\2\u0188\u0189\7h\2\2\u0189\u018a\7k\2\2\u018a\u018b\7g\2\2"+
		"\u018b\u018c\7n\2\2\u018c\u018d\7f\2\2\u018dd\3\2\2\2\u018e\u018f\7%\2"+
		"\2\u018f\u0190\7%\2\2\u0190\u0191\7y\2\2\u0191\u0192\7c\2\2\u0192\u0193"+
		"\7n\2\2\u0193\u0194\7m\2\2\u0194\u0195\7D\2\2\u0195\u0196\7{\2\2\u0196"+
		"f\3\2\2\2\u0197\u0198\7%\2\2\u0198\u0199\7%\2\2\u0199\u019a\7n\2\2\u019a"+
		"\u019b\7g\2\2\u019b\u019c\7u\2\2\u019c\u01c2\7u\2\2\u019d\u019e\7%\2\2"+
		"\u019e\u019f\7%\2\2\u019f\u01a0\7o\2\2\u01a0\u01a1\7g\2\2\u01a1\u01a2"+
		"\7v\2\2\u01a2\u01c2\7c\2\2\u01a3\u01a4\7%\2\2\u01a4\u01a5\7%\2\2\u01a5"+
		"\u01a6\7r\2\2\u01a6\u01a7\7n\2\2\u01a7\u01a8\7w\2\2\u01a8\u01c2\7u\2\2"+
		"\u01a9\u01aa\7%\2\2\u01aa\u01ab\7%\2\2\u01ab\u01ac\7u\2\2\u01ac\u01ad"+
		"\7v\2\2\u01ad\u01ae\7c\2\2\u01ae\u01c2\7t\2\2\u01af\u01b0\7%\2\2\u01b0"+
		"\u01b1\7%\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7g\2\2"+
		"\u01b4\u01b5\7f\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\7d\2\2\u01b7\u01b8"+
		"\7n\2\2\u01b8\u01c2\7g\2\2\u01b9\u01ba\7%\2\2\u01ba\u01bb\7%\2\2\u01bb"+
		"\u01bc\7p\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7g\2\2\u01be\u01bf\7f\2\2"+
		"\u01bf\u01c0\7g\2\2\u01c0\u01c2\7f\2\2\u01c1\u0197\3\2\2\2\u01c1\u019d"+
		"\3\2\2\2\u01c1\u01a3\3\2\2\2\u01c1\u01a9\3\2\2\2\u01c1\u01af\3\2\2\2\u01c1"+
		"\u01b9\3\2\2\2\u01c2h\3\2\2\2\u01c3\u01c9\5\t\5\2\u01c4\u01c5\5k\66\2"+
		"\u01c5\u01c6\5\t\5\2\u01c6\u01c8\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c8\u01cb"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01caj\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cc\u01cd\7\60\2\2\u01cdl\3\2\2\2\u01ce\u01d5\5\5\3\2"+
		"\u01cf\u01d4\5\3\2\2\u01d0\u01d4\5\5\3\2\u01d1\u01d4\5\7\4\2\u01d2\u01d4"+
		"\7%\2\2\u01d3\u01cf\3\2\2\2\u01d3\u01d0\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7*\2\2\u01d9"+
		"n\3\2\2\2\u01da\u01e1\5\5\3\2\u01db\u01e0\5\3\2\2\u01dc\u01e0\5\5\3\2"+
		"\u01dd\u01e0\5\7\4\2\u01de\u01e0\7%\2\2\u01df\u01db\3\2\2\2\u01df\u01dc"+
		"\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1"+
		"\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2p\3\2\2\2\u01e3\u01e1\3\2\2\2"+
		"\u01e4\u01eb\7%\2\2\u01e5\u01ea\5\3\2\2\u01e6\u01ea\5\5\3\2\u01e7\u01ea"+
		"\5\7\4\2\u01e8\u01ea\7%\2\2\u01e9\u01e5\3\2\2\2\u01e9\u01e6\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01e8\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ee"+
		"\u01ef\7*\2\2\u01efr\3\2\2\2\u01f0\u01f1\7%\2\2\u01f1\u01f2\7A\2\2\u01f2"+
		"\u01f9\3\2\2\2\u01f3\u01f8\5\3\2\2\u01f4\u01f8\5\5\3\2\u01f5\u01f8\5\7"+
		"\4\2\u01f6\u01f8\7%\2\2\u01f7\u01f3\3\2\2\2\u01f7\u01f4\3\2\2\2\u01f7"+
		"\u01f5\3\2\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc"+
		"\u01fd\7*\2\2\u01fdt\3\2\2\2\u01fe\u0205\7^\2\2\u01ff\u0204\5\3\2\2\u0200"+
		"\u0204\5\5\3\2\u0201\u0204\5\7\4\2\u0202\u0204\7%\2\2\u0203\u01ff\3\2"+
		"\2\2\u0203\u0200\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204"+
		"\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206v\3\2\2\2"+
		"\u0207\u0205\3\2\2\2\u0208\u0209\7$\2\2\u0209\u020a\5\31\r\2\u020a\u020b"+
		"\7$\2\2\u020b\u0228\3\2\2\2\u020c\u0210\7$\2\2\u020d\u020f\t\b\2\2\u020e"+
		"\u020d\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211\u0213\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u021b\7\f\2\2\u0214"+
		"\u0216\t\b\2\2\u0215\u0214\3\2\2\2\u0216\u0219\3\2\2\2\u0217\u0215\3\2"+
		"\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a"+
		"\u021c\5\27\f\2\u021b\u0217\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021b\3"+
		"\2\2\2\u021d\u021e\3\2\2\2\u021e\u0222\3\2\2\2\u021f\u0221\t\b\2\2\u0220"+
		"\u021f\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0226\7$\2\2\u0226"+
		"\u0228\3\2\2\2\u0227\u0208\3\2\2\2\u0227\u020c\3\2\2\2\u0228x\3\2\2\2"+
		"\u0229\u022a\7t\2\2\u022a\u022b\7g\2\2\u022b\u022c\7w\2\2\u022c\u022d"+
		"\7u\2\2\u022d\u022e\7g\2\2\u022e\u0230\3\2\2\2\u022f\u0231\7\"\2\2\u0230"+
		"\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2"+
		"\2\2\u0233\u0235\3\2\2\2\u0234\u0236\5\r\7\2\u0235\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2"+
		"\2\2\u0239\u023a\7\f\2\2\u023az\3\2\2\2\u023b\u023c\7t\2\2\u023c\u023d"+
		"\7g\2\2\u023d\u023e\7w\2\2\u023e\u023f\7u\2\2\u023f\u0240\7g\2\2\u0240"+
		"\u0242\3\2\2\2\u0241\u0243\7\"\2\2\u0242\u0241\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246"+
		"\u0248\5\r\7\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0247\3\2"+
		"\2\2\u0249\u024a\3\2\2\2\u024a|\3\2\2\2\u024b\u024d\5\23\n\2\u024c\u024e"+
		"\5\177@\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2\2\2"+
		"\u024f\u024b\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\u0258\3\2\2\2\u0253\u0255\5\25\13\2\u0254\u0256\5\177@"+
		"\2\u0255\u0254\3\2\2\2\u0255\u0256\3\2\2\2\u0256\u0258\3\2\2\2\u0257\u024f"+
		"\3\2\2\2\u0257\u0253\3\2\2\2\u0258~\3\2\2\2\u0259\u025b\t\t\2\2\u025a"+
		"\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025d\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025e\u025f\b@\2\2\u025f\u0080\3\2\2\2\u0260"+
		"\u0261\t\n\2\2\u0261\u0082\3\2\2\2\u0262\u0263\7-\2\2\u0263\u0282\7?\2"+
		"\2\u0264\u0265\7/\2\2\u0265\u0282\7?\2\2\u0266\u0267\7,\2\2\u0267\u0282"+
		"\7?\2\2\u0268\u0269\7\61\2\2\u0269\u0282\7?\2\2\u026a\u026b\7(\2\2\u026b"+
		"\u0282\7?\2\2\u026c\u026d\7~\2\2\u026d\u0282\7?\2\2\u026e\u026f\7<\2\2"+
		"\u026f\u0282\7?\2\2\u0270\u0271\7-\2\2\u0271\u0272\7-\2\2\u0272\u0282"+
		"\7?\2\2\u0273\u0274\7,\2\2\u0274\u0275\7,\2\2\u0275\u0282\7?\2\2\u0276"+
		"\u0277\7/\2\2\u0277\u0278\7/\2\2\u0278\u0282\7?\2\2\u0279\u027a\7>\2\2"+
		"\u027a\u027b\7@\2\2\u027b\u027c\7>\2\2\u027c\u0282\7?\2\2\u027d\u027e"+
		"\7@\2\2\u027e\u027f\7>\2\2\u027f\u0280\7@\2\2\u0280\u0282\7?\2\2\u0281"+
		"\u0262\3\2\2\2\u0281\u0264\3\2\2\2\u0281\u0266\3\2\2\2\u0281\u0268\3\2"+
		"\2\2\u0281\u026a\3\2\2\2\u0281\u026c\3\2\2\2\u0281\u026e\3\2\2\2\u0281"+
		"\u0270\3\2\2\2\u0281\u0273\3\2\2\2\u0281\u0276\3\2\2\2\u0281\u0279\3\2"+
		"\2\2\u0281\u027d\3\2\2\2\u0282\u0084\3\2\2\2\u0283\u0284\t\13\2\2\u0284"+
		"\u0086\3\2\2\2\u0285\u02b1\t\f\2\2\u0286\u0287\7?\2\2\u0287\u02b1\7?\2"+
		"\2\u0288\u0289\7>\2\2\u0289\u02b1\7?\2\2\u028a\u028b\7@\2\2\u028b\u02b1"+
		"\7?\2\2\u028c\u028d\7>\2\2\u028d\u02b1\7>\2\2\u028e\u028f\7@\2\2\u028f"+
		"\u02b1\7@\2\2\u0290\u0291\7>\2\2\u0291\u0292\7>\2\2\u0292\u02b1\7?\2\2"+
		"\u0293\u0294\7@\2\2\u0294\u0295\7@\2\2\u0295\u02b1\7?\2\2\u0296\u0297"+
		"\7#\2\2\u0297\u02b1\7>\2\2\u0298\u0299\7#\2\2\u0299\u02b1\7@\2\2\u029a"+
		"\u029b\7#\2\2\u029b\u02b1\7?\2\2\u029c\u029d\7#\2\2\u029d\u029e\7>\2\2"+
		"\u029e\u02b1\7?\2\2\u029f\u02a0\7#\2\2\u02a0\u02a1\7@\2\2\u02a1\u02b1"+
		"\7?\2\2\u02a2\u02a3\7#\2\2\u02a3\u02a4\7>\2\2\u02a4\u02b1\7>\2\2\u02a5"+
		"\u02a6\7#\2\2\u02a6\u02a7\7@\2\2\u02a7\u02b1\7@\2\2\u02a8\u02a9\7#\2\2"+
		"\u02a9\u02aa\7>\2\2\u02aa\u02ab\7>\2\2\u02ab\u02b1\7?\2\2\u02ac\u02ad"+
		"\7#\2\2\u02ad\u02ae\7@\2\2\u02ae\u02af\7@\2\2\u02af\u02b1\7?\2\2\u02b0"+
		"\u0285\3\2\2\2\u02b0\u0286\3\2\2\2\u02b0\u0288\3\2\2\2\u02b0\u028a\3\2"+
		"\2\2\u02b0\u028c\3\2\2\2\u02b0\u028e\3\2\2\2\u02b0\u0290\3\2\2\2\u02b0"+
		"\u0293\3\2\2\2\u02b0\u0296\3\2\2\2\u02b0\u0298\3\2\2\2\u02b0\u029a\3\2"+
		"\2\2\u02b0\u029c\3\2\2\2\u02b0\u029f\3\2\2\2\u02b0\u02a2\3\2\2\2\u02b0"+
		"\u02a5\3\2\2\2\u02b0\u02a8\3\2\2\2\u02b0\u02ac\3\2\2\2\u02b1\u0088\3\2"+
		"\2\2\u02b2\u02c1\t\r\2\2\u02b3\u02b4\7/\2\2\u02b4\u02c1\7/\2\2\u02b5\u02c1"+
		"\t\16\2\2\u02b6\u02b7\7-\2\2\u02b7\u02c1\7-\2\2\u02b8\u02b9\7,\2\2\u02b9"+
		"\u02c1\7,\2\2\u02ba\u02bb\7>\2\2\u02bb\u02bc\7@\2\2\u02bc\u02c1\7>\2\2"+
		"\u02bd\u02be\7@\2\2\u02be\u02bf\7>\2\2\u02bf\u02c1\7@\2\2\u02c0\u02b2"+
		"\3\2\2\2\u02c0\u02b3\3\2\2\2\u02c0\u02b5\3\2\2\2\u02c0\u02b6\3\2\2\2\u02c0"+
		"\u02b8\3\2\2\2\u02c0\u02ba\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c1\u008a\3\2"+
		"\2\2\u02c2\u02c6\5\7\4\2\u02c3\u02c5\5\33\16\2\u02c4\u02c3\3\2\2\2\u02c5"+
		"\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u008c\3\2"+
		"\2\2\u02c8\u02c6\3\2\2\2*\2\u0097\u0099\u00aa\u00b4\u00b6\u00c0\u00c8"+
		"\u00d0\u0100\u01c1\u01c9\u01d3\u01d5\u01df\u01e1\u01e9\u01eb\u01f7\u01f9"+
		"\u0203\u0205\u0210\u0217\u021d\u0222\u0227\u0232\u0237\u0244\u0249\u024d"+
		"\u0251\u0255\u0257\u025c\u0281\u02b0\u02c0\u02c6\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}