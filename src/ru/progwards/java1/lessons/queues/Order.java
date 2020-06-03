package ru.progwards.java1.lessons.queues;

public class Order {
    private double sum;
    private int num;
    static int sch;
    public Order(double sum){
        this.sum=sum;
        sch++;
        num = sch;
    }

    @Override
    public String toString() {
        return ("Заказ №"+getNum()+" на сумму: "+getSum());
    }

    public double getSum() {
        return sum;
    }

    public int getNum() {
        return num;
    }

}
