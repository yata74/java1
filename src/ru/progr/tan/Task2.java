package ru.progr.tan;

 public class Task2 {
    public static void printJava() {
        String q1 = "Хорошо идут дела";
        String q2 = "Изучаю Java я!";
        String q3 = " ";
        System.out.println(q1);
        System.out.println(q2);
        System.out.print(q1);
        System.out.print(q3);
        System.out.println(q2);
        System.out.println(q2 + q3 + q1);

    }
     public static int subtraction(int x, int y) {
         System.out.print("Вызвана функция subtraction() с параметрами x = ");
         System.out.print(x);
         System.out.println(" и y = " + y);
         return (x-y);

     }
     public static int addition(int x, int y) {
         System.out.print("Вызвана функция addition() с параметрами x = ");
         System.out.print(x);
         System.out.println(" и y = " + y);
         return (x+y);
     }

     public static int multiplication(int x, int y) {
         System.out.print("Вызвана функция multiplication() с параметрами x = ");
         System.out.print(x);
         System.out.println(" и y = " + y);
         return (x*y);
     }

     public static void calculation() {
         int a = 34;
         int b = 55;
         System.out.println("a = " + a);
         System.out.println("b = "+ b);
         int c = addition(a,b);
         System.out.println("a + b = " + c);
         int c1 = subtraction(a,b);
         System.out.println("a - b = "+ c1);
         int c2 = multiplication(a,b);
         System.out.println("a * b = "+ c2);
     }


     public static void main (String[] args) {
        
        printJava();
        subtraction(45, 12);
        subtraction(23, 55);
        addition(128,787);
        addition(528,387);
        multiplication(124,87);
        multiplication(1528,3);
    }
}