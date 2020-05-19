package ru.progwards.java1.lessons.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {

    private T[] array;//массив
    private T next; //элемент массива
    int num = 0; //индекс элемента

    ArrayIterator(T[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        if (num < array.length) {
            return true;
        }
        return false;
    }

    @Override
    public T next() {
        if (num >= array.length) { //если перебрали все элементы, то бросить исключение
            throw new NoSuchElementException();
        }
            next = array[num];
            num += 1;
            return next;
    }
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3};
        Iterator<Integer> iterator = new ArrayIterator<>(array1);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}