package ru.progwards.java1.lessons.abstractnum;

public class DoubleNumber extends Number {
    double num;
    public DoubleNumber(double num){
        this.num = num;
    }

    @Override
    public Number mul(Number num){
        return new DoubleNumber(this.num*((DoubleNumber)num).num);
    }
    @Override
    public Number div(Number num){
        return new DoubleNumber(this.num/((DoubleNumber)num).num);
    }
    @Override
    public Number newNumber(String strNum){
        double a1=  Double.parseDouble(strNum);
        return new DoubleNumber(a1);
    }
    @Override
    public String toString(){
        return String.valueOf(num);
    }
}
