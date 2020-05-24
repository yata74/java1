//package ru.progwards.java1.lessons.test;
//
//import java.util.Iterator;
//
//public class Test132 {
//}
//
//
//class Square extends Test132 {
//    private double side;
//    public Square(double side) {
//        this.side = side;
//    }
//    public double getSide() {
//        return side;
//    }
//}
//
//class Round extends Test132 {
//    private double diameter;
//
//    public Round(double diameter) {
//        this.diameter = diameter;
//    }
//    public double getDiameter() {
//        return diameter;
//    }
//}
//
//    String figDetect(Test132 fig){
//    if (fig instanceof Square){
//        return ("Сторона квадрата"+ ((Square) fig).getSide());
//    }if (fig instanceof Round){
//        return ("Диаметр круга" + ((Round) fig).diameter);
//        }
//    return ("Неизвестная фигура.");
//    }
//}
//Test 13.3
//public TreeSet<User> createSet(){
//        TreeSet<User> spi = new TreeSet<>(new Comparator<User>(){
//@Override
//public int compare (User o1, User o2) {
//        int ret=0;
//        if(o1.id > o2.id)
//        ret= -1;
//        else if (o1.id == o2.id)
//        ret= 0;
//        else if (o1.id < o2.id)
//        ret= 1;
//        return ret;
//        }
//        });
//
//        return spi;
//        }
