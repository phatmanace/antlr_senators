// Generated from /Users/phatmanace/IdeaProjects/antlr_senators/grammar/Senator.g4 by ANTLR 4.5
package com.aceman;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SenatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, NUM=17, 
		WS=18, NL=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ID", "NUM", "WS", 
		"NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'$'", "'=\"'", "'\"'", "'~delete'", "'~printhouse'", 
		"'~displayhouse'", "'for('", "','", "'){'", "'}'", "';'", "'D'", "'R'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ID", "NUM", "WS", "NL"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SenatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Senator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 17: 
			WS_action((RuleContext)_localctx, actionIndex); 
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: 
			skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\6\21j\n\21\r\21\16\21k\3\22\6\22o\n\22\r\22\16\22p\3\23\6\23"+
		"t\n\23\r\23\16\23u\3\23\3\23\3\24\5\24{\n\24\3\24\3\24\5\24\177\n\24\2"+
		"\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25\3\2\5\3\2c|\3\2\62;\4\2\13\f\"\"\u0084\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13"+
		"\62\3\2\2\2\r\64\3\2\2\2\17<\3\2\2\2\21H\3\2\2\2\23V\3\2\2\2\25[\3\2\2"+
		"\2\27]\3\2\2\2\31`\3\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!i\3\2\2"+
		"\2#n\3\2\2\2%s\3\2\2\2\'~\3\2\2\2)*\7*\2\2*\4\3\2\2\2+,\7+\2\2,\6\3\2"+
		"\2\2-.\7&\2\2.\b\3\2\2\2/\60\7?\2\2\60\61\7$\2\2\61\n\3\2\2\2\62\63\7"+
		"$\2\2\63\f\3\2\2\2\64\65\7\u0080\2\2\65\66\7f\2\2\66\67\7g\2\2\678\7n"+
		"\2\289\7g\2\29:\7v\2\2:;\7g\2\2;\16\3\2\2\2<=\7\u0080\2\2=>\7r\2\2>?\7"+
		"t\2\2?@\7k\2\2@A\7p\2\2AB\7v\2\2BC\7j\2\2CD\7q\2\2DE\7w\2\2EF\7u\2\2F"+
		"G\7g\2\2G\20\3\2\2\2HI\7\u0080\2\2IJ\7f\2\2JK\7k\2\2KL\7u\2\2LM\7r\2\2"+
		"MN\7n\2\2NO\7c\2\2OP\7{\2\2PQ\7j\2\2QR\7q\2\2RS\7w\2\2ST\7u\2\2TU\7g\2"+
		"\2U\22\3\2\2\2VW\7h\2\2WX\7q\2\2XY\7t\2\2YZ\7*\2\2Z\24\3\2\2\2[\\\7.\2"+
		"\2\\\26\3\2\2\2]^\7+\2\2^_\7}\2\2_\30\3\2\2\2`a\7\177\2\2a\32\3\2\2\2"+
		"bc\7=\2\2c\34\3\2\2\2de\7F\2\2e\36\3\2\2\2fg\7T\2\2g \3\2\2\2hj\t\2\2"+
		"\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\"\3\2\2\2mo\t\3\2\2nm\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q$\3\2\2\2rt\t\4\2\2sr\3\2\2\2tu\3\2"+
		"\2\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\b\23\2\2x&\3\2\2\2y{\7\17\2\2zy\3"+
		"\2\2\2z{\3\2\2\2{|\3\2\2\2|\177\7\f\2\2}\177\7\17\2\2~z\3\2\2\2~}\3\2"+
		"\2\2\177(\3\2\2\2\b\2kpuz~\3\3\23\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}