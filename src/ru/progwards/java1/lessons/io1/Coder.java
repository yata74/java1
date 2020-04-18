package ru.progwards.java1.lessons.io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Arrays;

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName)  {

        try {
            FileInputStream reader = new FileInputStream(inFileName);
            FileOutputStream writer = new FileOutputStream(outFileName);

            try {
                byte[] bytes = reader.readAllBytes();
                for (int i = 0; i < bytes.length; i++)
                    bytes[i] = (byte) code[bytes[i]];
                writer.write(bytes);

            } finally
            {
                writer.close();
                reader.close();
            }
        } catch (Exception e) {
            LogFileWrite.log(logName,e.getMessage());
        }
    }


    public static class LogFileWrite {

        public static boolean log(String logName,String str) {
            try {
                FileWriter logFile = new FileWriter(logName, true);
                try {
                    logFile.write(str + "\n");
                } finally {
                    logFile.close();
                }
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
            return true;
        }
    }


        public static void main(String[] args)
        {
//=====
            char[] code = new char[256];
            Arrays.fill(code, '*');

            for (int i = 48; i < 58; i++)
                code[i] = (char) (i + 16);
//-----

            codeFile("text1.txt", "text2.txt", code, "log.txt");
        }
    }
