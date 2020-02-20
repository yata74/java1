package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {

    private double FoodCoeff;

    public Cow(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        return AnimalKind.COW;
    }

    @Override
    public FoodKind getFoodKind() {
        return FoodKind.HAY;
    }

    @Override
    public double getFoodCoeff() {
        FoodCoeff = 0.05;
        return FoodCoeff;
    }
}