import com.pasta.interpreter.parsing.BlockParser;
import com.pasta.interpreter.parsing.Lexer;
import com.pasta.util.*;

public class Main {
    public static  void main(String[] args) {
        BlockParser parser = new BlockParser();
        parser.parse();
        System.out.println("Ran File ...");
    }
}
