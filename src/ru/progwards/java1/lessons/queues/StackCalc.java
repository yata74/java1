package ru.progwards.java1.lessons.queues;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class StackCalc {
    ArrayDeque<Double> stack = new ArrayDeque<>();
   // добавляет последний эл-т в стек
    public void push(double value) {
        stack.offer(value);
    }
    //читает последний эл-нт в стеке
    public double pop(){
            return stack.pollLast();
    }
    //суммируем два последних эл-та
    public void add(){
        push(pop()+pop());
    }
    // из предпоследнего вычитаем последний
    public void sub(){
        double a1 = pop();
        double a2 = pop();
        push(a2-a1);
    }
    //перемножаем два последних эл-та
    public void mul(){
        push(pop()*pop());
    }
    //делим предпоследний эл-т на последний
    public void div() {
        double a1 = pop();
        double a2 = pop();
        try {
            push(a2 / a1);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Деление на 0!");
        }
    }
}
