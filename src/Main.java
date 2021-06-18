import com.pasta.interpreter.parsing.Lexer;
import com.pasta.interpreter.parsing.Parser;

import java.util.List;
import com.pasta.util.*;

public class Main {
    public static  void main(String[] args) {
        Hex hex = new Hex('y');
        System.out.println(hex.hexString);
        System.out.println(hex.getInt());
        System.out.println(hex.getChar());
    }
}
