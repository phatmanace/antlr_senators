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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, COMMENT=16, 
		ID=17, NUM=18, WS=19, NL=20;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "COMMENT", "ID", 
		"NUM", "WS", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'$'", "'=\"'", "'\"'", "'~delete'", "'~printhouse'", 
		"'~displayhouse'", "'for('", "','", "'){'", "'}'", "';'", "'D'", "'R'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "COMMENT", "ID", "NUM", "WS", "NL"
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
		case 15: 
			COMMENT_action((RuleContext)_localctx, actionIndex); 
			break;

		case 18: 
			WS_action((RuleContext)_localctx, actionIndex); 
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: 
			skip(); 
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: 
			skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\26\u0090\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\7\21o\n\21\f\21\16\21r\13\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\6\22z\n\22\r\22\16\22{\3\23\6\23\177\n\23\r"+
		"\23\16\23\u0080\3\24\6\24\u0084\n\24\r\24\16\24\u0085\3\24\3\24\3\25\5"+
		"\25\u008b\n\25\3\25\3\25\5\25\u008f\n\25\3p\2\26\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26\3\2\5\4\2C\\c|\3\2\62;\4\2\13\f\"\"\u0095\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\64\3"+
		"\2\2\2\r\66\3\2\2\2\17>\3\2\2\2\21J\3\2\2\2\23X\3\2\2\2\25]\3\2\2\2\27"+
		"_\3\2\2\2\31b\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2!j\3\2\2\2#y"+
		"\3\2\2\2%~\3\2\2\2\'\u0083\3\2\2\2)\u008e\3\2\2\2+,\7*\2\2,\4\3\2\2\2"+
		"-.\7+\2\2.\6\3\2\2\2/\60\7&\2\2\60\b\3\2\2\2\61\62\7?\2\2\62\63\7$\2\2"+
		"\63\n\3\2\2\2\64\65\7$\2\2\65\f\3\2\2\2\66\67\7\u0080\2\2\678\7f\2\28"+
		"9\7g\2\29:\7n\2\2:;\7g\2\2;<\7v\2\2<=\7g\2\2=\16\3\2\2\2>?\7\u0080\2\2"+
		"?@\7r\2\2@A\7t\2\2AB\7k\2\2BC\7p\2\2CD\7v\2\2DE\7j\2\2EF\7q\2\2FG\7w\2"+
		"\2GH\7u\2\2HI\7g\2\2I\20\3\2\2\2JK\7\u0080\2\2KL\7f\2\2LM\7k\2\2MN\7u"+
		"\2\2NO\7r\2\2OP\7n\2\2PQ\7c\2\2QR\7{\2\2RS\7j\2\2ST\7q\2\2TU\7w\2\2UV"+
		"\7u\2\2VW\7g\2\2W\22\3\2\2\2XY\7h\2\2YZ\7q\2\2Z[\7t\2\2[\\\7*\2\2\\\24"+
		"\3\2\2\2]^\7.\2\2^\26\3\2\2\2_`\7+\2\2`a\7}\2\2a\30\3\2\2\2bc\7\177\2"+
		"\2c\32\3\2\2\2de\7=\2\2e\34\3\2\2\2fg\7F\2\2g\36\3\2\2\2hi\7T\2\2i \3"+
		"\2\2\2jk\7\61\2\2kl\7,\2\2lp\3\2\2\2mo\13\2\2\2nm\3\2\2\2or\3\2\2\2pq"+
		"\3\2\2\2pn\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7,\2\2tu\7\61\2\2uv\3\2\2\2v"+
		"w\b\21\2\2w\"\3\2\2\2xz\t\2\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|\3\2\2"+
		"\2|$\3\2\2\2}\177\t\3\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081&\3\2\2\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2"+
		"\u0084\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\u0088\b\24\3\2\u0088(\3\2\2\2\u0089\u008b\7\17\2\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008f\7\f"+
		"\2\2\u008d\u008f\7\17\2\2\u008e\u008a\3\2\2\2\u008e\u008d\3\2\2\2\u008f"+
		"*\3\2\2\2\t\2p{\u0080\u0085\u008a\u008e\4\3\21\2\3\24\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}