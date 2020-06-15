package ru.progwards.java1.lessons.maps;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class UsageFrequency {
    List<Character> coll1 = new ArrayList<>();  //кол-ция букв
    List<String> coll2 = new ArrayList<>();  //кол-ция слов
    public void processFile(String fileName)  {
        try (FileReader file = new FileReader(fileName)){//открываем файл для чтения
        try (Scanner scanner = new Scanner(file)) {
            char[] a1;
            while (scanner.hasNext()) {
                String a = scanner.next();
                a1 = a.toCharArray();
                if (Character.isLetter(a1[0])) {
                    coll2.add(a);
                }
                for (int z = 0; z < a1.length; z++) {
                    if (Character.isDigit(a1[z]) || Character.isLetter(a1[z])) {
                        coll1.add(a1[z]);
                    }
                }
            }
        }
        } catch (Exception e) {
            System.out.println(e);
            ;
        }
    }
    public Map<Character, Integer> getLetters() {
        HashMap<Character, Integer> map = new HashMap<>();
        int summ;
        for (int i = 0; i < coll1.size(); i++) {
            summ = 0;
            if (!coll1.get(i).equals('*')) {
                summ = 1;
                for (int j = i + 1; j < coll1.size(); j++) {
                    if (coll1.get(i) == coll1.get(j)) {
                        summ++;
                        coll1.set(j,'*');
                    }
                }
                map.put(coll1.get(i), summ);
            }
        }
            return map;
        }
    public Map<String, Integer> getWords() {
        HashMap<String, Integer> map1 = new HashMap<>();
        int sum;
        for (int i = 0; i < coll2.size() - 1; i++) {
            sum = 0;
            if (!coll2.get(i).equals("*")) {
                sum = 1;
                for (int j = i + 1; j < coll2.size(); j++) {
                    if (coll2.get(i).equals(coll2.get(j))) {
                        sum += 1;
                        coll2.set(j, "*");
                    }
                }
                map1.put(coll2.get(i), sum);
            }
        }
        return map1;
    }
    public static void main(String[] args) {
        UsageFrequency usa = new UsageFrequency();

            usa.processFile("???");
        System.out.println("Все буквы и цифры");
        for(Map.Entry<Character,Integer> entry : usa.getLetters().entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        System.out.println("Все слова");
        for(Map.Entry<String, Integer> entry : usa.getWords().entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());

    }
}
