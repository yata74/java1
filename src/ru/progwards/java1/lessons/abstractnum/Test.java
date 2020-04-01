package ru.progwards.java1.lessons.abstractnum;

public class Test {
    public static void main(String[] args) {
        Cube c1 = new Cube( new IntNumber(3));
        Cube c2 = new Cube(new DoubleNumber(3));
//        Pyramid p1 = new Pyramid(new IntNumber(3));
//        Pyramid p2 = new Pyramid(new DoubleNumber(3));
        System.out.println("Объем куба в int = "+c1);
        System.out.println("Объем куба в double = "+c2);
//        System.out.println("Объем пирамиды в int = "+p1);
//        System.out.println("Объем пирамиды в double = "+p2);
    }
}
