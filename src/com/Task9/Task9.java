package com.Task9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task9 {

    public static void main(String[] argv) throws IOException {
        Scanner sc = new Scanner (new File("./src/resources/Task9/input.txt"));
        int W = sc.nextInt(), H = sc.nextInt(), R = sc.nextInt();

        PrintWriter pw = new PrintWriter (new File("./src/resources/Task9/output.txt"));
        if ((2*R) <= W || (2*R) <= H) {
            pw.print("YES");
        }
        else {
            pw.print("NO");
        }
        sc.close();
        pw.close();




    }



}