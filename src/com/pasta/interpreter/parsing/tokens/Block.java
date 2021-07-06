package com.pasta.interpreter.parsing.tokens;

import java.util.List;

public class Block {

    public String name;
    public List<String> code;
    public List<Value> args;

    public Block() {

    }
    public void reset() {
        name = null;
        code = null;
        args = null;
    }
}
