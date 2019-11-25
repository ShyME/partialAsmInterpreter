// Generated from D:/SQL/Sem_5/JFK/l1interpreter/src/main/antlr4\Asm.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AsmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, NL=4, WS=5, INSTRUCTION_TYPE=6, REGISTER=7, OPERATOR=8, 
		NUMBER=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "DIGIT", "HEX_NUMBER", "NL", "WS", "INSTRUCTION_TYPE", 
			"REGISTER", "OPERATOR", "NUMBER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "NL", "WS", "INSTRUCTION_TYPE", "REGISTER", "OPERATOR", 
			"NUMBER"
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


	public AsmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Asm.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13W\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\6\6&\n\6\r"+
		"\6\16\6\'\3\7\3\7\3\b\6\b-\n\b\r\b\16\b.\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t@\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\nL\n\n\3\13\3\13\3\f\6\fQ\n\f\r\f\16\fR\3\f\5\fV\n\f\2\2"+
		"\r\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23\t\25\n\27\13\3\2\6\3\2\62;\3"+
		"\2\f\f\5\2\13\f\17\17\"\"\4\2,-//\2]\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2"+
		"\2\r)\3\2\2\2\17,\3\2\2\2\21?\3\2\2\2\23A\3\2\2\2\25M\3\2\2\2\27U\3\2"+
		"\2\2\31\32\7.\2\2\32\4\3\2\2\2\33\34\7*\2\2\34\6\3\2\2\2\35\36\7+\2\2"+
		"\36\b\3\2\2\2\37 \t\2\2\2 \n\3\2\2\2!\"\7\62\2\2\"#\7z\2\2#%\3\2\2\2$"+
		"&\5\t\5\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(\f\3\2\2\2)*\t\3"+
		"\2\2*\16\3\2\2\2+-\t\4\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60"+
		"\3\2\2\2\60\61\b\b\2\2\61\20\3\2\2\2\62\63\7o\2\2\63\64\7q\2\2\64@\7x"+
		"\2\2\65\66\7r\2\2\66\67\7w\2\2\678\7u\2\28@\7j\2\29:\7k\2\2:;\7p\2\2;"+
		"@\7v\2\2<=\7z\2\2=>\7q\2\2>@\7t\2\2?\62\3\2\2\2?\65\3\2\2\2?9\3\2\2\2"+
		"?<\3\2\2\2@\22\3\2\2\2AK\7\'\2\2BC\7g\2\2CD\7d\2\2DL\7z\2\2EF\7g\2\2F"+
		"G\7e\2\2GL\7z\2\2HI\7g\2\2IJ\7f\2\2JL\7z\2\2KB\3\2\2\2KE\3\2\2\2KH\3\2"+
		"\2\2L\24\3\2\2\2MN\t\5\2\2N\26\3\2\2\2OQ\5\t\5\2PO\3\2\2\2QR\3\2\2\2R"+
		"P\3\2\2\2RS\3\2\2\2SV\3\2\2\2TV\5\13\6\2UP\3\2\2\2UT\3\2\2\2V\30\3\2\2"+
		"\2\t\2\'.?KRU\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}