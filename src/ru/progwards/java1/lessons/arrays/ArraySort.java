package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void sort(int[] a){
        for (int i=0; i<a.length; i++){
            for (int j=i; j<a.length; j++){
                if ( a[i]>a[j]){
                    int b = a[i];
                    a[i] = a[j];
                    a[j]= b;
                }
            }
        }
    }
    public static void main(String[] args){
        int [] a1 = {9,4,7,2,0,-3};
        sort(a1);
        System.out.println(Arrays.toString(a1));
    }
}
