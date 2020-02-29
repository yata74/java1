package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    private int[] mass= new int[] {};

    public DIntArray() {
    }

    public void add(int num) {
        int[] mass1 = new int[mass.length + 1];
        for (int i = 0; i < mass.length; i++) {
            mass1[i] = mass[i];
        }
        mass1[mass1.length - 1] = num;
        mass = Arrays.copyOf(mass1,mass1.length);
        System.out.println(Arrays.toString(mass));
    }

    public void atInsert(int pos, int num) {
        int[] mass2 = new int[mass.length + 1];
        for (int i = 0; i < mass2.length; i++) {
            if (i < pos) {
                mass2[i] = mass[i];
            } else if (i == pos) {
                mass2[i] = num;
            } else mass2[i] = mass[i - 1];
        }
        mass = Arrays.copyOf(mass2,mass2.length);
        System.out.println(Arrays.toString(mass));

    }

    public void atDelete(int pos) {
        int[] mass3 = new int[mass.length - 1];
        for (int i = 0; i < mass3.length; i++) {
            if (i < pos) {
                mass3[i] = mass[i];
            } else mass3[i] = mass[i + 1];
        }
        mass = Arrays.copyOf(mass3,mass3.length);
        System.out.println(Arrays.toString(mass));
    }

    public int at(int pos) {
        int res = mass[pos];
        return res;
    }


    public static void main(String[] args){
        DIntArray mass = new  DIntArray();
        mass.add(5);
        mass.add(51);
        mass.add(2);
        mass.add(6);
        mass.add(11);
        mass.atInsert(3,8);
        mass.atDelete(3);
        int a= mass.at(3);
        System.out.println("на позиции 3 число "+ a);
    }

}