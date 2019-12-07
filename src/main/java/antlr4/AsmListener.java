// Generated from D:/SQL/Sem_5/JFK/l1interpreter/src/main/antlr4\Asm.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AsmParser}.
 */
public interface AsmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code DoubleArgumentInstruction}
	 * labeled alternative in {@link AsmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDoubleArgumentInstruction(AsmParser.DoubleArgumentInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleArgumentInstruction}
	 * labeled alternative in {@link AsmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDoubleArgumentInstruction(AsmParser.DoubleArgumentInstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleArgumentInstruction}
	 * labeled alternative in {@link AsmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSingleArgumentInstruction(AsmParser.SingleArgumentInstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleArgumentInstruction}
	 * labeled alternative in {@link AsmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSingleArgumentInstruction(AsmParser.SingleArgumentInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsmParser#targetParam}.
	 * @param ctx the parse tree
	 */
	void enterTargetParam(AsmParser.TargetParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsmParser#targetParam}.
	 * @param ctx the parse tree
	 */
	void exitTargetParam(AsmParser.TargetParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link AsmParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AsmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link AsmParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AsmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HexNumb}
	 * labeled alternative in {@link AsmParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterHexNumb(AsmParser.HexNumbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HexNumb}
	 * labeled alternative in {@link AsmParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitHexNumb(AsmParser.HexNumbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link AsmParser#addSubtractExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(AsmParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link AsmParser#addSubtractExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(AsmParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link AsmParser#addSubtractExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(AsmParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link AsmParser#addSubtractExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(AsmParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToMultExpr}
	 * labeled alternative in {@link AsmParser#addSubtractExpr}.
	 * @param ctx the parse tree
	 */
	void enterToMultExpr(AsmParser.ToMultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToMultExpr}
	 * labeled alternative in {@link AsmParser#addSubtractExpr}.
	 * @param ctx the parse tree
	 */
	void exitToMultExpr(AsmParser.ToMultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AsmParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(AsmParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AsmParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(AsmParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToMinusExpr}
	 * labeled alternative in {@link AsmParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterToMinusExpr(AsmParser.ToMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToMinusExpr}
	 * labeled alternative in {@link AsmParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitToMinusExpr(AsmParser.ToMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignChange}
	 * labeled alternative in {@link AsmParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void enterSignChange(AsmParser.SignChangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignChange}
	 * labeled alternative in {@link AsmParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void exitSignChange(AsmParser.SignChangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToSimpleArgument}
	 * labeled alternative in {@link AsmParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void enterToSimpleArgument(AsmParser.ToSimpleArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToSimpleArgument}
	 * labeled alternative in {@link AsmParser#minusExpr}.
	 * @param ctx the parse tree
	 */
	void exitToSimpleArgument(AsmParser.ToSimpleArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Reg}
	 * labeled alternative in {@link AsmParser#unaryArgument}.
	 * @param ctx the parse tree
	 */
	void enterReg(AsmParser.RegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Reg}
	 * labeled alternative in {@link AsmParser#unaryArgument}.
	 * @param ctx the parse tree
	 */
	void exitReg(AsmParser.RegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SignedNumb}
	 * labeled alternative in {@link AsmParser#unaryArgument}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumb(AsmParser.SignedNumbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SignedNumb}
	 * labeled alternative in {@link AsmParser#unaryArgument}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumb(AsmParser.SignedNumbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link AsmParser#unaryArgument}.
	 * @param ctx the parse tree
	 */
	void enterBraces(AsmParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link AsmParser#unaryArgument}.
	 * @param ctx the parse tree
	 */
	void exitBraces(AsmParser.BracesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsmParser#signedNumber}.
	 * @param ctx the parse tree
	 */
	void enterSignedNumber(AsmParser.SignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsmParser#signedNumber}.
	 * @param ctx the parse tree
	 */
	void exitSignedNumber(AsmParser.SignedNumberContext ctx);
}