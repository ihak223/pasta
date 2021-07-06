package com.pasta.interpreter.parsing;

import java.util.ArrayList;
import java.util.List;
import com.pasta.interpreter.parsing.tokens.Block;

public class BlockParser {
    public void parse() {
        String[] lines = {"$class Main:", "\t$const main()", "  \tprint(\"Hello, World\")", "$test", "\ttest", "  ", "  "};
        List<Block> blocks = new ArrayList<Block>();

        Block currentBlock = new Block();

        boolean inBlock = false;

        int index = 0;
        System.out.printf("[PASTA : Block Parser] Running File, Lines : %S\n", (lines.length));
        for (String line : lines) {
            System.out.printf("\n[PASTA : Block Parser] Line : %S, Index : "+index+"\n", line);
            try {
                if (inBlock && lines[index+1].charAt(0) == '$') {

                    currentBlock.code.add(line);
                    blocks.add(currentBlock);
                    currentBlock.reset();
                    inBlock = false;
                    System.out.println("[PASTA : Block Parser] Closing Header ... ");

                } else if (!inBlock && line.charAt(0) == '$') {

                    inBlock = true;
                    System.out.println("[PASTA : Block Parser] Found Header : '"+line+"'");

                } else if (inBlock && (line.charAt(0) != '\t' && line.substring(0, 2) != "  ")) {

                    currentBlock.code.add(line);
                    blocks.add(currentBlock);
                    currentBlock.reset();
                    inBlock = false;
                    System.out.println("[PASTA : Block Parser] Closing Header ... ");

                }
            } catch (ArrayIndexOutOfBoundsException e) {
                if (index == lines.length || index == lines.length-1) {
                    System.out.println("[PASTA : Block Parser] End Of File ... ");
                } else {
                    System.out.println("[PASTA : Block Parser : Error] Something went wrong ... ");
                }
            }
            index++;
        }
    }
}
