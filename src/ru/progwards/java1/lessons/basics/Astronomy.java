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
        earthSquare();
        mercurySquare();
        jupiterSquare();
        earthVsMercury();
        earthVsJupiter();

    }
}
