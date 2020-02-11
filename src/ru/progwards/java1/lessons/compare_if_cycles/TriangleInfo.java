package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c) {
        boolean result = a < (b + c) && b < (a + c) && c < (b + a);
        return result;
    }
    public static boolean isRightTriangle(int a, int b, int c){
        boolean result = (a*a)==(b*b)+(c*c) || (b*b)==(c*c)+(a*a) || (c*c) == (b*b)+(a*a);
        return result;
    }
    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean result = a==b || a==c || b==c;
        return result;
    }
    public static void main(String[] args) {
        boolean a1 = isTriangle(3,4,5);
        System.out.println(a1);
        boolean a2 = isRightTriangle(12,13,5);
        System.out.println(a2);
        boolean a3 = isIsoscelesTriangle(5,5,4);
        System.out.println(a3);
    }
}