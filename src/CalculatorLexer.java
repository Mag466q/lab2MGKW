// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FLOAT=1, LPAREN=2, RPAREN=3, LABS=4, PABS=5, POV=6, SQRT=7, INT=8, DOT=9, 
		TIMES=10, DIV=11, PLUS=12, MINUS=13, WS=14, MOD=15, COS=16, SIN=17, TAN=18, 
		ACOS=19, ASIN=20, ATAN=21, LOG=22, PI=23, E=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FLOAT", "LPAREN", "RPAREN", "LABS", "PABS", "POV", "SQRT", "INT", "DOT", 
			"TIMES", "DIV", "PLUS", "MINUS", "WS", "MOD", "COS", "SIN", "TAN", "ACOS", 
			"ASIN", "ATAN", "LOG", "PI", "E"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'['", "']'", "'^'", "'P'", null, "'.'", "'*'", 
			"'/'", "'+'", "'-'", null, "'mod'", "'cos'", "'sin'", "'tan'", "'acos'", 
			"'asin'", "'atan'", "'log'", "'PI'", "'E'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FLOAT", "LPAREN", "RPAREN", "LABS", "PABS", "POV", "SQRT", "INT", 
			"DOT", "TIMES", "DIV", "PLUS", "MINUS", "WS", "MOD", "COS", "SIN", "TAN", 
			"ACOS", "ASIN", "ATAN", "LOG", "PI", "E"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\u0004\u0000\u0018\u0087\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0004\u00003\b\u0000\u000b\u0000\f\u00004\u0001\u0000\u0001"+
		"\u0000\u0005\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0004"+
		"\u0007K\b\u0007\u000b\u0007\f\u0007L\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0004\rZ\b"+
		"\r\u000b\r\f\r[\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0000\u0000\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u0018\u0001\u0000\u0002\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  \u008a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00012\u0001\u0000\u0000"+
		"\u0000\u0003=\u0001\u0000\u0000\u0000\u0005?\u0001\u0000\u0000\u0000\u0007"+
		"A\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000bE\u0001\u0000"+
		"\u0000\u0000\rG\u0001\u0000\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000"+
		"\u0011N\u0001\u0000\u0000\u0000\u0013P\u0001\u0000\u0000\u0000\u0015R"+
		"\u0001\u0000\u0000\u0000\u0017T\u0001\u0000\u0000\u0000\u0019V\u0001\u0000"+
		"\u0000\u0000\u001bY\u0001\u0000\u0000\u0000\u001d_\u0001\u0000\u0000\u0000"+
		"\u001fc\u0001\u0000\u0000\u0000!g\u0001\u0000\u0000\u0000#k\u0001\u0000"+
		"\u0000\u0000%o\u0001\u0000\u0000\u0000\'t\u0001\u0000\u0000\u0000)y\u0001"+
		"\u0000\u0000\u0000+~\u0001\u0000\u0000\u0000-\u0082\u0001\u0000\u0000"+
		"\u0000/\u0085\u0001\u0000\u0000\u000013\u0003\u000f\u0007\u000021\u0001"+
		"\u0000\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u00006:\u0003\u0011\b\u0000"+
		"79\u0003\u000f\u0007\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0002\u0001"+
		"\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005(\u0000\u0000>\u0004"+
		"\u0001\u0000\u0000\u0000?@\u0005)\u0000\u0000@\u0006\u0001\u0000\u0000"+
		"\u0000AB\u0005[\u0000\u0000B\b\u0001\u0000\u0000\u0000CD\u0005]\u0000"+
		"\u0000D\n\u0001\u0000\u0000\u0000EF\u0005^\u0000\u0000F\f\u0001\u0000"+
		"\u0000\u0000GH\u0005P\u0000\u0000H\u000e\u0001\u0000\u0000\u0000IK\u0007"+
		"\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000M\u0010\u0001\u0000"+
		"\u0000\u0000NO\u0005.\u0000\u0000O\u0012\u0001\u0000\u0000\u0000PQ\u0005"+
		"*\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000RS\u0005/\u0000\u0000S\u0016"+
		"\u0001\u0000\u0000\u0000TU\u0005+\u0000\u0000U\u0018\u0001\u0000\u0000"+
		"\u0000VW\u0005-\u0000\u0000W\u001a\u0001\u0000\u0000\u0000XZ\u0007\u0001"+
		"\u0000\u0000YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]^\u0006\r\u0000\u0000^\u001c\u0001\u0000\u0000\u0000_`\u0005m\u0000\u0000"+
		"`a\u0005o\u0000\u0000ab\u0005d\u0000\u0000b\u001e\u0001\u0000\u0000\u0000"+
		"cd\u0005c\u0000\u0000de\u0005o\u0000\u0000ef\u0005s\u0000\u0000f \u0001"+
		"\u0000\u0000\u0000gh\u0005s\u0000\u0000hi\u0005i\u0000\u0000ij\u0005n"+
		"\u0000\u0000j\"\u0001\u0000\u0000\u0000kl\u0005t\u0000\u0000lm\u0005a"+
		"\u0000\u0000mn\u0005n\u0000\u0000n$\u0001\u0000\u0000\u0000op\u0005a\u0000"+
		"\u0000pq\u0005c\u0000\u0000qr\u0005o\u0000\u0000rs\u0005s\u0000\u0000"+
		"s&\u0001\u0000\u0000\u0000tu\u0005a\u0000\u0000uv\u0005s\u0000\u0000v"+
		"w\u0005i\u0000\u0000wx\u0005n\u0000\u0000x(\u0001\u0000\u0000\u0000yz"+
		"\u0005a\u0000\u0000z{\u0005t\u0000\u0000{|\u0005a\u0000\u0000|}\u0005"+
		"n\u0000\u0000}*\u0001\u0000\u0000\u0000~\u007f\u0005l\u0000\u0000\u007f"+
		"\u0080\u0005o\u0000\u0000\u0080\u0081\u0005g\u0000\u0000\u0081,\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005P\u0000\u0000\u0083\u0084\u0005I\u0000"+
		"\u0000\u0084.\u0001\u0000\u0000\u0000\u0085\u0086\u0005E\u0000\u0000\u0086"+
		"0\u0001\u0000\u0000\u0000\u0005\u00004:L[\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}