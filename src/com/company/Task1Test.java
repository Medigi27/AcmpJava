package com.company;
import java.io.*;
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Task1Test {
    public static void main(String[] args) throws Exception {
        Path filePath = Paths.get("input.txt");
        Scanner scanner = new Scanner(filePath);
        List<Integer> integers = new ArrayList<>();
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                scanner.next();
            }
        }
    }

}
