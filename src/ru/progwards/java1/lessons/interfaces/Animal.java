package ru.progwards.java1.lessons.interfaces;


import java.util.Arrays;
import java.util.Objects;

public class Animal implements FoodCompare, CompareWeight {

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
    // Сравниваем животных одного вида по весу.
    @Override
    public boolean equals(Object anObject){
        if (this == anObject)
            return true;

        if (anObject == null || getClass() != anObject.getClass())
            return false;

        Animal obj = (Animal) anObject;

        return Double.compare(obj.getWeight(), this.getWeight()) == 0;

    }
    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    // определяем цену 1 кг. еды
    public double getFood1kgPrice(){
        switch  (getFoodKind()) {
            case HAY: return 20;
            case CORN: return 50;
            default:  return 0;
        }
    }
    //Цена еды для данного животного
    public double getFoodPrice(){
        return (calculateFoodWeight() * getFood1kgPrice());
    }
    //Сравнение цен на еду у разных животных
    @Override
    public int compareFoodPrice(Animal animal){
        return (Double.compare(this.getFoodPrice(),animal.getFoodPrice()));
    }

    //Сравнение веса

//    @Override
//    public CompareResult compareWeight(CompareWeight smthHasWeigt){
//
//          Animal ani = (Animal) smthHasWeigt;
//        double a1 = Double.compare(this.weight,ani.getWeight());
//        if (a1<0){ return CompareResult.LESS; }
//        if (a1==0){return CompareResult.EQUAL;}
//        else return CompareResult.GREATER;
//    }

//    public static void sort(CompareWeight[] a){
//            for (int i=0; i<a.length; i++){
//                for (int j=i; j<a.length; j++){
//                    if (a[i].compareWeight(a[j])==CompareResult.GREATER)  {
//                        CompareWeight b = a[i];
//                        a[i] = a[j];
//                        a[j]= b;
//                    }
//                }
//            }
//        }




    public static void main(String[] args) {
        Cow cow1 = new Cow(14);
        Cow cow2 = new Cow(14);
        Hamster hamster1 = new Hamster(14);
        Hamster hamster2 = new Hamster(2);
        Duck duck1 = new Duck(3);
        Duck duck2 = new Duck(5);
        CompareWeight[] a = {cow1,cow2,hamster1,hamster2,duck1,duck2};
        System.out.println(cow1.equals(cow2));
        System.out.println(cow1.toStringFull());
        System.out.println(cow2.toStringFull());
        System.out.println(hamster1.equals(cow2));
        System.out.println(hamster1.toStringFull());
        System.out.println(hamster2.toStringFull());
        System.out.println(cow1.compareFoodPrice(hamster1));
        System.out.println(cow1.compareWeight(hamster2));
        CompareWeight.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
