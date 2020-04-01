package ru.progwards.java1.lessons.abstractnum;

public class IntNumber extends Number {
    int num;
    public IntNumber(int num){
        this.num = num;
    }
    @Override
     public Number mul(Number num){
        return new IntNumber(this.num*(((IntNumber)num).num));
    }
    @Override
     public Number div(Number num){
        return new IntNumber(this.num/(((IntNumber)num).num));
 }
    @Override
     public Number newNumber(String strNum){
       int a1=  Integer.parseInt(strNum);
       return new IntNumber(a1);
}
    @Override
    public String toString(){
        return String.valueOf(num);
    }

}
