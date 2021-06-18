package com.pasta.interpreter.parsing;

import com.pasta.interpreter.parsing.tokens.Block;
import com.pasta.interpreter.parsing.tokens.Variable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlockParser {
    public void parse() {
        String[] lines = {"$class Main:", "\t$const main()", "  \tprint(\"Hello, World\")"};
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
                    inBlock = false;
                    System.out.println("end header");

                } else if (!inBlock && line.charAt(0) == '$') {

                    String header = line.substring(1);
                    System.out.println(header);
                    inBlock = true;
                    System.out.println("header");
                    System.out.println(inBlock);

                } else if (inBlock && (line.charAt(0) != '\t' && line.substring(0, 2) != "  ")) {

                    currentBlock.code.add(line);
                    blocks.add(currentBlock);
                    currentBlock.reset();
                    inBlock = false;
                    System.out.println("no tab");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("[Error]");
            }
            index++;
        }
    }
}
