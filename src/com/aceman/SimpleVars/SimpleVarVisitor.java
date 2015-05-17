// Generated from /Users/phatmanace/IdeaProjects/antlr_senators/grammar/SimpleVar.g4 by ANTLR 4.5
package com.aceman.SimpleVars;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleVarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code TopLevelRule}
	 * labeled alternative in {@link SimpleVarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopLevelRule(@NotNull SimpleVarParser.TopLevelRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleVarParser#programexpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramexpression(@NotNull SimpleVarParser.ProgramexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleVarParser#progstmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgstmt(@NotNull SimpleVarParser.ProgstmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SimpleVarParser#assignvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignvar(@NotNull SimpleVarParser.AssignvarContext ctx);
}