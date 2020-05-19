package ru.progwards.java1.lessons.collections;

import java.util.*;

public class MatrixIterator<T> implements Iterator<T> {

    private T[][] array;//массив
    private T next; //элемент массива
    int num = 0; //порядковый номер элемента
    int col; //кол-во элементов в матрице
    int x=0;// строка
    int y=0;// столбец

    MatrixIterator(T[][] array) {
        this.array = array;
        this.col = countElements(array);

    }

    private int countElements(T[][] matrix) {  //считаем количество элементов в матрице
        int count = 0;
        for (T[] row : matrix) {
            count += row.length;
        }
        return count;
    }


    @Override
    public boolean hasNext() {
        if (num < col) {
            return true;
        }
            return false;
        }


    @Override
    public T next() {
        if (num >= col) { //если перебрали все элементы, то бросить исключение
            throw new NoSuchElementException();
        }

        next = array[x][y];
        num += 1;
        y+=1;
        while (x<array.length && y>=array[x].length){
            y=0;
            x+=1;
        }
        return next;
    }
    public static void main(String[] args) {
        Integer[][] array1 = {{1, 2, 3},{3,4,5,6}};
        Iterator<Integer> iterator = new MatrixIterator<>(array1);
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}


