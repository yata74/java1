package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        int a1;
        boolean result = false;
        while (number>0) {
            a1 = number % 10;
            result = a1 == digit;
            if (result == true) {
                break;
            }
            number = number / 10;

        }
        return result;
    }
    public static void main(String[] args){
        boolean a2 = containsDigit(5467,2);
        System.out.println(a2);
    }
}
