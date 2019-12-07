// Generated from D:/SQL/Sem_5/JFK/l1interpreter/src/main/antlr4\Asm.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AsmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AsmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code DoubleArgumentInstruction}
	 * labeled alternative in {@link AsmParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleArgumentInstruction(AsmParser.DoubleArgumentInstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleArgumentInstruction}
	 * labeled alternative in {@link AsmParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleArgumentInstruction(AsmParser.SingleArgumentInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsmParser#targetParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTargetParam(AsmParser.TargetParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Expression}
	 * labeled alternative in {@link AsmParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AsmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HexNumb}
	 * labeled alternative in {@link AsmParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexNumb(AsmParser.HexNumbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link AsmParser#addSubtractExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(AsmParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link AsmParser#addSubtractExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(AsmParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMultExpr}
	 * labeled alternative in {@link AsmParser#addSubtractExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMultExpr(AsmParser.ToMultExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AsmParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(AsmParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMinusExpr}
	 * labeled alternative in {@link AsmParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMinusExpr(AsmParser.ToMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignChange}
	 * labeled alternative in {@link AsmParser#minusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignChange(AsmParser.SignChangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToSimpleArgument}
	 * labeled alternative in {@link AsmParser#minusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSimpleArgument(AsmParser.ToSimpleArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Reg}
	 * labeled alternative in {@link AsmParser#unaryArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg(AsmParser.RegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SignedNumb}
	 * labeled alternative in {@link AsmParser#unaryArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumb(AsmParser.SignedNumbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link AsmParser#unaryArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(AsmParser.BracesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsmParser#signedNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignedNumber(AsmParser.SignedNumberContext ctx);
}