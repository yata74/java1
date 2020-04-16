package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.util.Scanner;

public class LineCount {
    public static int calcEmpty(String fileName)  {
        int i = 0;
        try {
            FileReader file1 = new FileReader(fileName);
            Scanner scan = new Scanner(file1);
            try {
                while (scan.hasNextLine()) {
                    String a1 = scan.nextLine();
                    if (a1.equals("")) {
                    i = i + 1;
                      }
                }
            }finally {
                file1.close();
            }
            return i;
        } catch (Exception e) {
            return -1;

        }
    }
    public static void main(String[] args) {
        try {
            System.out.println(calcEmpty("text1.txt"));

        } catch (Exception e) {
            System.out.println(e);;
        }
    }
}
