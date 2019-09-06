package com.Task4;

import java.io.File;
        import java.io.IOException;
        import java.io.PrintWriter;
        import java.util.Arrays;
        import java.util.Scanner;

public class Task4 {

    public static void main(String[] argv) throws IOException{
        Scanner sc = new Scanner (new File("./src/resources/Task4/input.txt"));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] tab = {a, b, c};
        int min = Arrays.stream(tab).min().getAsInt();
        int max = Arrays.stream(tab).max().getAsInt();
        PrintWriter pw = new PrintWriter(new File("./src/resources/Task4/output.txt"));
        pw.println(max - min);
        pw.close();

    }
}
