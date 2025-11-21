// Generated from MyJava.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyJavaParser}.
 */
public interface MyJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(MyJavaParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(MyJavaParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MyJavaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MyJavaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MyJavaParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MyJavaParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJavaParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MyJavaParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJavaParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MyJavaParser.ValueContext ctx);
}