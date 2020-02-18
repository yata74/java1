package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {

    private double FoodCoeff;

    public Hamster(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        AnimalKind Kind = AnimalKind.HAMSTER;
        return Kind;
    }

    @Override
    public FoodKind getFoodKind() {
        FoodKind FoodKind = FoodKind.CORN;
        return FoodKind;
    }

    @Override
    public double getFoodCoeff() {
        FoodCoeff = 0.03;
        return FoodCoeff;
    }
}
