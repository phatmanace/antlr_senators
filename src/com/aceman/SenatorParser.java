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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, NUM=17, 
		WS=18, NL=19;
	public static final int
		RULE_stmt = 0, RULE_senatordfn = 1, RULE_senatorname = 2, RULE_progstmt = 3, 
		RULE_assignvar = 4, RULE_deletevar = 5, RULE_printhouse = 6, RULE_displayhouse = 7, 
		RULE_loop = 8, RULE_foridxitem = 9, RULE_var = 10, RULE_firstname = 11, 
		RULE_lastname = 12, RULE_endofstatement = 13, RULE_party = 14;
	public static final String[] ruleNames = {
		"stmt", "senatordfn", "senatorname", "progstmt", "assignvar", "deletevar", 
		"printhouse", "displayhouse", "loop", "foridxitem", "var", "firstname", 
		"lastname", "endofstatement", "party"
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
		public List<EndofstatementContext> endofstatement() {
			return getRuleContexts(EndofstatementContext.class);
		}
		public EndofstatementContext endofstatement(int i) {
			return getRuleContext(EndofstatementContext.class,i);
		}
		public List<SenatordfnContext> senatordfn() {
			return getRuleContexts(SenatordfnContext.class);
		}
		public SenatordfnContext senatordfn(int i) {
			return getRuleContext(SenatordfnContext.class,i);
		}
		public List<ProgstmtContext> progstmt() {
			return getRuleContexts(ProgstmtContext.class);
		}
		public ProgstmtContext progstmt(int i) {
			return getRuleContext(ProgstmtContext.class,i);
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
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(30); 
					senatordfn();
					}
					break;
				case T__2:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
					{
					setState(31); 
					progstmt();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(34); 
				endofstatement();
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << ID))) != 0) );
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
			setState(40); 
			senatorname();
			setState(41); 
			match(T__0);
			setState(42); 
			party();
			setState(43); 
			match(T__1);
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
			setState(45); 
			firstname();
			setState(46); 
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
		enterRule(_localctx, 6, RULE_progstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(48); 
				assignvar();
				}
				break;
			case T__5:
				{
				setState(49); 
				deletevar();
				}
				break;
			case T__6:
				{
				setState(50); 
				printhouse();
				}
				break;
			case T__7:
				{
				setState(51); 
				displayhouse();
				}
				break;
			case T__8:
				{
				setState(52); 
				loop();
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

	public static class AssignvarContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(SenatorParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SenatorParser.ID, i);
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
		enterRule(_localctx, 8, RULE_assignvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			match(T__2);
			setState(56); 
			match(ID);
			setState(57); 
			match(T__3);
			setState(58); 
			match(ID);
			setState(59); 
			match(T__4);
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
		enterRule(_localctx, 10, RULE_deletevar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			match(T__5);
			setState(62); 
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
		enterRule(_localctx, 12, RULE_printhouse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			match(T__6);
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
		enterRule(_localctx, 14, RULE_displayhouse);
		try {
			_localctx = new DisplayMyHouseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(66); 
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

	public static class LoopContext extends ParserRuleContext {
		public List<ForidxitemContext> foridxitem() {
			return getRuleContexts(ForidxitemContext.class);
		}
		public ForidxitemContext foridxitem(int i) {
			return getRuleContext(ForidxitemContext.class,i);
		}
		public ProgstmtContext progstmt() {
			return getRuleContext(ProgstmtContext.class,0);
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
		enterRule(_localctx, 16, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); 
			match(T__8);
			setState(69); 
			foridxitem();
			setState(70); 
			match(T__9);
			setState(71); 
			foridxitem();
			setState(72); 
			match(T__10);
			setState(73); 
			progstmt();
			setState(74); 
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
		enterRule(_localctx, 18, RULE_foridxitem);
		try {
			setState(78);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new ForIndexNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76); 
				match(NUM);
				}
				break;
			case T__2:
				_localctx = new ForIndexVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77); 
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
		enterRule(_localctx, 20, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); 
			match(T__2);
			setState(81); 
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
		enterRule(_localctx, 22, RULE_firstname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); 
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
		enterRule(_localctx, 24, RULE_lastname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
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

	public static class EndofstatementContext extends ParserRuleContext {
		public EndofstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endofstatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).enterEndofstatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SenatorListener ) ((SenatorListener)listener).exitEndofstatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SenatorVisitor ) return ((SenatorVisitor<? extends T>)visitor).visitEndofstatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndofstatementContext endofstatement() throws RecognitionException {
		EndofstatementContext _localctx = new EndofstatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_endofstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); 
			match(T__12);
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
		enterRule(_localctx, 28, RULE_party);
		try {
			setState(91);
			switch (_input.LA(1)) {
			case T__13:
				_localctx = new DemocratRuleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89); 
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new ReblicanRuleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90); 
				match(T__14);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\5\2#\n\2\3\2\3\2"+
		"\6\2\'\n\2\r\2\16\2(\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\5\58\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\5\13Q\n\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\5\20^\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36\2\2X\2&\3\2\2\2\4*\3\2\2\2\6/\3\2\2\2\b\67\3\2\2"+
		"\2\n9\3\2\2\2\f?\3\2\2\2\16B\3\2\2\2\20D\3\2\2\2\22F\3\2\2\2\24P\3\2\2"+
		"\2\26R\3\2\2\2\30U\3\2\2\2\32W\3\2\2\2\34Y\3\2\2\2\36]\3\2\2\2 #\5\4\3"+
		"\2!#\5\b\5\2\" \3\2\2\2\"!\3\2\2\2#$\3\2\2\2$%\5\34\17\2%\'\3\2\2\2&\""+
		"\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\3\3\2\2\2*+\5\6\4\2+,\7\3\2\2"+
		",-\5\36\20\2-.\7\4\2\2.\5\3\2\2\2/\60\5\30\r\2\60\61\5\32\16\2\61\7\3"+
		"\2\2\2\628\5\n\6\2\638\5\f\7\2\648\5\16\b\2\658\5\20\t\2\668\5\22\n\2"+
		"\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67\65\3\2\2\2\67\66\3\2\2\2"+
		"8\t\3\2\2\29:\7\5\2\2:;\7\22\2\2;<\7\6\2\2<=\7\22\2\2=>\7\7\2\2>\13\3"+
		"\2\2\2?@\7\b\2\2@A\7\22\2\2A\r\3\2\2\2BC\7\t\2\2C\17\3\2\2\2DE\7\n\2\2"+
		"E\21\3\2\2\2FG\7\13\2\2GH\5\24\13\2HI\7\f\2\2IJ\5\24\13\2JK\7\r\2\2KL"+
		"\5\b\5\2LM\7\16\2\2M\23\3\2\2\2NQ\7\23\2\2OQ\5\26\f\2PN\3\2\2\2PO\3\2"+
		"\2\2Q\25\3\2\2\2RS\7\5\2\2ST\7\22\2\2T\27\3\2\2\2UV\7\22\2\2V\31\3\2\2"+
		"\2WX\7\22\2\2X\33\3\2\2\2YZ\7\17\2\2Z\35\3\2\2\2[^\7\20\2\2\\^\7\21\2"+
		"\2][\3\2\2\2]\\\3\2\2\2^\37\3\2\2\2\7\"(\67P]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}