package ru.progwards.java1.lessons.test;

import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static String test(String filename) throws IOException {
        if (filename == null) {
            throw new IOException("File not found");
        }
        return "File processing";
    }

    public static void main(String[] args) {
        try {
            System.out.println(test("bbb"));
            System.out.println(test(null));
        } catch (IOException e) {
            System.out.println(e);;
        }
    }
}