package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static int sumBits(byte value){
        int sum = 0;
        while (value != 0b00000000){
            byte x = 0b00000001;
            x &= value;
            if (x == 0b00000001) {
                sum = sum + 1;
            }
             value >>>= 1;
        }
        return sum;
    }
    public static void main(String[] args) {
        int a = sumBits((byte) 0b010011);
        System.out.println(a);
    }
}