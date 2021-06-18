package com.pasta.util;

import java.io.*;
import java.util.*;

public class Readfile {
    List<String> someData;
    public List<String> readFile(String path) {
        try {
            File myObj = new File(path);
            Scanner myReader = new Scanner(myObj);
            List<String> lines = new ArrayList<String>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                lines.add(data);
            }
            this.someData = lines;
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return someData;
    }

}
