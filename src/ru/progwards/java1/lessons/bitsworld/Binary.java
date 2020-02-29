package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    private static byte num;

    public Binary(byte num){
        this.num = num;
    }
    public  String toString(){
        System.out.println(Integer.toBinaryString(Binary.num));
        return Integer.toBinaryString(Binary.num);
    }
    public static void main(String[] args) {
        Binary bin = new Binary((byte) 5);
        String str =  bin.toString();
        System.out.println(str);
    }
}

