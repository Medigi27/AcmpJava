package com.Task2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] argv) throws IOException{
        new Task2().run();
    }
    public void run() throws IOException{
        Scanner sc = new Scanner(new File("./src/resources/Task2/input.txt"));
        int a = sc.nextInt();
        PrintWriter pw = new PrintWriter(new File("./src/resources/Task2/output.txt"));
        pw.print(a);
        pw.close();


    }


}
