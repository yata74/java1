package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
            if (a >= b && a >= c)
                return a;
            else if (b >= c)
                return b;
            else
                return c;
        }

    public static int minSide(int a, int b, int c) {
        if (a==b) {
            if (a < c) {
                System.out.print("Меньшие стороны а и b равные ");
                return a;
            } else if (b==c) {
                System.out.print(" Треугольник равносторонний со стороной равной ");
                return a;
            }else System.out.print("Самая маленькая сторона c = ");
                return c;

        } else if (b==c){
            if (a<b){
                System.out.print("Самая маленькая сторона a = ");
                return a;
            }else {System.out.print("Маленькие стороны b и c равные ");
                return b;
            }
        }
        if (a<b) {
            if (a<c) {
                System.out.print("Самая маленькая сторона а = ");
                return a;
            }else {
                System.out.print("Самая маленькая сторона c = ");
                return c;
            }
        }else if (b<c) {
            System.out.print("Самая маленькая сторона b = ");
            return b;
        }   else {
            System.out.print("Самая маленькая сторона c = ");
            return c;
        }
    }
    public static boolean isEquilateralTriangle(int a, int b, int c){
        boolean result = a==b && a==c;
        return result;
    }

    public static void main(String[] args) {
        int a1 = maxSide(5, 3,5);
        System.out.println(a1);
        int a2 = minSide(3,5,3);
        System.out.println(a2);
        boolean a3 = isEquilateralTriangle(6,6,5);
        System.out.println(a3);
    }
}
