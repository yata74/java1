package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double a1 = 1.3*3.14*(radius*radius*radius);
        return a1;
    }
    public static float volumeBallFloat(float radius){
        float a2 = 1.3F*3.14F*(radius*radius*radius);
        return a2;
    }
    public static double calculateAccuracy(double radius) {
        double a3 = volumeBallDouble(radius) - volumeBallFloat((float)radius);
        return a3;
    }
    public static void main(String[] args) {
      final float radius = 6371.2F;
       double a4  =  volumeBallDouble (radius);
        System.out.println("a1 = " + a4);
        double a5 = volumeBallFloat(radius);
        System.out.println("a2 = " + a5);
        double a6 = calculateAccuracy(radius);
        System.out.println("a3 = " + a6);
    }
}
