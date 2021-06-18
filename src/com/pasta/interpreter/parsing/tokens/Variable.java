package com.pasta.interpreter.parsing.tokens;

public class Variable {
    String type;
    String pointer;
    Boolean global = false;
    String data;

    public Variable(String type, String name) {
        this.type = type;
        this.pointer = name;
    }

    public Variable(String type, String name, Boolean global) {
        this.type = type;
        this.pointer = name;
        this.global = global;
    }
    public void setData(String data) {
        this.data = data;
    }
}
