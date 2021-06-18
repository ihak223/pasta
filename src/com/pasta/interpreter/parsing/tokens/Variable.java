package com.pasta.interpreter.parsing.tokens;

import com.pasta.util.Hex;

public class Variable {

    Hex hexData;
    String type;
    String varName;
    Boolean global = false;
    String path;

    public Variable(String data, String name, String strPath) { // String constructor
        type = "str";
        varName = name;
        hexData = new Hex(data);
        path = strPath;
    }
    public Variable(char data, String name, String strPath) { // Character constructor
        type = "char";
        varName = name;
        hexData = new Hex(data);
        path = strPath;
    }
    public Variable(int data, String name, String strPath) { // Integer constructor
        type = "str";
        varName = name;
        hexData = new Hex(data);
        path = strPath;
    }
    public Variable(Boolean data, String name, String strPath) { // Boolean constructor
        type = "str";
        varName = name;
        hexData = new Hex(data);
        path = strPath;
    }
}
