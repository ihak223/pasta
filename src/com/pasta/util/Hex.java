package com.pasta.util;

public class Hex {
    public String hexString;
    String type;
    public Hex(int decimal) { // Integer Constructor
        type = "int";
        hexString = Integer.toHexString(decimal);
    }
    public Hex(char character) { // Character Constructor
        type = "char";
        hexString = Integer.toHexString((int) character);
    }
    public Hex(float number) { // Float Constructor
        type = "float";
        hexString = Float.toHexString(number);
    }
    public Hex(Boolean bool) { // Boolean Constructor
        type = "bool";
        int boolInt = bool? 1 : 0;

        hexString = Integer.toHexString(boolInt);
    }
    public int getInt() {
        return Integer.parseInt(hexString, 16);
    }
    public char getChar() {
        return (char) Integer.parseInt(hexString, 16);
    }
    /*
    public float getFloat() {
        long i = Long.parseLong(hexString, 16);
        return Float.intBitsToFloat((int) i);
    }
    */
    public boolean getBoolean() {
        return (Integer.parseInt(hexString, 16) == 1);
    }
}
