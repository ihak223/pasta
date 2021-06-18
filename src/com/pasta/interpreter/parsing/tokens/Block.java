package com.pasta.interpreter.parsing.tokens;

import java.util.ArrayList;
import java.util.List;

public class Block {
    public String name;
    public String type;
    public Variable[] args;
    public boolean isPublic;
    public boolean returnType;
    public List<String> code = new ArrayList<String>();

    public Block(String name, String type, Variable[] args, boolean isPublic, boolean returnType, List<String> code) {
        this.name = name;
        this.type = type;
        this.args = args;
        this.isPublic = isPublic;
        this.returnType = returnType;
        this.code = code;
    }
    public Block(String name, String type, boolean isPublic, List<String> code) {
        this.name = name;
        this.type = type;
        this.isPublic = isPublic;
        this.code = code;
    }
    public Block() {

    }
    public void reset() {
        String name = null;
        String type = null;
        Variable[] args = {};
        boolean isPublic = false;
        boolean returnType = false;
        List<String> code = new ArrayList<String>();
    }

}
