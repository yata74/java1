package ru.progr.tan;

public class T32 {
    static double fractional(double num) {

        double num1 = num % 1;
        System.out.println(num1);
        return(num1);

    }

    public static void main(String[] args) {
     fractional(0.45);

    }
}
