package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;


public class BigAlgebra {
     public static BigDecimal fastPow(BigDecimal num, int pow) {
         // переводим pow в двоичное число
         Integer a1 = pow & 0b11111111;
         String res = "";
         for (int i = 0; i < 8; i++) {
             byte x = 0b00000001;
             x &= a1;
             if (x == 0b00000001) {
                 res = 1 + res;
             } else res = 0 + res;
             a1 >>= 1;
         }
         int a2 = Integer.parseInt(res,2);
// возводим в степень по алгоритму
        BigDecimal m1 = num;
         BigDecimal m2 = new BigDecimal("1");
        for (int j=0; j<8; j++){
            byte y = 0b00000001;
            y &= a2;
            if (y==0b00000001) {
                m2 = m2.multiply(m1);
            }
            m1 = m1.multiply(m1);
            a2 >>= 1;
        }
         return m2;
     }
    public static BigInteger fibonacci(int n){
        BigInteger sum = BigInteger.ZERO;
        BigInteger b1;
        BigInteger b2 = BigInteger.ONE;
        int i = 1;
        do {
            b1 = b2;
            b2 = sum;
            sum = b1.add(b2);
            i++;
        }while (i<=n);

        return sum;
    }

    public static void main(String[] args) {
    BigDecimal num = new BigDecimal("21" );
    BigDecimal a1 = fastPow(num,13);
    BigInteger a2 = fibonacci(7);
        System.out.println("Результат " +a1);
        System.out.println(a2);
    }
}
