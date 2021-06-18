package com.pasta.util;

public class Hex {
    String hexString;
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

        hexString = Integer.toHexString(Integer.parseInt(Integer.toString(boolInt), 2));
    }
    public int get() {

    }

}
