package ru.progwards.java1.lessons.classes;

public class Animal {
    public double weight;
    private double FoodCoeff;

    public Animal ( double weight) {
        this.weight = weight;
    }
    public double getWeight(){
        Weight = weight;
        return Weight;
    }
    public AnimalKind getKind() {
        AnimalKind Kind = AnimalKind.ANIMAL;
        return (Kind);
    }
    public FoodKind getFoodKind(){
        FoodKind FoodKind = FoodKind.UNKNOWN;
        return FoodKind;
    }
    public String toString(){
        AnimalKind a1 = AnimalKind();
        FoodKind a2 = FoodKind();
        return ("I am " + a1 + ", eat " +a2);
    }
    public double getFoodCoeff(){
        FoodCoeff = 0.02;
        return FoodCoeff;
    }
}
