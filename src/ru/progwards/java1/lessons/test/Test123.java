package ru.progwards.java1.lessons.test;

import java.util.ListIterator;

public class Test123 {
    public void iterator3(ListIterator<Integer> iterator){
        while (iterator.hasNext()){
            Integer obj = iterator.next();
            if (obj%3 ==0){
                iterator.set(iterator.nextIndex()-1);
            }
        }
    }
}
