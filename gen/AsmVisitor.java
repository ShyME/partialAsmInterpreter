// Generated from D:/SQL/Sem_5/JFK/l1interpreter/src/main/antlr4\Asm.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link AsmParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(AsmParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AsmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsmParser#simpleArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleArgument(AsmParser.SimpleArgumentContext ctx);
}