package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger {

  public byte num;

    public ByteInteger(byte num){
     this.num = num;
    }
    @Override
    public int value() {
        int a1 = num;
        return a1;
    }

    public String toString(){
        return ("Результат типа byte = "+ num);

    }
}
