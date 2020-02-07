package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int a1 = number/100;
        int a2 = (number - a1*100)/10;
        int a3 = number - (a1*100 + a2*10);
        System.out.print(a3);
        System.out.print(a2);
        System.out.println(a1);
        return (a1);
    }
    public static void main(String[] args){
        reverseDigits(678);

    }
}
