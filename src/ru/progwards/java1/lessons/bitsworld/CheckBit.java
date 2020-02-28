package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static int checkBit(byte value, int bitNumber){
        for (int i=0; i<bitNumber; i++){
            value >>= 1;
        }
        byte x = 0b00000001;
        x &= value;
        if (x == 0b00000001) {
            return 1;
        }return 0;
    }
    public static void main(String[] args) {
        System.out.println(checkBit((byte) 0b01110111,5));
    }
}
