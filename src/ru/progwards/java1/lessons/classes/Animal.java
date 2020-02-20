package ru.progwards.java1.lessons.classes;

public class Animal {

    public enum FoodKind {
        UNKNOWN,
        HAY,
        CORN
    }
    public enum AnimalKind {
        ANIMAL,
        COW,
        HAMSTER,
        DUCK
    }

    public double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    // возвращаем массу животного
    public double getWeight() {
        return weight;
    }

    // возвращаем название животного
    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    // возвращаем вид корма
    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    // печать представления
    public String toString() {
        return ("I am " + getKind() + ", eat " +  getFoodKind());
    }


    // возвращаем коэффициент
    public double getFoodCoeff() {
        double FoodCoeff = 0.02;
        return FoodCoeff;
    }

    // рассчитываем вес еды
    public double calculateFoodWeight() {
        double FoodWeight = getWeight() * getFoodCoeff();
        return FoodWeight;
    }

    public String toStringFull() {
        return ("I am " + getKind() + ", eat " +  getFoodKind() + " " + calculateFoodWeight());

    }

    public static void main(String[] args) {
        Cow cow1 = new Cow(12);
        Cow cow2 = new Cow(14);
        System.out.println(cow1);
        System.out.println(cow1.toStringFull());
        System.out.println(cow2);
        System.out.println(cow2.toStringFull());
        Hamster hamster1 = new Hamster(0.5);
        Hamster hamster2 = new Hamster(0.7);
        System.out.println(hamster1);
        System.out.println(hamster1.toStringFull());
        System.out.println(hamster2);
        System.out.println(hamster2.toStringFull());
        Duck duck1 = new Duck(2.0);
        Duck duck2 = new Duck(1.5);
        System.out.println(duck1);
        System.out.println(duck1.toStringFull());
        System.out.println(duck2);
        System.out.println(duck2.toStringFull());
    }

}
