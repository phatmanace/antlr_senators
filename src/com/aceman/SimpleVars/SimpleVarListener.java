// Generated from /Users/phatmanace/IdeaProjects/antlr_senators/grammar/SimpleVar.g4 by ANTLR 4.5
package com.aceman.SimpleVars;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleVarParser}.
 */
public interface SimpleVarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code TopLevelRule}
	 * labeled alternative in {@link SimpleVarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterTopLevelRule(@NotNull SimpleVarParser.TopLevelRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TopLevelRule}
	 * labeled alternative in {@link SimpleVarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitTopLevelRule(@NotNull SimpleVarParser.TopLevelRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleVarParser#programexpression}.
	 * @param ctx the parse tree
	 */
	void enterProgramexpression(@NotNull SimpleVarParser.ProgramexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleVarParser#programexpression}.
	 * @param ctx the parse tree
	 */
	void exitProgramexpression(@NotNull SimpleVarParser.ProgramexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleVarParser#progstmt}.
	 * @param ctx the parse tree
	 */
	void enterProgstmt(@NotNull SimpleVarParser.ProgstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleVarParser#progstmt}.
	 * @param ctx the parse tree
	 */
	void exitProgstmt(@NotNull SimpleVarParser.ProgstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SimpleVarParser#assignvar}.
	 * @param ctx the parse tree
	 */
	void enterAssignvar(@NotNull SimpleVarParser.AssignvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleVarParser#assignvar}.
	 * @param ctx the parse tree
	 */
	void exitAssignvar(@NotNull SimpleVarParser.AssignvarContext ctx);
}