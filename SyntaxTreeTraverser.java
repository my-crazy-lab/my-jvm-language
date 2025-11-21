import java.util.Queue;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.BaseErrorListener;

public class SyntaxTreeTraverser {
    public Queue<Instruction> getInstructions(String fileAbsolutePath) throws IOException {
        CharStream charStream = new ANTLRFileStream(fileAbsolutePath); //fileAbolutePath
        MyJavaLexer lexer = new MyJavaLexer(charStream);  //create lexer 
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        MyJavaParser parser = new MyJavaParser(tokenStream);
        TreeWalkListener listener = new TreeWalkListener(); //TreeWalkListener extends EnkelBaseLitener - handles parse tree visiting events
        BaseErrorListener errorListener = new TreeWalkErrorListener(); //TreeWalkErrorListener - handles parse tree visiting error events

        parser.addErrorListener(errorListener);
        parser.addParseListener(listener);
        parser.compilationUnit(); //compilation unit is root parser rule - start from it!
        return listener.getInstructionsQueue();
    }
}
