// Generated from /Users/phatmanace/IdeaProjects/antlr_senators/grammar/Senator.g4 by ANTLR 4.5
package com.aceman;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SenatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, ENDOFSTATEMENT=27, TEST_OPERATOR=28, COMMENT=29, COMMA=30, 
		STRING_LITERAL=31, ID=32, NUM=33, WS=34, NL=35;
	public static final int
		RULE_stmt = 0, RULE_programexpression = 1, RULE_progstmt = 2, RULE_senatordfn = 3, 
		RULE_ifstmt = 4, RULE_conditionaltest = 5, RULE_assignvar = 6, RULE_swait = 7, 
		RULE_loopexit = 8, RULE_deletevar = 9, RULE_returnstatement = 10, RULE_constant = 11, 
		RULE_printhouse = 12, RULE_function = 13, RULE_functionbody = 14, RULE_functionproto = 15, 
		RULE_functionparam = 16, RULE_displayhouse = 17, RULE_prints = 18, RULE_functioncall = 19, 
		RULE_functioncallparam = 20, RULE_loop = 21, RULE_foridxitem = 22, RULE_senatorname = 23, 
		RULE_var = 24, RULE_firstname = 25, RULE_lastname = 26, RULE_type = 27, 
		RULE_party = 28;
	public static final String[] ruleNames = {
		"stmt", "programexpression", "progstmt", "senatordfn", "ifstmt", "conditionaltest", 
		"assignvar", "swait", "loopexit", "deletevar", "returnstatement", "constant", 
		"printhouse", "function", "functionbody", "functionproto", "functionparam", 
		"displayhouse", "prints", "functioncall", "functioncallparam", "loop", 
		"foridxitem", "senatorname", "var", "firstname", "lastname", "type", "party"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'->(\"'", "'('", "')\")'", "'if('", "'){'", "'}'", "'$'", "'=\"'", 
		"'\"'", "'~wait('", "')'", "'~break'", "'~delete'", "'return'", "'~printhouse'", 
		"'function '", "') as'", "'{'", "'~displayhouse'", "'~print('", "'@'", 
		"'for('", "'int'", "'string'", "'D'", "'R'", "';'", null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "ENDOFSTATEMENT", "TEST_OPERATOR", "COMMENT", "COMMA", 
		"STRING_LITERAL", "ID", "NUM", "WS", "NL"
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
	public String getGrammarFileName() { return "Senator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SenatorParser(TokenStream input) {
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
		public List<TerminalNode> WS() { return getTokens(SenatorParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(SenatorParser.WS, i);
		}
		public TopLevelRuleContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterTopLevelRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitTopLevelRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitTopLevelRule(this);
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
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(58); 
				programexpression();
				}
				setState(60);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(59); 
					match(WS);
					}
					break;
				}
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ENDOFSTATEMENT) | (1L << ID) | (1L << NUM) | (1L << WS))) != 0) );
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
		public TerminalNode ENDOFSTATEMENT() { return getToken(SenatorParser.ENDOFSTATEMENT, 0); }
		public ProgramexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterProgramexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitProgramexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitProgramexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramexpressionContext programexpression() throws RecognitionException {
		ProgramexpressionContext _localctx = new ProgramexpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
			progstmt();
			setState(67); 
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
		public DeletevarContext deletevar() {
			return getRuleContext(DeletevarContext.class,0);
		}
		public PrinthouseContext printhouse() {
			return getRuleContext(PrinthouseContext.class,0);
		}
		public DisplayhouseContext displayhouse() {
			return getRuleContext(DisplayhouseContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public SwaitContext swait() {
			return getRuleContext(SwaitContext.class,0);
		}
		public SenatordfnContext senatordfn() {
			return getRuleContext(SenatordfnContext.class,0);
		}
		public LoopexitContext loopexit() {
			return getRuleContext(LoopexitContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctioncallContext functioncall() {
			return getRuleContext(FunctioncallContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public PrintsContext prints() {
			return getRuleContext(PrintsContext.class,0);
		}
		public TerminalNode WS() { return getToken(SenatorParser.WS, 0); }
		public ProgstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterProgstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitProgstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitProgstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgstmtContext progstmt() throws RecognitionException {
		ProgstmtContext _localctx = new ProgstmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_progstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			switch (_input.LA(1)) {
			case T__4:
			case ENDOFSTATEMENT:
			case TEST_OPERATOR:
			case WS:
				{
				}
				break;
			case T__6:
				{
				setState(70); 
				assignvar();
				}
				break;
			case T__12:
				{
				setState(71); 
				deletevar();
				}
				break;
			case T__14:
				{
				setState(72); 
				printhouse();
				}
				break;
			case T__18:
				{
				setState(73); 
				displayhouse();
				}
				break;
			case T__21:
				{
				setState(74); 
				loop();
				}
				break;
			case T__9:
				{
				setState(75); 
				swait();
				}
				break;
			case T__0:
				{
				setState(76); 
				senatordfn();
				}
				break;
			case T__11:
				{
				setState(77); 
				loopexit();
				}
				break;
			case T__15:
				{
				setState(78); 
				function();
				}
				break;
			case T__20:
				{
				setState(79); 
				functioncall();
				}
				break;
			case T__3:
				{
				setState(80); 
				ifstmt();
				}
				break;
			case T__13:
				{
				setState(81); 
				returnstatement();
				}
				break;
			case ID:
			case NUM:
				{
				setState(82); 
				constant();
				}
				break;
			case T__19:
				{
				setState(83); 
				prints();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(86); 
				match(WS);
				}
				break;
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

	public static class SenatordfnContext extends ParserRuleContext {
		public SenatornameContext senatorname() {
			return getRuleContext(SenatornameContext.class,0);
		}
		public PartyContext party() {
			return getRuleContext(PartyContext.class,0);
		}
		public TerminalNode WS() { return getToken(SenatorParser.WS, 0); }
		public SenatordfnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senatordfn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterSenatordfn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitSenatordfn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitSenatordfn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenatordfnContext senatordfn() throws RecognitionException {
		SenatordfnContext _localctx = new SenatordfnContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_senatordfn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			match(T__0);
			setState(90); 
			senatorname();
			setState(92);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(91); 
				match(WS);
				}
			}

			setState(94); 
			match(T__1);
			setState(95); 
			party();
			setState(96); 
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

	public static class IfstmtContext extends ParserRuleContext {
		public ConditionaltestContext conditionaltest() {
			return getRuleContext(ConditionaltestContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(SenatorParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(SenatorParser.WS, i);
		}
		public List<ProgramexpressionContext> programexpression() {
			return getRuleContexts(ProgramexpressionContext.class);
		}
		public ProgramexpressionContext programexpression(int i) {
			return getRuleContext(ProgramexpressionContext.class,i);
		}
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterIfstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitIfstmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitIfstmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); 
			match(T__3);
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(99); 
				match(WS);
				}
				break;
			}
			setState(102); 
			conditionaltest();
			setState(104);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(103); 
				match(WS);
				}
			}

			setState(106); 
			match(T__4);
			setState(114); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(107); 
					match(WS);
					}
					break;
				}
				setState(110); 
				programexpression();
				setState(112);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(111); 
					match(WS);
					}
					break;
				}
				}
				}
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ENDOFSTATEMENT) | (1L << ID) | (1L << NUM) | (1L << WS))) != 0) );
			setState(118); 
			match(T__5);
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

	public static class ConditionaltestContext extends ParserRuleContext {
		public List<ProgstmtContext> progstmt() {
			return getRuleContexts(ProgstmtContext.class);
		}
		public ProgstmtContext progstmt(int i) {
			return getRuleContext(ProgstmtContext.class,i);
		}
		public TerminalNode TEST_OPERATOR() { return getToken(SenatorParser.TEST_OPERATOR, 0); }
		public List<TerminalNode> WS() { return getTokens(SenatorParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(SenatorParser.WS, i);
		}
		public ConditionaltestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionaltest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterConditionaltest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitConditionaltest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitConditionaltest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionaltestContext conditionaltest() throws RecognitionException {
		ConditionaltestContext _localctx = new ConditionaltestContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditionaltest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			progstmt();
			setState(122);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(121); 
				match(WS);
				}
			}

			setState(124); 
			match(TEST_OPERATOR);
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(125); 
				match(WS);
				}
				break;
			}
			setState(128); 
			progstmt();
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
		public List<TerminalNode> ID() { return getTokens(SenatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SenatorParser.ID, i);
		}
		public List<TerminalNode> NUM() { return getTokens(SenatorParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(SenatorParser.NUM, i);
		}
		public AssignvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterAssignvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitAssignvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitAssignvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignvarContext assignvar() throws RecognitionException {
		AssignvarContext _localctx = new AssignvarContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); 
			match(T__6);
			setState(131); 
			match(ID);
			setState(132); 
			match(T__7);
			setState(143);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133); 
					match(ID);
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case NUM:
				{
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138); 
					match(NUM);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(145); 
			match(T__8);
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

	public static class SwaitContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SenatorParser.NUM, 0); }
		public SwaitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swait; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterSwait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitSwait(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitSwait(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwaitContext swait() throws RecognitionException {
		SwaitContext _localctx = new SwaitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_swait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			match(T__9);
			setState(148); 
			match(NUM);
			setState(149); 
			match(T__10);
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

	public static class LoopexitContext extends ParserRuleContext {
		public LoopexitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopexit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterLoopexit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitLoopexit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitLoopexit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopexitContext loopexit() throws RecognitionException {
		LoopexitContext _localctx = new LoopexitContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_loopexit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); 
			match(T__11);
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

	public static class DeletevarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenatorParser.ID, 0); }
		public DeletevarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deletevar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterDeletevar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitDeletevar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitDeletevar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeletevarContext deletevar() throws RecognitionException {
		DeletevarContext _localctx = new DeletevarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_deletevar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); 
			match(T__12);
			setState(154); 
			match(ID);
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

	public static class ReturnstatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenatorParser.ID, 0); }
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterReturnstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitReturnstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitReturnstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); 
			match(T__13);
			setState(157); 
			match(ID);
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

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenatorParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SenatorParser.NUM, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PrinthouseContext extends ParserRuleContext {
		public PrinthouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printhouse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterPrinthouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitPrinthouse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitPrinthouse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrinthouseContext printhouse() throws RecognitionException {
		PrinthouseContext _localctx = new PrinthouseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_printhouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); 
			match(T__14);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenatorParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctionbodyContext functionbody() {
			return getRuleContext(FunctionbodyContext.class,0);
		}
		public List<FunctionprotoContext> functionproto() {
			return getRuleContexts(FunctionprotoContext.class);
		}
		public FunctionprotoContext functionproto(int i) {
			return getRuleContext(FunctionprotoContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(SenatorParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(SenatorParser.WS, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); 
			match(T__15);
			setState(164); 
			match(ID);
			setState(165); 
			match(T__1);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166); 
				functionproto();
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__22 || _la==T__23 );
			setState(171); 
			match(T__16);
			setState(173);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(172); 
				match(WS);
				}
			}

			setState(175); 
			type();
			setState(177);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(176); 
				match(WS);
				}
			}

			setState(179); 
			match(T__17);
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(180); 
				match(WS);
				}
				break;
			}
			setState(183); 
			functionbody();
			setState(185);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(184); 
				match(WS);
				}
			}

			setState(187); 
			match(T__5);
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

	public static class FunctionbodyContext extends ParserRuleContext {
		public List<ProgramexpressionContext> programexpression() {
			return getRuleContexts(ProgramexpressionContext.class);
		}
		public ProgramexpressionContext programexpression(int i) {
			return getRuleContext(ProgramexpressionContext.class,i);
		}
		public FunctionbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterFunctionbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitFunctionbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitFunctionbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionbodyContext functionbody() throws RecognitionException {
		FunctionbodyContext _localctx = new FunctionbodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionbody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(189); 
					programexpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(192); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FunctionprotoContext extends ParserRuleContext {
		public List<FunctionparamContext> functionparam() {
			return getRuleContexts(FunctionparamContext.class);
		}
		public FunctionparamContext functionparam(int i) {
			return getRuleContext(FunctionparamContext.class,i);
		}
		public FunctionprotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionproto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterFunctionproto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitFunctionproto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitFunctionproto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionprotoContext functionproto() throws RecognitionException {
		FunctionprotoContext _localctx = new FunctionprotoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionproto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(194); 
					functionparam();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(197); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FunctionparamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(SenatorParser.ID, 0); }
		public TerminalNode WS() { return getToken(SenatorParser.WS, 0); }
		public TerminalNode COMMA() { return getToken(SenatorParser.COMMA, 0); }
		public FunctionparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterFunctionparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitFunctionparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitFunctionparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionparamContext functionparam() throws RecognitionException {
		FunctionparamContext _localctx = new FunctionparamContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199); 
			type();
			setState(201);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(200); 
				match(WS);
				}
			}

			setState(203); 
			match(ID);
			setState(205);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(204); 
				match(COMMA);
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

	public static class DisplayhouseContext extends ParserRuleContext {
		public DisplayhouseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayhouse; }
	 
		public DisplayhouseContext() { }
		public void copyFrom(DisplayhouseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DisplayMyHouseContext extends DisplayhouseContext {
		public DisplayMyHouseContext(DisplayhouseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterDisplayMyHouse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitDisplayMyHouse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitDisplayMyHouse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayhouseContext displayhouse() throws RecognitionException {
		DisplayhouseContext _localctx = new DisplayhouseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_displayhouse);
		try {
			_localctx = new DisplayMyHouseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(207); 
			match(T__18);
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

	public static class PrintsContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SenatorParser.STRING_LITERAL, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(SenatorParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(SenatorParser.WS, i);
		}
		public PrintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterPrints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitPrints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitPrints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintsContext prints() throws RecognitionException {
		PrintsContext _localctx = new PrintsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209); 
			match(T__19);
			setState(211);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(210); 
				match(WS);
				}
			}

			setState(215);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(213); 
				match(STRING_LITERAL);
				}
				break;
			case T__6:
				{
				setState(214); 
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(218);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(217); 
				match(WS);
				}
			}

			setState(220); 
			match(T__10);
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

	public static class FunctioncallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenatorParser.ID, 0); }
		public List<FunctioncallparamContext> functioncallparam() {
			return getRuleContexts(FunctioncallparamContext.class);
		}
		public FunctioncallparamContext functioncallparam(int i) {
			return getRuleContext(FunctioncallparamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SenatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SenatorParser.COMMA, i);
		}
		public FunctioncallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterFunctioncall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitFunctioncall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitFunctioncall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallContext functioncall() throws RecognitionException {
		FunctioncallContext _localctx = new FunctioncallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			match(T__20);
			setState(223); 
			match(ID);
			setState(224); 
			match(T__1);
			setState(229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225); 
				functioncallparam();
				setState(227);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(226); 
					match(COMMA);
					}
				}

				}
				}
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) );
			setState(233); 
			match(T__10);
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

	public static class FunctioncallparamContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SenatorParser.STRING_LITERAL, 0); }
		public TerminalNode NUM() { return getToken(SenatorParser.NUM, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public FunctioncallparamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functioncallparam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterFunctioncallparam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitFunctioncallparam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitFunctioncallparam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctioncallparamContext functioncallparam() throws RecognitionException {
		FunctioncallparamContext _localctx = new FunctioncallparamContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functioncallparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(235); 
				match(STRING_LITERAL);
				}
				break;
			case NUM:
				{
				setState(236); 
				match(NUM);
				}
				break;
			case T__6:
				{
				setState(237); 
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LoopContext extends ParserRuleContext {
		public List<ForidxitemContext> foridxitem() {
			return getRuleContexts(ForidxitemContext.class);
		}
		public ForidxitemContext foridxitem(int i) {
			return getRuleContext(ForidxitemContext.class,i);
		}
		public List<ProgramexpressionContext> programexpression() {
			return getRuleContexts(ProgramexpressionContext.class);
		}
		public ProgramexpressionContext programexpression(int i) {
			return getRuleContext(ProgramexpressionContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(SenatorParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(SenatorParser.WS, i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240); 
			match(T__21);
			setState(241); 
			foridxitem();
			setState(242); 
			match(COMMA);
			setState(243); 
			foridxitem();
			setState(244); 
			match(T__4);
			setState(252); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(245); 
					match(WS);
					}
					break;
				}
				setState(248); 
				programexpression();
				setState(250);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(249); 
					match(WS);
					}
					break;
				}
				}
				}
				setState(254); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ENDOFSTATEMENT) | (1L << ID) | (1L << NUM) | (1L << WS))) != 0) );
			setState(256); 
			match(T__5);
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

	public static class ForidxitemContext extends ParserRuleContext {
		public ForidxitemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foridxitem; }
	 
		public ForidxitemContext() { }
		public void copyFrom(ForidxitemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForIndexNumContext extends ForidxitemContext {
		public TerminalNode NUM() { return getToken(SenatorParser.NUM, 0); }
		public ForIndexNumContext(ForidxitemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterForIndexNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitForIndexNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitForIndexNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForIndexVarContext extends ForidxitemContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ForIndexVarContext(ForidxitemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterForIndexVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitForIndexVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitForIndexVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForidxitemContext foridxitem() throws RecognitionException {
		ForidxitemContext _localctx = new ForidxitemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_foridxitem);
		try {
			setState(260);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new ForIndexNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258); 
				match(NUM);
				}
				break;
			case T__6:
				_localctx = new ForIndexVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259); 
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SenatornameContext extends ParserRuleContext {
		public FirstnameContext firstname() {
			return getRuleContext(FirstnameContext.class,0);
		}
		public LastnameContext lastname() {
			return getRuleContext(LastnameContext.class,0);
		}
		public TerminalNode WS() { return getToken(SenatorParser.WS, 0); }
		public SenatornameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senatorname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterSenatorname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitSenatorname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitSenatorname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SenatornameContext senatorname() throws RecognitionException {
		SenatornameContext _localctx = new SenatornameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_senatorname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); 
			firstname();
			setState(264);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(263); 
				match(WS);
				}
			}

			setState(266); 
			lastname();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenatorParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268); 
			match(T__6);
			setState(269); 
			match(ID);
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

	public static class FirstnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenatorParser.ID, 0); }
		public FirstnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_firstname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterFirstname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitFirstname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitFirstname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FirstnameContext firstname() throws RecognitionException {
		FirstnameContext _localctx = new FirstnameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_firstname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); 
			match(ID);
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

	public static class LastnameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SenatorParser.ID, 0); }
		public LastnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterLastname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitLastname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitLastname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastnameContext lastname() throws RecognitionException {
		LastnameContext _localctx = new LastnameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_lastname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273); 
			match(ID);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PartyContext extends ParserRuleContext {
		public PartyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_party; }
	 
		public PartyContext() { }
		public void copyFrom(PartyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DemocratRuleContext extends PartyContext {
		public DemocratRuleContext(PartyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterDemocratRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitDemocratRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitDemocratRule(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReblicanRuleContext extends PartyContext {
		public ReblicanRuleContext(PartyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterReblicanRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitReblicanRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitReblicanRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartyContext party() throws RecognitionException {
		PartyContext _localctx = new PartyContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_party);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case T__24:
				_localctx = new DemocratRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277); 
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new ReblicanRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278); 
				match(T__25);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u011c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\5\2?\n\2\6"+
		"\2A\n\2\r\2\16\2B\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4W\n\4\3\4\5\4Z\n\4\3\5\3\5\3\5\5\5_\n\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\5\6g\n\6\3\6\3\6\5\6k\n\6\3\6\3\6\5\6o\n\6\3\6\3\6"+
		"\5\6s\n\6\6\6u\n\6\r\6\16\6v\3\6\3\6\3\7\3\7\5\7}\n\7\3\7\3\7\5\7\u0081"+
		"\n\7\3\7\3\7\3\b\3\b\3\b\3\b\6\b\u0089\n\b\r\b\16\b\u008a\3\b\6\b\u008e"+
		"\n\b\r\b\16\b\u008f\5\b\u0092\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\6\17\u00aa"+
		"\n\17\r\17\16\17\u00ab\3\17\3\17\5\17\u00b0\n\17\3\17\3\17\5\17\u00b4"+
		"\n\17\3\17\3\17\5\17\u00b8\n\17\3\17\3\17\5\17\u00bc\n\17\3\17\3\17\3"+
		"\20\6\20\u00c1\n\20\r\20\16\20\u00c2\3\21\6\21\u00c6\n\21\r\21\16\21\u00c7"+
		"\3\22\3\22\5\22\u00cc\n\22\3\22\3\22\5\22\u00d0\n\22\3\23\3\23\3\24\3"+
		"\24\5\24\u00d6\n\24\3\24\3\24\5\24\u00da\n\24\3\24\5\24\u00dd\n\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u00e6\n\25\6\25\u00e8\n\25\r\25\16"+
		"\25\u00e9\3\25\3\25\3\26\3\26\3\26\5\26\u00f1\n\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00f9\n\27\3\27\3\27\5\27\u00fd\n\27\6\27\u00ff\n\27\r"+
		"\27\16\27\u0100\3\27\3\27\3\30\3\30\5\30\u0107\n\30\3\31\3\31\5\31\u010b"+
		"\n\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\5\36\u011a\n\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:\2\4\3\2\"#\3\2\31\32\u0130\2@\3\2\2\2\4D\3\2\2\2"+
		"\6V\3\2\2\2\b[\3\2\2\2\nd\3\2\2\2\fz\3\2\2\2\16\u0084\3\2\2\2\20\u0095"+
		"\3\2\2\2\22\u0099\3\2\2\2\24\u009b\3\2\2\2\26\u009e\3\2\2\2\30\u00a1\3"+
		"\2\2\2\32\u00a3\3\2\2\2\34\u00a5\3\2\2\2\36\u00c0\3\2\2\2 \u00c5\3\2\2"+
		"\2\"\u00c9\3\2\2\2$\u00d1\3\2\2\2&\u00d3\3\2\2\2(\u00e0\3\2\2\2*\u00f0"+
		"\3\2\2\2,\u00f2\3\2\2\2.\u0106\3\2\2\2\60\u0108\3\2\2\2\62\u010e\3\2\2"+
		"\2\64\u0111\3\2\2\2\66\u0113\3\2\2\28\u0115\3\2\2\2:\u0119\3\2\2\2<>\5"+
		"\4\3\2=?\7$\2\2>=\3\2\2\2>?\3\2\2\2?A\3\2\2\2@<\3\2\2\2AB\3\2\2\2B@\3"+
		"\2\2\2BC\3\2\2\2C\3\3\2\2\2DE\5\6\4\2EF\7\35\2\2F\5\3\2\2\2GW\3\2\2\2"+
		"HW\5\16\b\2IW\5\24\13\2JW\5\32\16\2KW\5$\23\2LW\5,\27\2MW\5\20\t\2NW\5"+
		"\b\5\2OW\5\22\n\2PW\5\34\17\2QW\5(\25\2RW\5\n\6\2SW\5\26\f\2TW\5\30\r"+
		"\2UW\5&\24\2VG\3\2\2\2VH\3\2\2\2VI\3\2\2\2VJ\3\2\2\2VK\3\2\2\2VL\3\2\2"+
		"\2VM\3\2\2\2VN\3\2\2\2VO\3\2\2\2VP\3\2\2\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2"+
		"\2VT\3\2\2\2VU\3\2\2\2WY\3\2\2\2XZ\7$\2\2YX\3\2\2\2YZ\3\2\2\2Z\7\3\2\2"+
		"\2[\\\7\3\2\2\\^\5\60\31\2]_\7$\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7"+
		"\4\2\2ab\5:\36\2bc\7\5\2\2c\t\3\2\2\2df\7\6\2\2eg\7$\2\2fe\3\2\2\2fg\3"+
		"\2\2\2gh\3\2\2\2hj\5\f\7\2ik\7$\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lt\7"+
		"\7\2\2mo\7$\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pr\5\4\3\2qs\7$\2\2rq\3\2"+
		"\2\2rs\3\2\2\2su\3\2\2\2tn\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2"+
		"\2\2xy\7\b\2\2y\13\3\2\2\2z|\5\6\4\2{}\7$\2\2|{\3\2\2\2|}\3\2\2\2}~\3"+
		"\2\2\2~\u0080\7\36\2\2\177\u0081\7$\2\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\5\6\4\2\u0083\r\3\2\2\2\u0084"+
		"\u0085\7\t\2\2\u0085\u0086\7\"\2\2\u0086\u0091\7\n\2\2\u0087\u0089\7\""+
		"\2\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0092\3\2\2\2\u008c\u008e\7#\2\2\u008d\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u0088\3\2\2\2\u0091\u008d\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\7\13\2\2\u0094\17\3\2\2\2\u0095\u0096\7\f\2\2\u0096\u0097"+
		"\7#\2\2\u0097\u0098\7\r\2\2\u0098\21\3\2\2\2\u0099\u009a\7\16\2\2\u009a"+
		"\23\3\2\2\2\u009b\u009c\7\17\2\2\u009c\u009d\7\"\2\2\u009d\25\3\2\2\2"+
		"\u009e\u009f\7\20\2\2\u009f\u00a0\7\"\2\2\u00a0\27\3\2\2\2\u00a1\u00a2"+
		"\t\2\2\2\u00a2\31\3\2\2\2\u00a3\u00a4\7\21\2\2\u00a4\33\3\2\2\2\u00a5"+
		"\u00a6\7\22\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a9\7\4\2\2\u00a8\u00aa\5"+
		" \21\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\7\23\2\2\u00ae\u00b0\7"+
		"$\2\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\58\35\2\u00b2\u00b4\7$\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\7\24\2\2\u00b6\u00b8\7$\2\2\u00b7"+
		"\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\5\36"+
		"\20\2\u00ba\u00bc\7$\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\7\b\2\2\u00be\35\3\2\2\2\u00bf\u00c1\5\4\3"+
		"\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c6\5\"\22\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8!\3\2\2\2"+
		"\u00c9\u00cb\58\35\2\u00ca\u00cc\7$\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc"+
		"\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\7\"\2\2\u00ce\u00d0\7 \2\2\u00cf"+
		"\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0#\3\2\2\2\u00d1\u00d2\7\25\2\2"+
		"\u00d2%\3\2\2\2\u00d3\u00d5\7\26\2\2\u00d4\u00d6\7$\2\2\u00d5\u00d4\3"+
		"\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00da\7!\2\2\u00d8"+
		"\u00da\5\62\32\2\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dc\3"+
		"\2\2\2\u00db\u00dd\7$\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7\r\2\2\u00df\'\3\2\2\2\u00e0\u00e1\7\27\2"+
		"\2\u00e1\u00e2\7\"\2\2\u00e2\u00e7\7\4\2\2\u00e3\u00e5\5*\26\2\u00e4\u00e6"+
		"\7 \2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7"+
		"\u00e3\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\r\2\2\u00ec)\3\2\2\2\u00ed\u00f1"+
		"\7!\2\2\u00ee\u00f1\7#\2\2\u00ef\u00f1\5\62\32\2\u00f0\u00ed\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1+\3\2\2\2\u00f2\u00f3\7\30\2\2"+
		"\u00f3\u00f4\5.\30\2\u00f4\u00f5\7 \2\2\u00f5\u00f6\5.\30\2\u00f6\u00fe"+
		"\7\7\2\2\u00f7\u00f9\7$\2\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fc\5\4\3\2\u00fb\u00fd\7$\2\2\u00fc\u00fb\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00f8\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\7\b\2\2\u0103-\3\2\2\2\u0104\u0107\7#\2\2\u0105\u0107"+
		"\5\62\32\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107/\3\2\2\2\u0108"+
		"\u010a\5\64\33\2\u0109\u010b\7$\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\5\66\34\2\u010d\61\3\2\2\2\u010e"+
		"\u010f\7\t\2\2\u010f\u0110\7\"\2\2\u0110\63\3\2\2\2\u0111\u0112\7\"\2"+
		"\2\u0112\65\3\2\2\2\u0113\u0114\7\"\2\2\u0114\67\3\2\2\2\u0115\u0116\t"+
		"\3\2\2\u01169\3\2\2\2\u0117\u011a\7\33\2\2\u0118\u011a\7\34\2\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a;\3\2\2\2&>BVY^fjnrv|\u0080\u008a"+
		"\u008f\u0091\u00ab\u00af\u00b3\u00b7\u00bb\u00c2\u00c7\u00cb\u00cf\u00d5"+
		"\u00d9\u00dc\u00e5\u00e9\u00f0\u00f8\u00fc\u0100\u0106\u010a\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}