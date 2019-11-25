package antlr4;// Generated from D:/SQL/Sem_5/JFK/l1interpreter/src/main/antlr4\Asm.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AsmParser}.
 */
public interface AsmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AsmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(AsmParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(AsmParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AsmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AsmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsmParser#simpleArgument}.
	 * @param ctx the parse tree
	 */
	void enterSimpleArgument(AsmParser.SimpleArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsmParser#simpleArgument}.
	 * @param ctx the parse tree
	 */
	void exitSimpleArgument(AsmParser.SimpleArgumentContext ctx);
}