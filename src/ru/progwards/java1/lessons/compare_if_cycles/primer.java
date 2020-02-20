package ru.progwards.java1.lessons.compare_if_cycles;

public class primer {
    public static void main(String[] args) {

        Type[] types = Type.values();
        for (Type s : types) { System.out.println(s); }
    }
}
enum Type
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}
