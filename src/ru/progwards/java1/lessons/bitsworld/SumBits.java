package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){
        int sum = 0;
        while (value != 0b00000000){
            byte x = 0b00000001;
            x = (byte) (value & x);
            if (x == 0b00000001) {
                sum = sum + 1;
            }
             value = (byte) (value >>> 1);
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = sumBits((byte) 0b011111);
        System.out.println(a);
    }
}
