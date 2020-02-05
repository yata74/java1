package ru.progr.tan;

public class Hello {
    static void println(String str) {

    }
    static int addition (int x, int y) {
        return x + y;

    }
    static String str = "Запись фильма " + '"' + "Матрица" + '"' + " находится в файле C:\\video\\matrix.avi" ;



    public static void main (String[] args) {
       println("Всем привет!");
       println("Я умею считать.");
       System.out.print("Я знаю 5 + 7 = ");
       System.out.println(addition(5, 7));
        System.out.println(str);
        System.out.println(str);
    }


}
