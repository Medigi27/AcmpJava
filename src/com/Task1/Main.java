package com.test.solution;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{ //имя класса должно быть Main
    public static void main(String[] argv) throws IOException{
        new Main().run();
    }
    public void run() throws IOException{
        Scanner sc = new Scanner(new File("./src/resources/Task1/input.txt"));
        int a =sc.nextInt(), b=sc.nextInt();
        PrintWriter pw = new PrintWriter(new File("./src/resources/Task1/output.txt"));
        pw.print(a+b);
        pw.close();
    }
}