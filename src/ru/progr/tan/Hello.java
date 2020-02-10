package ru.progr.tan;
public class Hello {

    static long factorial(long n) {
        long i;
        long result = 1L;
        for (i = 1L; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(7));
    }
}