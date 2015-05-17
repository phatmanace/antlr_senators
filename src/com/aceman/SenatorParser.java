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
		ENDOFSTATEMENT=18, COMMENT=19, ID=20, NUM=21, WS=22, NL=23;
	public static final int
		RULE_stmt = 0, RULE_senatordfn = 1, RULE_senatorname = 2, RULE_programexpression = 3, 
		RULE_progstmt = 4, RULE_assignvar = 5, RULE_swait = 6, RULE_deletevar = 7, 
		RULE_printhouse = 8, RULE_displayhouse = 9, RULE_loop = 10, RULE_foridxitem = 11, 
		RULE_var = 12, RULE_firstname = 13, RULE_lastname = 14, RULE_party = 15;
	public static final String[] ruleNames = {
		"stmt", "senatordfn", "senatorname", "programexpression", "progstmt", 
		"assignvar", "swait", "deletevar", "printhouse", "displayhouse", "loop", 
		"foridxitem", "var", "firstname", "lastname", "party"
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
		public List<SenatordfnContext> senatordfn() {
			return getRuleContexts(SenatordfnContext.class);
		}
		public SenatordfnContext senatordfn(int i) {
			return getRuleContext(SenatordfnContext.class,i);
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
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(32); 
					senatordfn();
					}
					break;
				case T__3:
				case T__6:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
					{
					setState(33); 
					programexpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(37);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(36); 
					match(WS);
					}
				}

				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0) );
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
		enterRule(_localctx, 2, RULE_senatordfn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			match(T__0);
			setState(44); 
			senatorname();
			setState(45); 
			match(T__1);
			setState(46); 
			party();
			setState(47); 
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

	public static class SenatornameContext extends ParserRuleContext {
		public FirstnameContext firstname() {
			return getRuleContext(FirstnameContext.class,0);
		}
		public LastnameContext lastname() {
			return getRuleContext(LastnameContext.class,0);
		}
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
		enterRule(_localctx, 4, RULE_senatorname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			firstname();
			setState(50); 
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
		enterRule(_localctx, 6, RULE_programexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); 
			progstmt();
			setState(53); 
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
		enterRule(_localctx, 8, RULE_progstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(55); 
				assignvar();
				}
				break;
			case T__8:
				{
				setState(56); 
				deletevar();
				}
				break;
			case T__9:
				{
				setState(57); 
				printhouse();
				}
				break;
			case T__10:
				{
				setState(58); 
				displayhouse();
				}
				break;
			case T__11:
				{
				setState(59); 
				loop();
				}
				break;
			case T__6:
				{
				setState(60); 
				swait();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(64);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(63); 
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
			setState(66); 
			match(T__3);
			setState(67); 
			match(ID);
			setState(68); 
			match(T__4);
			setState(79);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(70); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(69); 
					match(ID);
					}
					}
					setState(72); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case NUM:
				{
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(74); 
					match(NUM);
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(81); 
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
			setState(83); 
			match(T__6);
			setState(84); 
			match(NUM);
			setState(85); 
			match(T__7);
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
			setState(87); 
			match(T__8);
			setState(88); 
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
		enterRule(_localctx, 16, RULE_printhouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); 
			match(T__9);
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
		enterRule(_localctx, 18, RULE_displayhouse);
		try {
			_localctx = new DisplayMyHouseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92); 
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
		enterRule(_localctx, 20, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); 
			match(T__11);
			setState(95); 
			foridxitem();
			setState(96); 
			match(T__12);
			setState(97); 
			foridxitem();
			setState(98); 
			match(T__13);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(99); 
					match(WS);
					}
				}

				setState(102); 
				programexpression();
				setState(104);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(103); 
					match(WS);
					}
					break;
				}
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << WS))) != 0) );
			setState(110); 
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
		enterRule(_localctx, 22, RULE_foridxitem);
		try {
			setState(114);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new ForIndexNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112); 
				match(NUM);
				}
				break;
			case T__3:
				_localctx = new ForIndexVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113); 
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
		enterRule(_localctx, 24, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); 
			match(T__3);
			setState(117); 
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
		enterRule(_localctx, 26, RULE_firstname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); 
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
		enterRule(_localctx, 28, RULE_lastname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
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
		enterRule(_localctx, 30, RULE_party);
		try {
			setState(125);
			switch (_input.LA(1)) {
			case T__15:
				_localctx = new DemocratRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(123); 
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new ReblicanRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124); 
				match(T__16);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\5\2%\n\2\3\2\5\2(\n\2\6\2*\n\2\r\2\16\2+\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6@\n\6\3\6\5\6C\n\6\3\7"+
		"\3\7\3\7\3\7\6\7I\n\7\r\7\16\7J\3\7\6\7N\n\7\r\7\16\7O\5\7R\n\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\fg\n\f\3\f\3\f\5\fk\n\f\6\fm\n\f\r\f\16\fn\3\f\3\f\3\r\3\r\5\ru\n"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5\21\u0080\n\21\3\21\2"+
		"\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\2\u0082\2)\3\2\2\2\4-"+
		"\3\2\2\2\6\63\3\2\2\2\b\66\3\2\2\2\n?\3\2\2\2\fD\3\2\2\2\16U\3\2\2\2\20"+
		"Y\3\2\2\2\22\\\3\2\2\2\24^\3\2\2\2\26`\3\2\2\2\30t\3\2\2\2\32v\3\2\2\2"+
		"\34y\3\2\2\2\36{\3\2\2\2 \177\3\2\2\2\"%\5\4\3\2#%\5\b\5\2$\"\3\2\2\2"+
		"$#\3\2\2\2%\'\3\2\2\2&(\7\30\2\2\'&\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)$\3\2"+
		"\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\3\3\2\2\2-.\7\3\2\2./\5\6\4\2/\60"+
		"\7\4\2\2\60\61\5 \21\2\61\62\7\5\2\2\62\5\3\2\2\2\63\64\5\34\17\2\64\65"+
		"\5\36\20\2\65\7\3\2\2\2\66\67\5\n\6\2\678\7\24\2\28\t\3\2\2\29@\5\f\7"+
		"\2:@\5\20\t\2;@\5\22\n\2<@\5\24\13\2=@\5\26\f\2>@\5\16\b\2?9\3\2\2\2?"+
		":\3\2\2\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@B\3\2\2\2AC\7\30\2\2"+
		"BA\3\2\2\2BC\3\2\2\2C\13\3\2\2\2DE\7\6\2\2EF\7\26\2\2FQ\7\7\2\2GI\7\26"+
		"\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KR\3\2\2\2LN\7\27\2\2ML\3"+
		"\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QH\3\2\2\2QM\3\2\2\2RS\3"+
		"\2\2\2ST\7\b\2\2T\r\3\2\2\2UV\7\t\2\2VW\7\27\2\2WX\7\n\2\2X\17\3\2\2\2"+
		"YZ\7\13\2\2Z[\7\26\2\2[\21\3\2\2\2\\]\7\f\2\2]\23\3\2\2\2^_\7\r\2\2_\25"+
		"\3\2\2\2`a\7\16\2\2ab\5\30\r\2bc\7\17\2\2cd\5\30\r\2dl\7\20\2\2eg\7\30"+
		"\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hj\5\b\5\2ik\7\30\2\2ji\3\2\2\2jk\3"+
		"\2\2\2km\3\2\2\2lf\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7"+
		"\21\2\2q\27\3\2\2\2ru\7\27\2\2su\5\32\16\2tr\3\2\2\2ts\3\2\2\2u\31\3\2"+
		"\2\2vw\7\6\2\2wx\7\26\2\2x\33\3\2\2\2yz\7\26\2\2z\35\3\2\2\2{|\7\26\2"+
		"\2|\37\3\2\2\2}\u0080\7\22\2\2~\u0080\7\23\2\2\177}\3\2\2\2\177~\3\2\2"+
		"\2\u0080!\3\2\2\2\17$\'+?BJOQfjnt\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}