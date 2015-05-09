// Generated from /Users/phatmanace/IdeaProjects/antlr_senators/grammar/Senator.g4 by ANTLR 4.5
package com.aceman;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SenatorParser}.
 */
public interface SenatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code TopLevelRule}
	 * labeled alternative in {@link SenatorParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelRule(@NotNull SenatorParser.TopLevelRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopLevelRule}
	 * labeled alternative in {@link SenatorParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelRule(@NotNull SenatorParser.TopLevelRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#senatordfn}.
	 * @param ctx the parse tree
	 */
	void enterSenatordfn(@NotNull SenatorParser.SenatordfnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#senatordfn}.
	 * @param ctx the parse tree
	 */
	void exitSenatordfn(@NotNull SenatorParser.SenatordfnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#senatorname}.
	 * @param ctx the parse tree
	 */
	void enterSenatorname(@NotNull SenatorParser.SenatornameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#senatorname}.
	 * @param ctx the parse tree
	 */
	void exitSenatorname(@NotNull SenatorParser.SenatornameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#progstmt}.
	 * @param ctx the parse tree
	 */
	void enterProgstmt(@NotNull SenatorParser.ProgstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#progstmt}.
	 * @param ctx the parse tree
	 */
	void exitProgstmt(@NotNull SenatorParser.ProgstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#assignvar}.
	 * @param ctx the parse tree
	 */
	void enterAssignvar(@NotNull SenatorParser.AssignvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#assignvar}.
	 * @param ctx the parse tree
	 */
	void exitAssignvar(@NotNull SenatorParser.AssignvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#deletevar}.
	 * @param ctx the parse tree
	 */
	void enterDeletevar(@NotNull SenatorParser.DeletevarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#deletevar}.
	 * @param ctx the parse tree
	 */
	void exitDeletevar(@NotNull SenatorParser.DeletevarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#printhouse}.
	 * @param ctx the parse tree
	 */
	void enterPrinthouse(@NotNull SenatorParser.PrinthouseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#printhouse}.
	 * @param ctx the parse tree
	 */
	void exitPrinthouse(@NotNull SenatorParser.PrinthouseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DisplayMyHouse}
	 * labeled alternative in {@link SenatorParser#displayhouse}.
	 * @param ctx the parse tree
	 */
	void enterDisplayMyHouse(@NotNull SenatorParser.DisplayMyHouseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DisplayMyHouse}
	 * labeled alternative in {@link SenatorParser#displayhouse}.
	 * @param ctx the parse tree
	 */
	void exitDisplayMyHouse(@NotNull SenatorParser.DisplayMyHouseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull SenatorParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull SenatorParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForIndexNum}
	 * labeled alternative in {@link SenatorParser#foridxitem}.
	 * @param ctx the parse tree
	 */
	void enterForIndexNum(@NotNull SenatorParser.ForIndexNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForIndexNum}
	 * labeled alternative in {@link SenatorParser#foridxitem}.
	 * @param ctx the parse tree
	 */
	void exitForIndexNum(@NotNull SenatorParser.ForIndexNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForIndexVar}
	 * labeled alternative in {@link SenatorParser#foridxitem}.
	 * @param ctx the parse tree
	 */
	void enterForIndexVar(@NotNull SenatorParser.ForIndexVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForIndexVar}
	 * labeled alternative in {@link SenatorParser#foridxitem}.
	 * @param ctx the parse tree
	 */
	void exitForIndexVar(@NotNull SenatorParser.ForIndexVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull SenatorParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull SenatorParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#firstname}.
	 * @param ctx the parse tree
	 */
	void enterFirstname(@NotNull SenatorParser.FirstnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#firstname}.
	 * @param ctx the parse tree
	 */
	void exitFirstname(@NotNull SenatorParser.FirstnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#lastname}.
	 * @param ctx the parse tree
	 */
	void enterLastname(@NotNull SenatorParser.LastnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#lastname}.
	 * @param ctx the parse tree
	 */
	void exitLastname(@NotNull SenatorParser.LastnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SenatorParser#endofstatement}.
	 * @param ctx the parse tree
	 */
	void enterEndofstatement(@NotNull SenatorParser.EndofstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SenatorParser#endofstatement}.
	 * @param ctx the parse tree
	 */
	void exitEndofstatement(@NotNull SenatorParser.EndofstatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DemocratRule}
	 * labeled alternative in {@link SenatorParser#party}.
	 * @param ctx the parse tree
	 */
	void enterDemocratRule(@NotNull SenatorParser.DemocratRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DemocratRule}
	 * labeled alternative in {@link SenatorParser#party}.
	 * @param ctx the parse tree
	 */
	void exitDemocratRule(@NotNull SenatorParser.DemocratRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReblicanRule}
	 * labeled alternative in {@link SenatorParser#party}.
	 * @param ctx the parse tree
	 */
	void enterReblicanRule(@NotNull SenatorParser.ReblicanRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReblicanRule}
	 * labeled alternative in {@link SenatorParser#party}.
	 * @param ctx the parse tree
	 */
	void exitReblicanRule(@NotNull SenatorParser.ReblicanRuleContext ctx);
}