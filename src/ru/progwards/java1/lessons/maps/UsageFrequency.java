package ru.progwards.java1.lessons.maps;

import java.io.FileReader;
import java.util.*;

public class UsageFrequency {
    List<Character> coll1 = new ArrayList<>();  //кол-ция букв
    List<String> coll2 = new ArrayList<>();  //кол-ция слов
    public void processFile(String fileName)  {
        try (FileReader file = new FileReader(fileName)){//открываем файл для чтения
        try (Scanner scanner = new Scanner(file)) {
            String[] a1;
            char[] a2;
            while (scanner.hasNext()) {
                String a = scanner.nextLine();
                a1 = a.split("[,;:=<>/ '?.()@]+");
                for (int i = 0; i < a1.length; i++) {
                    a2 = a1[i].toCharArray();
                    if(a2.length!=0) {
                        if (Character.isDigit(a2[0]) || Character.isLetter(a2[0])) {
                            coll2.add(a1[i]);
                        }
                        for (int z = 0; z < a2.length; z++) {
                            if (Character.isDigit(a2[z]) || Character.isLetter(a2[z])) {
                                coll1.add(a2[z]);
                            }
                        }
                    }
                }
            }
        }
        } catch (Exception e) {
            e.printStackTrace();;
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

            usa.processFile("text2.txt");
        System.out.println("Все буквы и цифры");
        for(Map.Entry<Character,Integer> entry : usa.getLetters().entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        System.out.println("Все слова");
        for(Map.Entry<String, Integer> entry : usa.getWords().entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());

    }
}
