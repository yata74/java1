package ru.progwards.java1.lessons.io2;

import java.util.Arrays;

public class Translator {
    private  String[] inLang;
    private String[] outLang;
    public Translator(String[] inLang, String[] outLang) {
        this.inLang = inLang;
        this.outLang = outLang;
    }
    public  String translate(String sentence) {
        //разделяем строку на слова
        String[] line = sentence.split(" ");
        String resLine = "";    // получаемая строка
        for (int i = 0; i < line.length; i++) {
            //разделяем слово на символы
            char[] mass = line[i].toCharArray();
            String res = " ";    //получаемое слово
            int z = 0; //индекс большой буквы
            char k = ' ';
            //
            if (Character.isUpperCase(mass[0])) {
                z = 1;
            }
            // проверяем последний символ на то, что он буква
            if (!Character.isLetter(mass[mass.length - 1])) {
                k = mass[mass.length - 1];
                int a1 = mass.length - 1;
                res = line[i].substring(0, a1);
            } else res = line[i];
            if (z == 1)
                res = res.toLowerCase();
            for (int j = 0; j < inLang.length; j++) {
                if (res.equals(inLang[j])) {
                    if (z == 1) {  //если надо делаем большую букву
                        char[] mass1 = outLang[j].toCharArray();
                        mass1[0] = Character.toUpperCase(mass1[0]);
                        res = String.valueOf(mass1[0]);
                        for (int y = 1; y < mass1.length; y++) {
                            res += mass1[y];
                        }
                    }else res= outLang[j];
                }
            }

            resLine += res+k;

        }
        return resLine;

    }

    public static void main(String[] args) {
        String[] inLang = {"mam","dad","sister","brother"};
        String[] outLang = {"мама","папа","сестра","брат"};
        Translator a1 = new Translator(inLang,outLang);
        String a3 = "Mam fff sister!";
        System.out.println(a1.translate(a3));
    }
}
