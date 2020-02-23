package ru.progwards.java1.lessons.classes;

public class Rectangle {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {

        return a*b;
    }
    public int compareTo(Rectangle anRectangle){
         Double pl1 = area();
         Double pl2 = anRectangle.area();
         int r1 = pl1.compareTo(pl2);
        return  r1;
    }
    public static void main(String[] args) {
        Rectangle c1 = new Rectangle(2,2);
        Rectangle c2 = new Rectangle(1,1);
        Rectangle c3 = new Rectangle(2,3);
        Rectangle c4 = new Rectangle(3,2);
        Rectangle c5 = new Rectangle(2,2);
        Rectangle c6 = new Rectangle(3,3);
        int r2 = c1.compareTo(c2);
        System.out.println(r2);
        int r3 = c3.compareTo(c4);
        System.out.println(r3);
        int r4 = c5.compareTo(c6);
        System.out.println(r4);
    }



}

