package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Coder {
    public static void codeFile(String inFileName, String outFileName, char[] code, String logName)  {

        try {
            FileReader file1 = new FileReader(inFileName);
            Scanner scanner = new Scanner(file1);
            FileWriter file2 = new FileWriter(outFileName);

            try {
                while (scanner.hasNextLine()) {
                    String str = scanner.nextLine();
                    char mass[] = str.toCharArray();
                    for (int i = 0; i < mass.length; i++) {
                        mass[i] = code[mass[i]];
//                    int simvol = file1.read();
//                    int a1 = code[simvol];
                    }
                        file2.write(mass);

                }
            } finally {
                file1.close();
                file2.close();
            }
        } catch (Exception e) {
            LogFileWrite.log(e.getMessage());
        }
    }


    public static class LogFileWrite {
        private static String logName;

        public static boolean log(String str) {
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
