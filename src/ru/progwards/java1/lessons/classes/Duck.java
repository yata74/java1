package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {

    private double FoodCoeff;

    public Duck(double weight) {
        super(weight);
    }
    @Override
    public AnimalKind getKind(){
        AnimalKind Kind = AnimalKind.DUCK;
        return Kind;
    }
    @Override
    public FoodKind getFoodKind(){
        FoodKind FoodKind = FoodKind.CORN;
        return FoodKind;
    }
    @Override
    public double getFoodCoeff(){
        FoodCoeff = 0.04;
        return FoodCoeff;
}
