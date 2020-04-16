package ru.progwards.java1.lessons.test;

public class Test1 {
    public static Integer sqr(Integer n){

        try{
            Integer res =  n * n;
            return res;
        }catch (NullPointerException e){
            Integer res = -1;
            return res;
        }
    }

    public static void main (String[] args){
        System.out.println(sqr(1));
        System.out.println(sqr(null));


    }
}
