package ru.progwards.java1.lessons.sets;

import java.io.FileReader;
import java.util.*;

public class LettersInFile {
    public static String process(String fileName) throws Exception{
        FileReader file1 = new FileReader(fileName);//открываем файл для чтения
        Scanner scanner = new Scanner(file1);
        TreeSet<Character> res = new TreeSet<>();
        String resStr ="";
        while (scanner.hasNext()){
            String slovo = scanner.next();
            char []mass = slovo.toCharArray();
            for (int i=0; i<mass.length; i++){
                if (Character.isLetter(mass[i])){
                res.add(mass[i]);
                }
            }
        }
        for (Character j: res){
            resStr += j;
        }
        return resStr;
    }

    public static void main(String[] args) {
        try{
            System.out.println(process("text2.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}