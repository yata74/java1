package ru.progwards.java1.lessons.bigints;

public class IntInteger extends AbsInteger {
    private int num;

    public IntInteger(int num) {
        this.num = num;
    }
    @Override
    public int value() {

        return num;
    }

    public String toString(){
        return ("Результат типа int = " + num);

    }
}
