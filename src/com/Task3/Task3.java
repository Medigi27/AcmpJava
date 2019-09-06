package com.Task3;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] argv) throws IOException{
        Scanner sc = new Scanner(new File("./src/resources/Task3/input.txt"));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        PrintWriter pw = new PrintWriter(new File("./src/resources/Task3/output.txt"));
        pw.print(a*b*c*2);
        pw.close();
    }
}
