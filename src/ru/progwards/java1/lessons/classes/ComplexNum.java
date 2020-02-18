package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a, b;
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        String str1 = String.valueOf(a);
        String str2 = String.valueOf(b);
        return (str1 + "+" + str2 + "i");
    }
    public ComplexNum add(ComplexNum num){
        
    }
}
