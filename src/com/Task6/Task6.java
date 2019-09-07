package com.Task6;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] argv) throws IOException {
        Scanner sc = new Scanner(new File("input.txt"));
        int S = sc.nextInt();
        sc.close();
        int x = S / 6;
        int Kat = x * 4;
        PrintWriter pw = new PrintWriter(new File("output.txt"));
        pw.println(x + " " + Kat + " " + x);
        pw.close();



    }
}