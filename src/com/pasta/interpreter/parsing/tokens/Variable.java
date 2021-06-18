package com.pasta.interpreter.parsing.tokens;

import com.pasta.util.Hex;

public class Variable {
    Hex hexData;
    String type;
    String varName;
    Boolean global = false;

    public Variable(String data, String name) { // String constructor
        type = "str";
        varName = name;
        hexData = new Hex(data);
    }
    public Variable(char data, String name) { // Character constructor
        type = "char";
        varName = name;
        hexData = new Hex(data);
    }
    public Variable(int data, String name) { // Integer constructor
        type = "str";
        varName = name;
        hexData = new Hex(data);
    }
    public Variable(Boolean data, String name) { // Boolean constructor
        type = "str";
        varName = name;
        hexData = new Hex(data);
    }
}
