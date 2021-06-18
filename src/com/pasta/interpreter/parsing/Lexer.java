package com.pasta.interpreter.parsing;

import com.pasta.interpreter.parsing.*;
import com.pasta.util.Readfile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lexer {

    public Lexer() {
        listTest();
    }
    public void listTest() {
        String[] strs = {"$class public Readfile:", "   $main():", "   print('Hello, World')"};
        List<String> test = Arrays.asList(strs);

        for (String line : test) {
            System.out.println(line);
            if (line.charAt(0) == '\t' || line.substring(0, 3).equals("   ")) {
                System.out.println("tabbed");
            } else {
                System.out.println("not tabbed");
            }
        }
    }
}
