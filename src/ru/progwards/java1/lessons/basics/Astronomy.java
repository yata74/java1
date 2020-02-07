package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare(Double r){
     Double s = 4*3.14*(r*r);
     return s;
    }
    public static Double earthSquare(){
        Double a1 = sphereSquare(6371.2);       //a1 - площадь поверхности земли
        return a1;
    }
    public static Double mercurySquare(){
        Double a2 = sphereSquare(2438.7);       //a2 - площадь поверхности марса
        return a2;
    }
    public static Double jupiterSquare() {
        Double a3 = sphereSquare(71492.0);      //a3 - площадь поверхности юпитера
        return a3;
    }
    public static Double earthVsMercury() {
        Double a1a2 = earthSquare()/mercurySquare();
        return a1a2;
    }
    public static Double earthVsJupiter() {
        Double a1a3 = earthSquare()/jupiterSquare();
        return a1a3;
    }
    public static void main(String[] args) {
        double a4 = earthSquare();
        System.out.println("a1 = " + a4);
        double a5 = mercurySquare();
        System.out.println("a2 = " + a5);
        double a6 = jupiterSquare();
        System.out.println("a3 = " + a6);
        double a7 = earthVsMercury();
        System.out.println("a1a2 = " + a7);
        double a8 = earthVsJupiter();
        System.out.println("a1a3 = " + a8);

    }
}
