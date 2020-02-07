package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static int reverseDigits(int number) {
        int a1 = number/100;
        int a2 = (number - a1*100)/10;
        int a3 = number - (a1*100 + a2*10);
        int a4 = a3*100+a2*10+a1;
        return a4;
    }
    public static void main(String[] args){
        int a5 = reverseDigits(698);
        System.out.println(a5);

    }
}
