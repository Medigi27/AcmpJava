package com.Task8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Task8 {

    public static void main(String[] argv) throws IOException {
        Scanner sc = new Scanner (new File("./src/resources/Task8/input.txt"));
        int a = sc.nextInt();
        PrintWriter pw = new PrintWriter(new File("./src/resources/Task8/output.txt"));

        if (a > 0){
                while (a % 2 == 0) {
                    a /= 2;

                            if (a == 1) {
                                pw.print("YES");
                            } else {
                                pw.print("NO");
                            }
                }


        }
        else {
            pw.print("NO");
        }
        pw.close();
    }

}