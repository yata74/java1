package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a, b;
    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        String str1 = String.valueOf(a);

        return str1 + "+" + b + "i";
    }

    public ComplexNum add(ComplexNum num){
        ComplexNum result = new ComplexNum(this.a+num.a, this.b + num.b);
        return result;
    }
    public ComplexNum sub(ComplexNum num){
        ComplexNum result = new ComplexNum(a - num.a, b - num.b);
        return result;
    }
    public ComplexNum mul(ComplexNum num){
        ComplexNum result  = new ComplexNum(a*num.a-b*num.b, b*num.a+a*num.b);
        return result;
    }
    public ComplexNum div(ComplexNum num){
        ComplexNum result = new ComplexNum((a*num.a+b*num.b)/(num.a*num.a+num.b*num.b),
                (b*num.a-a*num.b)/num.a*num.a+num.b*num.b);
        return result;
    }

    public static void main(String[] args) {
        ComplexNum c1 = new ComplexNum(3,4);
        ComplexNum c2 = new ComplexNum(5,6);
        System.out.println(c1);
        System.out.println(c2);
        ComplexNum c3 = c1.add(c2);
        System.out.println(c3);
        ComplexNum c4 = c1.sub(c2);
        System.out.println(c4);
        ComplexNum c5 = c1.mul(c2);
        System.out.println(c5);
        ComplexNum c6 = c1.div(c2);
        System.out.println(c6);
    }
}

