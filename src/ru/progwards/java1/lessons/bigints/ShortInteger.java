package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger {

    private short num;

    public ShortInteger(short num) {
        this.num = num;
    }

    @Override
    public int value() {
        int a1 = num;
        return a1;
    }

    public String toString() {
        return ("Результат типа short = " + num);

    }
}