import java.util.Queue;
import java.util.LinkedList;
import org.apache.commons.lang3.StringUtils;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class Compiler {

    public static void main(String[] args) throws Exception {
        new Compiler().compile(args);
    }

    public void compile(String[] args) throws Exception {
        //arguments validation skipped (check out full code on github)
        final File myFile = new File(args[0]);
        String fileName = myFile.getName();
        String fileAbsolutePath = myFile.getAbsolutePath();
        String className = StringUtils.remove(fileName, ".my-java");
        final Queue<Instruction> instructionsQueue = new SyntaxTreeTraverser().getInstructions(fileAbsolutePath);

        final byte[] byteCode = new BytecodeGenerator().generateBytecode(instructionsQueue, className);
        saveBytecodeToClassFile(fileName, byteCode);
    }
    
    private static void saveBytecodeToClassFile(String fileName, byte[] byteCode) throws IOException {
        final String classFile = StringUtils.replace(fileName, ".my-java", ".class");
        OutputStream os = new FileOutputStream(classFile);
        os.write(byteCode);
        os.close();
    }
}
