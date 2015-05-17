// Generated from /Users/phatmanace/IdeaProjects/antlr_senators/grammar/SimpleVar.g4 by ANTLR 4.5
package com.aceman.SimpleVars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleVarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, ENDOFSTATEMENT=4, ID=5, NUM=6, WS=7, NL=8;
	public static final int
		RULE_stmt = 0, RULE_programexpression = 1, RULE_progstmt = 2, RULE_assignvar = 3;
	public static final String[] ruleNames = {
		"stmt", "programexpression", "progstmt", "assignvar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", "'=\"'", "'\"'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "ENDOFSTATEMENT", "ID", "NUM", "WS", "NL"
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

	@Override
	public String getGrammarFileName() { return "SimpleVar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleVarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TopLevelRuleContext extends StmtContext {
		public List<ProgramexpressionContext> programexpression() {
			return getRuleContexts(ProgramexpressionContext.class);
		}
		public ProgramexpressionContext programexpression(int i) {
			return getRuleContext(ProgramexpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(SimpleVarParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(SimpleVarParser.WS, i);
		}
		public TopLevelRuleContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVarListener ) ((SimpleVarListener)listener).enterTopLevelRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVarListener ) ((SimpleVarListener)listener).exitTopLevelRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVarVisitor ) return ((SimpleVarVisitor<? extends T>)visitor).visitTopLevelRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stmt);
		int _la;
		try {
			_localctx = new TopLevelRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(8); 
				programexpression();
				}
				setState(10);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(9); 
					match(WS);
					}
				}

				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramexpressionContext extends ParserRuleContext {
		public ProgstmtContext progstmt() {
			return getRuleContext(ProgstmtContext.class,0);
		}
		public TerminalNode ENDOFSTATEMENT() { return getToken(SimpleVarParser.ENDOFSTATEMENT, 0); }
		public ProgramexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVarListener ) ((SimpleVarListener)listener).enterProgramexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVarListener ) ((SimpleVarListener)listener).exitProgramexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVarVisitor ) return ((SimpleVarVisitor<? extends T>)visitor).visitProgramexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramexpressionContext programexpression() throws RecognitionException {
		ProgramexpressionContext _localctx = new ProgramexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); 
			progstmt();
			setState(17); 
			match(ENDOFSTATEMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgstmtContext extends ParserRuleContext {
		public AssignvarContext assignvar() {
			return getRuleContext(AssignvarContext.class,0);
		}
		public TerminalNode WS() { return getToken(SimpleVarParser.WS, 0); }
		public ProgstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVarListener ) ((SimpleVarListener)listener).enterProgstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVarListener ) ((SimpleVarListener)listener).exitProgstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVarVisitor ) return ((SimpleVarVisitor<? extends T>)visitor).visitProgstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgstmtContext progstmt() throws RecognitionException {
		ProgstmtContext _localctx = new ProgstmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_progstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(19); 
			assignvar();
			}
			setState(21);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(20); 
				match(WS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignvarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SimpleVarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SimpleVarParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(SimpleVarParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SimpleVarParser.NUM, i);
		}
		public AssignvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVarListener ) ((SimpleVarListener)listener).enterAssignvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleVarListener ) ((SimpleVarListener)listener).exitAssignvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleVarVisitor ) return ((SimpleVarVisitor<? extends T>)visitor).visitAssignvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignvarContext assignvar() throws RecognitionException {
		AssignvarContext _localctx = new AssignvarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			match(T__0);
			setState(24); 
			match(ID);
			setState(25); 
			match(T__1);
			setState(36);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(26); 
					match(ID);
					}
					}
					setState(29); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case NUM:
				{
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(31); 
					match(NUM);
					}
					}
					setState(34); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(38); 
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n+\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\5\2\r\n\2\6\2\17\n\2\r\2\16\2\20\3\3\3\3\3"+
		"\3\3\4\3\4\5\4\30\n\4\3\5\3\5\3\5\3\5\6\5\36\n\5\r\5\16\5\37\3\5\6\5#"+
		"\n\5\r\5\16\5$\5\5\'\n\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2,\2\16\3\2\2\2\4"+
		"\22\3\2\2\2\6\25\3\2\2\2\b\31\3\2\2\2\n\f\5\4\3\2\13\r\7\t\2\2\f\13\3"+
		"\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2\16\n\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2"+
		"\2\20\21\3\2\2\2\21\3\3\2\2\2\22\23\5\6\4\2\23\24\7\6\2\2\24\5\3\2\2\2"+
		"\25\27\5\b\5\2\26\30\7\t\2\2\27\26\3\2\2\2\27\30\3\2\2\2\30\7\3\2\2\2"+
		"\31\32\7\3\2\2\32\33\7\7\2\2\33&\7\4\2\2\34\36\7\7\2\2\35\34\3\2\2\2\36"+
		"\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \'\3\2\2\2!#\7\b\2\2\"!\3\2\2\2"+
		"#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&\35\3\2\2\2&\"\3\2\2\2\'(\3"+
		"\2\2\2()\7\5\2\2)\t\3\2\2\2\b\f\20\27\37$&";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}