package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DintArray {
    private int[] mass;

    public DintArray() {
    }

    public void add(int num) {
        int[] mass1 = new int[mass.length + 1];
        for (int i = 0; i < mass.length; i++) {
            mass1[i] = mass[i];
        }
        mass1[mass1.length - 1] = num;
        System.out.println(Arrays.toString(mass1));
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
        System.out.println("mass2" + Arrays.toString(mass2));

    }

    public void atDelete(int pos) {
        int[] mass3 = new int[mass.length - 1];
        for (int i = 0; i < mass3.length; i++) {
            if (i < pos) {
                mass3[i] = mass[i];
            } else mass3[i] = mass[i + 1];
        }
        System.out.println(Arrays.toString(mass3));
    }

    public int at(int pos) {
        int res = mass[pos];
        return res;
    }


    public static void main(String[] args){
        DintArray mass4 = new  DintArray();
        mass4.mass = new int[]{3, 6, 7,9,1};
        mass4.add(5);
        mass4.atInsert(3,8);
        mass4.atDelete(2);
        int a= mass4.at(3);
        System.out.println("на позиции 3 число "+ a);
    }

}