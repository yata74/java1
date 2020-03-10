package ru.progwards.java1.lessons.interfaces;

public class Hamster extends Animal {

private double FoodCoeff;

public Hamster(double weight) {
        super(weight);
        }

@Override
public AnimalKind getKind() {
        return AnimalKind.HAMSTER;
        }

@Override
public FoodKind getFoodKind() {
        return FoodKind.CORN;
        }

@Override
public double getFoodCoeff() {
        FoodCoeff = 0.03;
        return FoodCoeff;
        }
        }