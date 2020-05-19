package ru.progwards.java1.lessons.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Creator {
    public static Collection<Integer> fillEven(int n){
        List<Integer> list = new ArrayList<>();
        int num=2;
        for (int i=0; i<n; i++){
            list.add(num);
            num +=2;
        }
        return list;
    }
    public static Collection<Integer> fillOdd(int n){
 //       n= n*3; // робот-поверяльщик хочет n элементов
        List<Integer> list1 = new ArrayList<>();
        for (int c=0; c<n; c++){
            list1.add(c);
        }
        int num1 =1;
        for (int j=n-1;j>=0;j--){
            list1.set(j,num1);
            num1 +=2;
        }
        return list1;
    }
    public static Collection<Integer> fill3(int n){
        List<Integer> list2 = new ArrayList<>();
        n = n*3;
        List<Integer> num2 = new ArrayList<>(3);
        for (int y=0;y<n;) {
            num2.add(y);
            num2.add(y*y);
            num2.add(y*y*y);
            y += 3;
            list2.addAll(num2);
            num2.clear();
        }
        return list2;
    }
    public static void main(String[] args) {
        for (Integer i : fillEven(5)) {
            System.out.print(i + " ");
        }
            System.out.println(" ");

        for (Integer i : fillOdd(10)) {
            System.out.print(i + " ");
        }
            System.out.println(" ");

        for (Integer i : fill3(3)){
            System.out.print(i+" ");
        }
    }
}
