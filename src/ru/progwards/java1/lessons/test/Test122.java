package ru.progwards.java1.lessons.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test122 {
    public static List<Integer> filter(List<Integer> list) {
        int result = 0;
        for (Integer i : list) {
            result += i;
        }
        Integer res = (Integer) (result / 100);
        List<Integer> resList = new ArrayList();
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) < res) {
                resList.add(list.get(j));
                list.remove(j);
                j=j-1;
            }
        }
        return resList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        for (int i = -4; i < 50; i++) {
            list1.add(i);
        }

        for (Integer i : filter(list1)) {
            System.out.print(i+" ");
        }
    }
}
