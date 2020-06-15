package ru.progwards.java1.lessons.maps;

import java.io.FileReader;
import java.util.*;

public class SalesInfo {
    List<String> list = new ArrayList<>();


    public boolean proverka(String a, String b) {
        try {
            Integer d =Integer.valueOf(a);
            Double h =Double.valueOf(b);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public int loadOrders(String fileName) throws Exception {
        FileReader file1 = new FileReader(fileName);//открываем файл для чтения
        Scanner scanner = new Scanner(file1);
        int sch = 0; // счетчик  строк.
        try {
            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                String[] mass = str.split("\\s*,\\s*");
                if (mass.length == 4) {
                    if (proverka(mass[2], mass[3])) {

                        for (int j = 0; j < 4; j++) {
                            list.add(mass[j]);
                        }
                        sch++;
                    }
                }
            }

        } finally {
            file1.close();
        }
            return sch;
        }


    public Map<String, Double> getGoods() {
        TreeMap<String, Double> map = new TreeMap<>(); //товар и все деньги,что за него заплатили
        Double summa;
        for (int i = 1; i < list.size();) {
            if (list.get(i) != " ") {
                int z = i+2;
                summa = Double.valueOf(list.get(z));
                for (int j = i + 4; j < list.size();) {
                    if (list.get(i).equals(list.get(j))) {
                        list.set(j," ");
                        summa += Double.valueOf(list.get(j+2));
                    }
                    j=j+4;
                }
                map.put(list.get(i), summa);
            }
            i=i+4;
        }

        return map;
    }

    public Map<String, AbstractMap.SimpleEntry<Double, Integer>> getCustomers() {

        TreeMap<String, AbstractMap.SimpleEntry<Double, Integer>> map = new TreeMap<>(); //список покупателей и мар
        Double sum;
        Integer col;
        for (int i = 0; i < list.size();) {
            if (list.get(i) != " ") {
                sum = Double.valueOf(list.get(i+3));
                col = Integer.valueOf(list.get(i+2));
                for (int j = i + 4; j < list.size();) {
                    if (list.get(i).equals(list.get(j))) {
                        list.set(j," ");
                        sum = sum+Double.valueOf(list.get(j+3));
                        col = col+Integer.valueOf(list.get(j+2));
                    }
                    j=j+4;
                }
                AbstractMap.SimpleEntry<Double, Integer> ent = new AbstractMap.SimpleEntry<>(sum, col);
                map.put(list.get(i), ent);
            }
            i=i+4;
        }
        return map;
    }

    public static void main(String[] args) {
        SalesInfo obj = new SalesInfo();
        try{
            System.out.println(obj.loadOrders("text1.txt"));
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Товар и сумма продаж");
        for(Map.Entry<String, Double> entry : obj.getGoods().entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        System.out.println("ФИО, сумма и количество покупок");
        for(Map.Entry<String, AbstractMap.SimpleEntry<Double, Integer>> entry : obj.getCustomers().entrySet())
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}