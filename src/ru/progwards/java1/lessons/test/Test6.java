package ru.progwards.java1.lessons.test;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Test6 {
    public static String setStars(String filename) throws IOException {
        String res = "";
        long pos = 9L;
        try {
            RandomAccessFile file = new RandomAccessFile(filename, "rw");
            long len = file.length();
            while (pos <= len) {
                file.seek(pos);
                int dy = file.read();
                res += (char) dy;
                file.seek(pos);
                file.write('*');
                pos += 10;
            }
            file.close();
        } catch (Exception e) {
            return String.valueOf(e);
        }
            return res;
        }


    public static void main(String[] args) {
        try {
            System.out.println(setStars("????"));
        } catch (IOException e) {
            System.out.println(e);
            ;
        }
    }
}