package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
        int a1;
        boolean result = false;
        while (number >= 0) {
            a1 = number % 10;
            result = a1 == digit;
            if (result == true) {
                break;
            }
            number = number / 10;

        }
        return result;
    }

    public static int fiboNumber(int n) {
        int sum = 0;
        int b1 = 0;
        int b2 = 1;
        int i = 1;
        do {
            b1 = b2;
            b2 = sum;
            sum = b1 + b2;
            i++;
        }while (i<=n);

        return sum;
    }

    public static boolean isGoldenTriangle(int a, int b, int c) {
        boolean result = false;
        double otn1 = a / c;
        double otn2 = a / b;
        double otn3 = b / a;
        if (a == b) {
            result = 1.61703 < otn1 && otn1 > 1.61903;
            return result;
        } else if (a == c) {
            result = 1.61703 < otn2 && otn2 > 1.61903;
            return result;
        } else if (b == c) {
            result = 1.61703 < otn3 && otn3 > 1.61903;
            return result;
        } else
            return result;
    }

    public static void main(String[] args) {
        boolean a2 = containsDigit(0, 0);
        System.out.println(a2);
        int a3 = fiboNumber(10);
        System.out.println(a3);
        boolean a4 = isGoldenTriangle(7, 7, 2);
        System.out.println(a4);
        for (int i = 1; i<=15; i++)
            System.out.println(fiboNumber(i));
        for (int i = 1; i <= 100; i++)
            for (int j = 1; j <= 100; j++)
                if (isGoldenTriangle(i, i, j))
                     System.out.println("Золотой треугольник с ребрами = "+i+" и основанием "+j);
    }

}
