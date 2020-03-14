package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {
    private static CacheInfo lastFibo=null;
    //рассчитываем число Фибоначи
    public static int fiboNumber(int n) {

        if (lastFibo==null || n != lastFibo.n){
            int sum = 0;
            int b1;
            int b2 = 1;
            int i = 1;
            do {
                b1 = b2;
                b2 = sum;
                sum = b1 + b2;
                i++;
            } while (i <= n);
             lastFibo = new CacheInfo(n,sum);
            return sum;
        }else {
            return lastFibo.fibo;

        }
    }

    //вложенный класс
    public static class CacheInfo {
        int n;
        int fibo;

        public CacheInfo(int n, int fibo) {
            this.n = n;
            this.fibo = fibo;
        }

        public static CacheInfo getLastFibo() {
            return lastFibo;
        }

        public static void clearLastFibo() {
            lastFibo = null;
        }


    }
    public static void main(String[] args){
        System.out.println(fiboNumber(10));
        System.out.println(fiboNumber(10));
        System.out.println(fiboNumber(3));

    }
}
