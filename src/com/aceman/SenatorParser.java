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
		T__24=25, ENDOFSTATEMENT=26, TEST_OPERATOR=27, COMMENT=28, COMMA=29, STRING_LITERAL=30, 
		ID=31, NUM=32, WS=33, NL=34;
	public static final int
		RULE_stmt = 0, RULE_programexpression = 1, RULE_progstmt = 2, RULE_senatordfn = 3, 
		RULE_ifstmt = 4, RULE_assignvar = 5, RULE_swait = 6, RULE_deletevar = 7, 
		RULE_returnstatement = 8, RULE_constant = 9, RULE_printhouse = 10, RULE_function = 11, 
		RULE_functionbody = 12, RULE_functionproto = 13, RULE_functionparam = 14, 
		RULE_displayhouse = 15, RULE_prints = 16, RULE_functioncall = 17, RULE_functioncallparam = 18, 
		RULE_loop = 19, RULE_foridxitem = 20, RULE_senatorname = 21, RULE_var = 22, 
		RULE_firstname = 23, RULE_lastname = 24, RULE_type = 25, RULE_party = 26;
	public static final String[] ruleNames = {
		"stmt", "programexpression", "progstmt", "senatordfn", "ifstmt", "assignvar", 
		"swait", "deletevar", "returnstatement", "constant", "printhouse", "function", 
		"functionbody", "functionproto", "functionparam", "displayhouse", "prints", 
		"functioncall", "functioncallparam", "loop", "foridxitem", "senatorname", 
		"var", "firstname", "lastname", "type", "party"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'->(\"'", "'('", "')\")'", "'if('", "'){'", "'}'", "'$'", "'=\"'", 
		"'\"'", "'~wait('", "')'", "'~delete'", "'return'", "'~printhouse'", "'function '", 
		"') as'", "'{'", "'~displayhouse'", "'~print('", "'@'", "'for('", "'int'", 
		"'string'", "'D'", "'R'", "';'", null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ENDOFSTATEMENT", "TEST_OPERATOR", "COMMENT", "COMMA", "STRING_LITERAL", 
		"ID", "NUM", "WS", "NL"
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
			setState(58); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(54); 
				programexpression();
				}
				setState(56);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(55); 
					match(WS);
					}
					break;
				}
				}
				}
				setState(60); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ENDOFSTATEMENT) | (1L << ID) | (1L << NUM) | (1L << WS))) != 0) );
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
			setState(62); 
			progstmt();
			setState(63); 
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
			setState(79);
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
				setState(66); 
				assignvar();
				}
				break;
			case T__11:
				{
				setState(67); 
				deletevar();
				}
				break;
			case T__13:
				{
				setState(68); 
				printhouse();
				}
				break;
			case T__17:
				{
				setState(69); 
				displayhouse();
				}
				break;
			case T__20:
				{
				setState(70); 
				loop();
				}
				break;
			case T__9:
				{
				setState(71); 
				swait();
				}
				break;
			case T__0:
				{
				setState(72); 
				senatordfn();
				}
				break;
			case T__14:
				{
				setState(73); 
				function();
				}
				break;
			case T__19:
				{
				setState(74); 
				functioncall();
				}
				break;
			case T__3:
				{
				setState(75); 
				ifstmt();
				}
				break;
			case T__12:
				{
				setState(76); 
				returnstatement();
				}
				break;
			case ID:
			case NUM:
				{
				setState(77); 
				constant();
				}
				break;
			case T__18:
				{
				setState(78); 
				prints();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(81); 
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
			setState(84); 
			match(T__0);
			setState(85); 
			senatorname();
			setState(87);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(86); 
				match(WS);
				}
			}

			setState(89); 
			match(T__1);
			setState(90); 
			party();
			setState(91); 
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
			setState(93); 
			match(T__3);
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(94); 
				match(WS);
				}
				break;
			}
			setState(97); 
			progstmt();
			setState(99);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(98); 
				match(WS);
				}
			}

			setState(101); 
			match(TEST_OPERATOR);
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(102); 
				match(WS);
				}
				break;
			}
			setState(105); 
			progstmt();
			setState(107);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(106); 
				match(WS);
				}
			}

			setState(109); 
			match(T__4);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(110); 
					match(WS);
					}
					break;
				}
				setState(113); 
				programexpression();
				setState(115);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(114); 
					match(WS);
					}
					break;
				}
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ENDOFSTATEMENT) | (1L << ID) | (1L << NUM) | (1L << WS))) != 0) );
			setState(121); 
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
		enterRule(_localctx, 10, RULE_assignvar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); 
			match(T__6);
			setState(124); 
			match(ID);
			setState(125); 
			match(T__7);
			setState(136);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(126); 
					match(ID);
					}
					}
					setState(129); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case NUM:
				{
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131); 
					match(NUM);
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(138); 
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
		enterRule(_localctx, 12, RULE_swait);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); 
			match(T__9);
			setState(141); 
			match(NUM);
			setState(142); 
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
		enterRule(_localctx, 14, RULE_deletevar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); 
			match(T__11);
			setState(145); 
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
		enterRule(_localctx, 16, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); 
			match(T__12);
			setState(148); 
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
		enterRule(_localctx, 18, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
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
		enterRule(_localctx, 20, RULE_printhouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); 
			match(T__13);
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
		enterRule(_localctx, 22, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); 
			match(T__14);
			setState(155); 
			match(ID);
			setState(156); 
			match(T__1);
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157); 
				functionproto();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__21 || _la==T__22 );
			setState(162); 
			match(T__15);
			setState(164);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(163); 
				match(WS);
				}
			}

			setState(166); 
			type();
			setState(168);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(167); 
				match(WS);
				}
			}

			setState(170); 
			match(T__16);
			setState(172);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(171); 
				match(WS);
				}
				break;
			}
			setState(174); 
			functionbody();
			setState(176);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(175); 
				match(WS);
				}
			}

			setState(178); 
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
		enterRule(_localctx, 24, RULE_functionbody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(181); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(180); 
					programexpression();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(183); 
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
		enterRule(_localctx, 26, RULE_functionproto);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(185); 
					functionparam();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(188); 
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
		enterRule(_localctx, 28, RULE_functionparam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); 
			type();
			setState(192);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(191); 
				match(WS);
				}
			}

			setState(194); 
			match(ID);
			setState(196);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(195); 
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
		enterRule(_localctx, 30, RULE_displayhouse);
		try {
			_localctx = new DisplayMyHouseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(198); 
			match(T__17);
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
		enterRule(_localctx, 32, RULE_prints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); 
			match(T__18);
			setState(202);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(201); 
				match(WS);
				}
			}

			setState(206);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(204); 
				match(STRING_LITERAL);
				}
				break;
			case T__6:
				{
				setState(205); 
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(209);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(208); 
				match(WS);
				}
			}

			setState(211); 
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
		enterRule(_localctx, 34, RULE_functioncall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213); 
			match(T__19);
			setState(214); 
			match(ID);
			setState(215); 
			match(T__1);
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216); 
				functioncallparam();
				setState(218);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(217); 
					match(COMMA);
					}
				}

				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << STRING_LITERAL) | (1L << NUM))) != 0) );
			setState(224); 
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
		enterRule(_localctx, 36, RULE_functioncallparam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
				{
				setState(226); 
				match(STRING_LITERAL);
				}
				break;
			case NUM:
				{
				setState(227); 
				match(NUM);
				}
				break;
			case T__6:
				{
				setState(228); 
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
		enterRule(_localctx, 38, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); 
			match(T__20);
			setState(232); 
			foridxitem();
			setState(233); 
			match(COMMA);
			setState(234); 
			foridxitem();
			setState(235); 
			match(T__4);
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(237);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(236); 
					match(WS);
					}
					break;
				}
				setState(239); 
				programexpression();
				setState(241);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(240); 
					match(WS);
					}
					break;
				}
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ENDOFSTATEMENT) | (1L << ID) | (1L << NUM) | (1L << WS))) != 0) );
			setState(247); 
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
		enterRule(_localctx, 40, RULE_foridxitem);
		try {
			setState(251);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new ForIndexNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(249); 
				match(NUM);
				}
				break;
			case T__6:
				_localctx = new ForIndexVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250); 
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
		enterRule(_localctx, 42, RULE_senatorname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); 
			firstname();
			setState(255);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(254); 
				match(WS);
				}
			}

			setState(257); 
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
		enterRule(_localctx, 44, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); 
			match(T__6);
			setState(260); 
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
		enterRule(_localctx, 46, RULE_firstname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); 
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
		enterRule(_localctx, 48, RULE_lastname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264); 
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
		enterRule(_localctx, 50, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==T__21 || _la==T__22) ) {
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
		enterRule(_localctx, 52, RULE_party);
		try {
			setState(270);
			switch (_input.LA(1)) {
			case T__23:
				_localctx = new DemocratRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268); 
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new ReblicanRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(269); 
				match(T__24);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\5\2;\n\2\6\2=\n\2\r\2\16\2>\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4R"+
		"\n\4\3\4\5\4U\n\4\3\5\3\5\3\5\5\5Z\n\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6b\n"+
		"\6\3\6\3\6\5\6f\n\6\3\6\3\6\5\6j\n\6\3\6\3\6\5\6n\n\6\3\6\3\6\5\6r\n\6"+
		"\3\6\3\6\5\6v\n\6\6\6x\n\6\r\6\16\6y\3\6\3\6\3\7\3\7\3\7\3\7\6\7\u0082"+
		"\n\7\r\7\16\7\u0083\3\7\6\7\u0087\n\7\r\7\16\7\u0088\5\7\u008b\n\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\6\r\u00a1\n\r\r\r\16\r\u00a2\3\r\3\r\5\r\u00a7\n\r\3\r\3\r\5"+
		"\r\u00ab\n\r\3\r\3\r\5\r\u00af\n\r\3\r\3\r\5\r\u00b3\n\r\3\r\3\r\3\16"+
		"\6\16\u00b8\n\16\r\16\16\16\u00b9\3\17\6\17\u00bd\n\17\r\17\16\17\u00be"+
		"\3\20\3\20\5\20\u00c3\n\20\3\20\3\20\5\20\u00c7\n\20\3\21\3\21\3\22\3"+
		"\22\5\22\u00cd\n\22\3\22\3\22\5\22\u00d1\n\22\3\22\5\22\u00d4\n\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u00dd\n\23\6\23\u00df\n\23\r\23\16"+
		"\23\u00e0\3\23\3\23\3\24\3\24\3\24\5\24\u00e8\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00f0\n\25\3\25\3\25\5\25\u00f4\n\25\6\25\u00f6\n\25\r"+
		"\25\16\25\u00f7\3\25\3\25\3\26\3\26\5\26\u00fe\n\26\3\27\3\27\5\27\u0102"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\5\34\u0111\n\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\66\2\4\3\2!\"\3\2\30\31\u0128\2<\3\2\2\2\4@\3\2\2\2\6"+
		"Q\3\2\2\2\bV\3\2\2\2\n_\3\2\2\2\f}\3\2\2\2\16\u008e\3\2\2\2\20\u0092\3"+
		"\2\2\2\22\u0095\3\2\2\2\24\u0098\3\2\2\2\26\u009a\3\2\2\2\30\u009c\3\2"+
		"\2\2\32\u00b7\3\2\2\2\34\u00bc\3\2\2\2\36\u00c0\3\2\2\2 \u00c8\3\2\2\2"+
		"\"\u00ca\3\2\2\2$\u00d7\3\2\2\2&\u00e7\3\2\2\2(\u00e9\3\2\2\2*\u00fd\3"+
		"\2\2\2,\u00ff\3\2\2\2.\u0105\3\2\2\2\60\u0108\3\2\2\2\62\u010a\3\2\2\2"+
		"\64\u010c\3\2\2\2\66\u0110\3\2\2\28:\5\4\3\29;\7#\2\2:9\3\2\2\2:;\3\2"+
		"\2\2;=\3\2\2\2<8\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\3\3\2\2\2@A\5"+
		"\6\4\2AB\7\34\2\2B\5\3\2\2\2CR\3\2\2\2DR\5\f\7\2ER\5\20\t\2FR\5\26\f\2"+
		"GR\5 \21\2HR\5(\25\2IR\5\16\b\2JR\5\b\5\2KR\5\30\r\2LR\5$\23\2MR\5\n\6"+
		"\2NR\5\22\n\2OR\5\24\13\2PR\5\"\22\2QC\3\2\2\2QD\3\2\2\2QE\3\2\2\2QF\3"+
		"\2\2\2QG\3\2\2\2QH\3\2\2\2QI\3\2\2\2QJ\3\2\2\2QK\3\2\2\2QL\3\2\2\2QM\3"+
		"\2\2\2QN\3\2\2\2QO\3\2\2\2QP\3\2\2\2RT\3\2\2\2SU\7#\2\2TS\3\2\2\2TU\3"+
		"\2\2\2U\7\3\2\2\2VW\7\3\2\2WY\5,\27\2XZ\7#\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3"+
		"\2\2\2[\\\7\4\2\2\\]\5\66\34\2]^\7\5\2\2^\t\3\2\2\2_a\7\6\2\2`b\7#\2\2"+
		"a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2ce\5\6\4\2df\7#\2\2ed\3\2\2\2ef\3\2\2\2"+
		"fg\3\2\2\2gi\7\35\2\2hj\7#\2\2ih\3\2\2\2ij\3\2\2\2jk\3\2\2\2km\5\6\4\2"+
		"ln\7#\2\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2ow\7\7\2\2pr\7#\2\2qp\3\2\2\2q"+
		"r\3\2\2\2rs\3\2\2\2su\5\4\3\2tv\7#\2\2ut\3\2\2\2uv\3\2\2\2vx\3\2\2\2w"+
		"q\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\b\2\2|\13\3\2\2"+
		"\2}~\7\t\2\2~\177\7!\2\2\177\u008a\7\n\2\2\u0080\u0082\7!\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u008b\3\2\2\2\u0085\u0087\7\"\2\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0081\3\2\2\2\u008a\u0086\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\13"+
		"\2\2\u008d\r\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\7\"\2\2\u0090\u0091"+
		"\7\r\2\2\u0091\17\3\2\2\2\u0092\u0093\7\16\2\2\u0093\u0094\7!\2\2\u0094"+
		"\21\3\2\2\2\u0095\u0096\7\17\2\2\u0096\u0097\7!\2\2\u0097\23\3\2\2\2\u0098"+
		"\u0099\t\2\2\2\u0099\25\3\2\2\2\u009a\u009b\7\20\2\2\u009b\27\3\2\2\2"+
		"\u009c\u009d\7\21\2\2\u009d\u009e\7!\2\2\u009e\u00a0\7\4\2\2\u009f\u00a1"+
		"\5\34\17\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\7\22\2\2\u00a5\u00a7"+
		"\7#\2\2\u00a6\u00a5\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00aa\5\64\33\2\u00a9\u00ab\7#\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\7\23\2\2\u00ad\u00af\7#\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\5\32"+
		"\16\2\u00b1\u00b3\7#\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\7\b\2\2\u00b5\31\3\2\2\2\u00b6\u00b8\5\4\3"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\33\3\2\2\2\u00bb\u00bd\5\36\20\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\35\3\2\2"+
		"\2\u00c0\u00c2\5\64\33\2\u00c1\u00c3\7#\2\2\u00c2\u00c1\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\7!\2\2\u00c5\u00c7\7\37"+
		"\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\37\3\2\2\2\u00c8\u00c9"+
		"\7\24\2\2\u00c9!\3\2\2\2\u00ca\u00cc\7\25\2\2\u00cb\u00cd\7#\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00d1\7 "+
		"\2\2\u00cf\u00d1\5.\30\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d4\7#\2\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\7\r\2\2\u00d6#\3\2\2\2\u00d7\u00d8"+
		"\7\26\2\2\u00d8\u00d9\7!\2\2\u00d9\u00de\7\4\2\2\u00da\u00dc\5&\24\2\u00db"+
		"\u00dd\7\37\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3"+
		"\2\2\2\u00de\u00da\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\7\r\2\2\u00e3%\3\2\2\2"+
		"\u00e4\u00e8\7 \2\2\u00e5\u00e8\7\"\2\2\u00e6\u00e8\5.\30\2\u00e7\u00e4"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\'\3\2\2\2\u00e9"+
		"\u00ea\7\27\2\2\u00ea\u00eb\5*\26\2\u00eb\u00ec\7\37\2\2\u00ec\u00ed\5"+
		"*\26\2\u00ed\u00f5\7\7\2\2\u00ee\u00f0\7#\2\2\u00ef\u00ee\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\5\4\3\2\u00f2\u00f4\7#"+
		"\2\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
		"\u00ef\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\b\2\2\u00fa)\3\2\2\2\u00fb\u00fe"+
		"\7\"\2\2\u00fc\u00fe\5.\30\2\u00fd\u00fb\3\2\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"+\3\2\2\2\u00ff\u0101\5\60\31\2\u0100\u0102\7#\2\2\u0101\u0100\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5\62\32\2\u0104-"+
		"\3\2\2\2\u0105\u0106\7\t\2\2\u0106\u0107\7!\2\2\u0107/\3\2\2\2\u0108\u0109"+
		"\7!\2\2\u0109\61\3\2\2\2\u010a\u010b\7!\2\2\u010b\63\3\2\2\2\u010c\u010d"+
		"\t\3\2\2\u010d\65\3\2\2\2\u010e\u0111\7\32\2\2\u010f\u0111\7\33\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u010f\3\2\2\2\u0111\67\3\2\2\2&:>QTYaeimquy\u0083"+
		"\u0088\u008a\u00a2\u00a6\u00aa\u00ae\u00b2\u00b9\u00be\u00c2\u00c6\u00cc"+
		"\u00d0\u00d3\u00dc\u00e0\u00e7\u00ef\u00f3\u00f7\u00fd\u0101\u0110";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}