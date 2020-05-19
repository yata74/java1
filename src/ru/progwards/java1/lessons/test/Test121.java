package ru.progwards.java1.lessons.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test121 {
    public static List<Integer> listAction(List<Integer> list){
        list.remove(Collections.min(list));
        list.add(0,list.size());
        list.add(2,Collections.max(list));
        return list;
    }
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList<>();
        for (int i=0; i<5; i++){
            list1.add(i);
        }

        for (Integer i : listAction(list1)){
            System.out.println(i);
        }

    }
}
