package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value) {
        int sum = 0;
        if (value <0) {
            sum = 1;
            value &= 0b01111111;
        }
        while (value != 0) {
            byte x;
            x = (byte) (value & 1);
            if (x == 0b00000001) {
                sum = sum + 1;
            }
                value >>>= 1;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = sumBits((byte) 0b10011111);
        System.out.println(a);
    }
}
