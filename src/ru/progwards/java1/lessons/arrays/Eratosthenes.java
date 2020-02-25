package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    private boolean[] sieve;
    public Eratosthenes(int N) {
        int a = N;
        sieve = new boolean[a];
        Arrays.fill(sieve, true);
        sift();
    }

    private void sift (){
        for (int i = 2; i < sieve.length+1; i++) {
           for (int j=2; j*i< sieve.length+1; j++){
                if (sieve [j*i-1] == true) {
                    sieve[j*i-1] = false;
                }
            }
        }
    }

    public boolean isSimple(int n1) {

        return sieve[n1-1];
    }
    public static void main(String[] args){
    Eratosthenes Eratosthenes1 = new Eratosthenes(20);
        System.out.println(Arrays.toString(Eratosthenes1.sieve));
        System.out.println(Eratosthenes1.isSimple(3));
}
}
