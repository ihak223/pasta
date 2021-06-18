package com.pasta.interpreter.parsing;

import com.pasta.interpreter.parsing.tokens.Block;
import com.pasta.interpreter.parsing.tokens.Variable;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    public void parse() {
        String[] lines = {"$class Main:", "\t$const main()", "\t\tprint(\"Hello, World\")"};
        List<Block> blocks = new ArrayList<Block>();

        Block currentBlock = new Block();

        boolean inBlock = false;

        int index = 0;
        for (String line : lines) {
            System.out.println(line);
            try {
                if (inBlock && lines[index+1].charAt(0) == '$') {

                    currentBlock.code.add(line);
                    blocks.add(currentBlock);
                    currentBlock.reset();


                } if (!inBlock || line.charAt(0) == '$') {
                    String header = line.substring(1);
                    System.out.println(header);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Error:"+e);
            }
            index++;
        }
    }
}
