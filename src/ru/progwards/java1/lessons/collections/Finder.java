package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Finder {
    public static Collection<Integer> findMinSumPair(Collection<Integer> numbers) {
        int summ = 2 ^ 31 - 1; //миним.сумма
        int summ1;  //сумма двух чисел
        List<Integer> ind = new ArrayList<>();
        List<Integer> numbers1 = new ArrayList<>(numbers);
        for (int i = 0; i < numbers.size()-1; i++) {
            summ1 = numbers1.get(i) + numbers1.get(i + 1);
            if (summ1 < summ) {
                summ = summ1;
                ind.clear();
                ind.add(i);
                ind.add(i + 1);
            }
        }
        return ind;
    }

    public static Collection<Integer> findLocalMax(Collection<Integer> numbers) {
        List<Integer> numbers2 = new ArrayList<>(numbers);
        List<Integer> maxs = new ArrayList<>();
        for (int i = 0; i < numbers2.size() - 1; i++) {
            if (numbers2.get(i) < numbers2.get(i + 1) && numbers2.get(i + 1) > numbers2.get(i + 2)) {
                maxs.add(numbers2.get(i + 1));
            }
        }
        return maxs;
    }

    public static boolean findSequence(Collection<Integer> numbers) {
        int schet = 0;
        for (int i = 1; i <= numbers.size(); i++) {
            if (numbers.contains(i)) {
                schet += 1;
            }
        }
        if (schet == numbers.size()) {
            return true;
        }
        return false;
    }

    public static String findSimilar(Collection<String> names) {
        List<String> names1 = new ArrayList<>(names);
        int col1 = 0;
        String res = "";
        for (int i = 0; i < names1.size()-1; i++) {
            int col = 1;
            if (names1.get(i).equals(names1.get(i + 1))) {
                for (int j = i; j < names1.size()-1; j++) {
                    if (names1.get(j).equals(names1.get(j + 1))) {
                        col += 1;
                    } else break;
                }
            }
            if (col > col1) {
                col1 = col;
                res = names1.get(i) + ":" + String.valueOf(col1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(7);
        num.add(5);
        num.add(1);
        num.add(6);
        num.add(0);
        num.add(3);
        num.add(4);
        num.add(2);
        List<String> spisok = new ArrayList<>();
        spisok.add("Саша");
        spisok.add("Даша");
        spisok.add("Саша");
        spisok.add("Саша");
        spisok.add("Маша");
        spisok.add("Маша");
        spisok.add("Маша");

        for (Integer i : findMinSumPair(num)) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (Integer i : findLocalMax(num)) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
        System.out.println(findSequence(num));
        System.out.println(" ");
        System.out.println(findSimilar(spisok));
    }
}

