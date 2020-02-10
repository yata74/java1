package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
        if (a==b) {
            if (a > c) {
                System.out.print("Большие стороны а и b равные ");
                return a;
            } else {
                System.out.print("Самая большая сторона c = ");
                return c;
            }
        } else if (b==c){
                if (a>b){
                    System.out.print("Самая большая сторона b = ");
                    return b;
                }else {System.out.print("Большие стороны b и c равные ");
                       return b;
            }
        }
        if (a>b) {
            if (a>c) {
                System.out.print("Самая большая сторона а = ");
                return a;
            }else {
                System.out.print("Самая большая сторона c = ");
                return c;
            }
        }else if (b>c) {
            System.out.print("Самая большая сторона b = ");
            return b;
        }   else {
            System.out.print("Самая большая сторона c = ");
            return c;
        }
    }

    public static void main(String[] args) {
        int a1 = maxSide(3, 3,2);
        System.out.println(a1);
    }
}
