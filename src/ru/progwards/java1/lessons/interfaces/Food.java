package ru.progwards.java1.lessons.interfaces;

import java.util.Arrays;

public class Food implements  CompareWeight{
    private int weight;

    public Food(int weight) {
        this.weight = weight;
    }

    // возвращаем вес еды
    public double getWeight() {
        return weight;
    }

    public String toString(){
        return ("Вес "+ getWeight());
    }
//сравнить вес еды
//    @Override
//    public CompareResult compareWeight(CompareWeight smthHasWeigt){
//        Food food = (Food)smthHasWeigt;
//        double a1 = Double.compare(this.weight,food.getWeight());
//        if (a1<0){ return CompareWeight.CompareResult.LESS; }
//        if (a1==0){return CompareWeight.CompareResult.EQUAL;}
//        else return CompareWeight.CompareResult.GREATER;
//    }

    public static void main(String[] args) {
        Food food1 = new Food(140);
        Food food2 = new Food(250);
        Food food3 = new Food(170);
        Food food4 = new Food(100);
        Food food5 = new Food(340);
        System.out.println(food1.compareWeight(food2));
        CompareWeight[] a = {food1,food2,food3,food4,food5};
        CompareWeight.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
