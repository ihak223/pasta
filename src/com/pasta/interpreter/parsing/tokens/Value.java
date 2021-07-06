package com.pasta.interpreter.parsing.tokens;

public class Value {

    public String val;
    public String type;

    public Value() {

    }
    public int getInt() {
        return Integer.parseInt(val);
    }
    public char getChar() {
        return val.charAt(0);
    }
    public String getString() {
        return val;
    }
    public float getFloat() {
        return Float.parseFloat(val);
    }
    public double getDouble() {
        return Double.parseDouble(val);
    }
    public boolean getBool() {
        return Boolean.parseBoolean(val);
    }
}
