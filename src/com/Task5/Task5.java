package com.Task5;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] argv) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();
        int y = a * b;
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        if (y == c) {

            pw.println("y");
        }
        else {

            pw.println("no");
        }
        pw.close();

    }
}