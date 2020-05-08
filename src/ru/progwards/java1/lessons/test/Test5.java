package ru.progwards.java1.lessons.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test5 {
    // меняем слова в строке в обратном порядке
    public static String invertWords(String sentence){
        String[] mass = sentence.split(" ");
        int i;
        String res = "";
        for (i=mass.length; i!=0; i--) {
            if (i - 1 != 0) {
                res += mass[i - 1];
                res += ".";
            } else res += mass[i - 1];
        }
    
        return res;
    }

    public static void main(String[] args) {
        invertWords("мама папа брат");
    }
}
