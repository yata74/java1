package ru.progwards.java1.lessons.io1;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharFilter {
    public static void filterFile(String inFileName, String outFileName, String filter)throws Exception{
        try {
            FileReader file1 = new FileReader(inFileName);//открываем файл для чтения
            Scanner scanner = new Scanner(file1);
            FileWriter file2 = new FileWriter(outFileName);//открываем файл для записи.
            try {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                char mass1[] = str.toCharArray();//строку посимвольно в массив
                char mass2[] = filter.toCharArray();//фильтр посимвольно в массив
                for (int i = 0; i < mass1.length; i++) {
                    int z =0;
                    for (int j = 0; j < mass2.length; j++) {
                        if (mass1[i] != mass2[j]) {
                        }else z=1;
                    }
                        if (z==0){
                            file2.write(mass1[i]);
                        }
                    }
                }
            } finally {
                file1.close();
                file2.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws Exception {
        try {
            String filter = "-,. ()";
            filterFile("text1.txt", "text2.txt", filter);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
