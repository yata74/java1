package ru.progwards.java1.lessons.compare_if_cycles;

public class primer {
    static int addAsStrings(int n1,int n2){
        String a = String.valueOf(n1);
        System.out.println(a);
       String str1 = Integer.toString(n1);
        System.out.println(str1);
        String str2 = Integer.toString(n2);
        String str3 = str1 + str2;
        int a1 = Integer.parseInt(str3);
        return a1;
    }
    public static void main(String[] args) {
        System.out.println(addAsStrings(35,49));
    }


}
