// Generated from /Users/phatmanace/IdeaProjects/antlr_senators/grammar/Senator.g4 by ANTLR 4.5
package com.aceman;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SenatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SenatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code TopLevelRule}
	 * labeled alternative in {@link SenatorParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelRule(@NotNull SenatorParser.TopLevelRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#senatordfn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenatordfn(@NotNull SenatorParser.SenatordfnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#senatorname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSenatorname(@NotNull SenatorParser.SenatornameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#progstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgstmt(@NotNull SenatorParser.ProgstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#assignvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignvar(@NotNull SenatorParser.AssignvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#deletevar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeletevar(@NotNull SenatorParser.DeletevarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#printhouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrinthouse(@NotNull SenatorParser.PrinthouseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DisplayMyHouse}
	 * labeled alternative in {@link SenatorParser#displayhouse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayMyHouse(@NotNull SenatorParser.DisplayMyHouseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull SenatorParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForIndexNum}
	 * labeled alternative in {@link SenatorParser#foridxitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIndexNum(@NotNull SenatorParser.ForIndexNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForIndexVar}
	 * labeled alternative in {@link SenatorParser#foridxitem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIndexVar(@NotNull SenatorParser.ForIndexVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#programexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramexpression(@NotNull SenatorParser.ProgramexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull SenatorParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#firstname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstname(@NotNull SenatorParser.FirstnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SenatorParser#lastname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastname(@NotNull SenatorParser.LastnameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DemocratRule}
	 * labeled alternative in {@link SenatorParser#party}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDemocratRule(@NotNull SenatorParser.DemocratRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReblicanRule}
	 * labeled alternative in {@link SenatorParser#party}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReblicanRule(@NotNull SenatorParser.ReblicanRuleContext ctx);
}