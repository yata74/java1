package ru.progwards.java1.lessons.io2;

import java.util.Arrays;

public class PhoneNumber {
    // возвращаю номер в формате
    public static String format(String phone) throws Exception{
        try {
            return ("+7(" + phone.substring(0, 3) + ")" + phone.substring(3, 6) + "-" + phone.substring(6, 8) + phone.substring(8));
        }catch (Exception e){
            return ("Неправильно набран номер");
        }
    }
    //возвращаю только цифры
    public static String cifry(String numer) {
        String num = "";
        char [] cifra = numer.toCharArray();
        for (int i=0; i< cifra.length; i++ ) {
            if (Character.isDigit(cifra[i])) {
                num += cifra[i];
            }
        }
        return num;
    }
    //возвращаю 10 значащих цифр
    public static String desyatoc(String cif) {
        String res ="";
        char [] mass =cif.toCharArray();
        if (mass[0]=='8'||mass[0]=='7'){
            for (int i=1;i<mass.length;i++){
                res += mass[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        try {
            System.out.println(format(desyatoc(cifry("7(458)394-72-96"))));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
