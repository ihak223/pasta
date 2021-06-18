package com.pasta.interpreter.parsing;

import com.pasta.interpreter.parsing.tokens.Token;

import java.util.ArrayList;
import java.util.List;

public class Lexer {

    public Lexer() {

        doStuff();

    }

    public void doStuff() {

        String[] script = {"Int i = 420", "Str s = \"Hello, World\""};

        for (String line : script) {

            List<Token> tokens = new ArrayList<Token>();

            String[] splitLine = line.split(" ");
            switch (splitLine[0]) {
                case "Int":


                default:
                    System.err.println("[Error] Error While Lexering.\nUnrecognized Token");

            }

        }


    }

}
