package ru.progwards.java1.lessons.bigints;

import java.math.BigInteger;
import java.util.Arrays;

public class ArrayInteger {
    byte[] digits;

    public ArrayInteger(int n) {
        this.digits = new byte[n];
    }
  //  из BigInteger в массив по байтово
    void fromInt(BigInteger value) {
        int j = 10;
        for (int i = 1; !value.equals(BigInteger.ZERO); i++) {
            BigInteger a1 = value.remainder(BigInteger.valueOf(j));
            Byte ost =  a1.byteValue();
           value = (value.subtract(BigInteger.valueOf(ost)).divide(BigInteger.valueOf(j)));
            byte a3 = ost;
            this.digits[i - 1] = a3;
        }
    }
   // из массива в BigInteger
       public  BigInteger toInt() {
        String res = "";
        for (int i =0; i<digits.length; i++) {
            res = String.valueOf(this.digits[i]) + res;
        }
        BigInteger value = new BigInteger(res);
        return value;
        }
        //сумма двух массивов
    boolean add(ArrayInteger num) {
        int z = 0;
        if (this.digits.length < num.digits.length) {
            Arrays.fill(digits, (byte) 0);
            return false;
        } else {
            num.digits = Arrays.copyOf(num.digits,this.digits.length);
            int j = 0;
            for (int i = 0; i < this.digits.length; i++) {
                byte result = (byte) (this.digits[i] + num.digits[i] + (byte) j);
                if (result > 9) {
                    j = 1;
                    result = (byte) (result - 10);
                } else {
                    j = 0;
                }
                digits[i] = result;
                System.out.println(result);
            }
            if (j == 1) {
                Arrays.fill(digits, (byte) 0);
                return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        ArrayInteger mas1 = new ArrayInteger(7);
        BigInteger a1 = new BigInteger("5523836");
        mas1.fromInt(a1);
        BigInteger a2 = mas1.toInt();
        System.out.println(a2);
        ArrayInteger mas2 = new ArrayInteger(25);
        BigInteger a4 = new BigInteger("9223372036854775807172898");
        mas2.fromInt(a4);
        BigInteger a6 = mas2.toInt();
        System.out.println(a6);
        boolean a5 = mas1.add(mas2);
        System.out.println(a5);
    }
}

