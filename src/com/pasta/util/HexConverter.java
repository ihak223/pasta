package com.pasta.util;

public class HexConverter {
    public static String intToHex(int decimal) {
        return Integer.toHexString(decimal);
    }
    public static String charToHex(char character) {
        return Integer.toHexString((int) character);
    }
    public static String floatToHex(float num) {
        return Float.toHexString(num);
    }
    public static int hexToInt(String hex) {
        return Integer.parseInt(hex, 16);
    }
    public static char hexToChar(String hex) {

    }
}
