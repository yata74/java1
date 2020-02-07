package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double b2 = radius*radius*radius;
        double b1 = b2*3.14;
        double b3 = b1* 4;
        double a1 = b3/3;
        return a1;
    }
    public static float volumeBallFloat(float radius){
        float c2 = radius * radius * radius;
        float c1 = 3.14F * c2;
        float c3 = 4F * c1;
        float a2 = c3/3F;
        return a2;
    }
    public static double calculateAccuracy(double radius) {
        double a3 = volumeBallDouble(radius) - volumeBallFloat((float)radius);
        return a3;
    }
    public static void main(String[] args) {
      final double radius = 6371.2;
       double a4  =  volumeBallDouble (radius);
        System.out.println("a1 = " + a4);
        double a5 = volumeBallFloat((float)radius);
        System.out.println("a2 = " + a5);
        double a6 = calculateAccuracy(radius);
        System.out.println("a3 = " + a6);
    }
}
