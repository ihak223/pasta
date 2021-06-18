package com.pasta.interpreter.parsing.tokens;

public class Token {

    public enum Type {
        INT("Int"),
        STR("Str"),
        CHAR("Char"),
        PRINT("Print"),
        REF("Ref");


        Type(String str) {
        }
    }

    public String name;
    public Boolean isReference;
    public Variable reference;

    public Token() {

    }
    public Token(String nameStr) {

    }
    public Token(String nameStr, Variable reference) {
        isReference = true;

    }

}
