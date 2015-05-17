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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ENDOFSTATEMENT=18, COMMENT=19, ID=20, NUM=21, WS=22, NL=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"ENDOFSTATEMENT", "COMMENT", "ID", "NUM", "WS", "NL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'->(\"'", "'('", "')\")'", "'$'", "'=\"'", "'\"'", "'~wait('", 
		"')'", "'~delete'", "'~printhouse'", "'~displayhouse'", "'for('", "','", 
		"'){'", "'}'", "'D'", "'R'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ENDOFSTATEMENT", "COMMENT", "ID", 
		"NUM", "WS", "NL"
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
		case 18: 
			COMMENT_action((RuleContext)_localctx, actionIndex); 
			break;

		case 21: 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00a6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\7\24\u0085\n\24\f\24\16\24\u0088\13\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\6\25\u0090\n\25\r\25\16\25\u0091\3\26\6\26\u0095\n\26\r\26\16"+
		"\26\u0096\3\27\6\27\u009a\n\27\r\27\16\27\u009b\3\27\3\27\3\30\5\30\u00a1"+
		"\n\30\3\30\3\30\5\30\u00a5\n\30\3\u0086\2\31\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\3\2\5\4\2C\\c|\3\2\62;\4\2\13\f\"\"\u00ab\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5"+
		"\66\3\2\2\2\78\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21"+
		"J\3\2\2\2\23L\3\2\2\2\25T\3\2\2\2\27`\3\2\2\2\31n\3\2\2\2\33s\3\2\2\2"+
		"\35u\3\2\2\2\37x\3\2\2\2!z\3\2\2\2#|\3\2\2\2%~\3\2\2\2\'\u0080\3\2\2\2"+
		")\u008f\3\2\2\2+\u0094\3\2\2\2-\u0099\3\2\2\2/\u00a4\3\2\2\2\61\62\7/"+
		"\2\2\62\63\7@\2\2\63\64\7*\2\2\64\65\7$\2\2\65\4\3\2\2\2\66\67\7*\2\2"+
		"\67\6\3\2\2\289\7+\2\29:\7$\2\2:;\7+\2\2;\b\3\2\2\2<=\7&\2\2=\n\3\2\2"+
		"\2>?\7?\2\2?@\7$\2\2@\f\3\2\2\2AB\7$\2\2B\16\3\2\2\2CD\7\u0080\2\2DE\7"+
		"y\2\2EF\7c\2\2FG\7k\2\2GH\7v\2\2HI\7*\2\2I\20\3\2\2\2JK\7+\2\2K\22\3\2"+
		"\2\2LM\7\u0080\2\2MN\7f\2\2NO\7g\2\2OP\7n\2\2PQ\7g\2\2QR\7v\2\2RS\7g\2"+
		"\2S\24\3\2\2\2TU\7\u0080\2\2UV\7r\2\2VW\7t\2\2WX\7k\2\2XY\7p\2\2YZ\7v"+
		"\2\2Z[\7j\2\2[\\\7q\2\2\\]\7w\2\2]^\7u\2\2^_\7g\2\2_\26\3\2\2\2`a\7\u0080"+
		"\2\2ab\7f\2\2bc\7k\2\2cd\7u\2\2de\7r\2\2ef\7n\2\2fg\7c\2\2gh\7{\2\2hi"+
		"\7j\2\2ij\7q\2\2jk\7w\2\2kl\7u\2\2lm\7g\2\2m\30\3\2\2\2no\7h\2\2op\7q"+
		"\2\2pq\7t\2\2qr\7*\2\2r\32\3\2\2\2st\7.\2\2t\34\3\2\2\2uv\7+\2\2vw\7}"+
		"\2\2w\36\3\2\2\2xy\7\177\2\2y \3\2\2\2z{\7F\2\2{\"\3\2\2\2|}\7T\2\2}$"+
		"\3\2\2\2~\177\7=\2\2\177&\3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7,"+
		"\2\2\u0082\u0086\3\2\2\2\u0083\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7,\2\2\u008a\u008b\7\61\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\b\24\2\2\u008d(\3\2\2\2\u008e\u0090\t\2\2\2"+
		"\u008f\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092*\3\2\2\2\u0093\u0095\t\3\2\2\u0094\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097,\3\2\2\2"+
		"\u0098\u009a\t\4\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\b\27\3\2"+
		"\u009e.\3\2\2\2\u009f\u00a1\7\17\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a5\7\f\2\2\u00a3\u00a5\7\17\2\2\u00a4"+
		"\u00a0\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\60\3\2\2\2\t\2\u0086\u0091\u0096"+
		"\u009b\u00a0\u00a4\4\3\24\2\3\27\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}