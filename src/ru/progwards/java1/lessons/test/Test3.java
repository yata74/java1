package ru.progwards.java1.lessons.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
    private static int lineCount(String filename) throws Exception {
        int i = 0;
        try {
            FileReader file1 = new FileReader(filename);
            Scanner scan = new Scanner(file1);
            try {
                while (scan.hasNextLine()) {
                    String strFromFile = scan.nextLine();
                    i = i + 1;
                    System.out.println(strFromFile);
                }
            }finally {
                file1.close();
            }
            return i;
        } catch (Exception e) {
            throw new IOException("Файл не найден.");

        }

    }

    public static void main(String[] args) {
        try {
            System.out.println(lineCount("bbb"));
            System.out.println(lineCount(null));
        } catch (Exception e) {
            System.out.println(e);;
        }
    }
}

