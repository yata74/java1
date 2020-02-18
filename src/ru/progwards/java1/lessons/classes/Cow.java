package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {

    private double FoodCoeff;

    public Cow(double weight) {
        super(weight);
    }

    @Override
    public AnimalKind getKind() {
        AnimalKind Kind = AnimalKind.COW;
        return (Kind);
    }

    @Override
    public FoodKind getFoodKind() {
        FoodKind FoodKind = FoodKind.HAY;
        return FoodKind;
    }
    @Override
    public double getFoodCoeff(){
        FoodCoeff = 0.05;
        return FoodCoeff;
}