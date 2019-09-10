package com.Task10;


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] argv) throws IOException {
        Scanner sc = new Scanner(new File("./src/resources/Task10/input.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (sc.nextInt() > 0) {
            list.add(sc.nextInt());
        }
        PrintWriter pw = new PrintWriter(new File("./src/resources/Task10/output.txt"));
        pw.print(list);
        pw.close();
    }
}