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
    public String referencePath;

    public Token() {

    }
    public Token(String nameStr) {

    }
    public Token(String nameStr, Variable referenceVar) {
        isReference = true;
        reference = referenceVar;
        referencePath = reference.path;
        name = nameStr;

    }

}
