package ru.progwards.java1.lessons.queues;

import java.util.*;

public class CollectionsSort {
    // сортируем коллекцию без спец.методов
    public static void mySort(Collection<Integer> data) {
        Integer res;
        List<Integer> coll = new ArrayList<>(data);
        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = i + 1; j < data.size(); j++) {
                if (coll.get(i) > coll.get(j)) {
                    res = coll.get((i));
                    coll.set(i, coll.get(j));
                    coll.set(j, res);
                }
            }
        }
        data.clear();
        data.addAll(coll);
    }

    // сортируем коллекцию по поиску мин. элемента
    public static void minSort(Collection<Integer> data) {
        List<Integer> coll1 = new ArrayList<>();
        Integer result;
        while (!data.isEmpty()) {
            result = Collections.min(data);
            data.remove(Collections.min(data));
            coll1.add(result);
        }
        data.clear();
        data.addAll(coll1);
    }

    // сортируем кол-цию с помощью Collections.sort
    static void collSort(Collection<Integer> data) {
        List<Integer> coll2 = new ArrayList<>(data);
        Collections.sort(coll2);
        data.clear();
        data.addAll(coll2);
    }

    public static Collection<String> compareSort() {
        //чтобы создать объект
        class Metod {
            String name;
            int resTime;

            public Metod(String name, int resTime) {
                this.name = name;
                this.resTime = resTime;
            }

            @Override
            public String toString() {
                return "Metod{" +
                        "name='" + name + '\'' +
                        ", resTime=" + resTime +
                        '}';
            }
        }
        TreeSet<Metod> resultat = new TreeSet<>(new Comparator<Metod>() {
            @Override
            public int compare(Metod o1, Metod o2) {
                int ret=0;
                if(o1.resTime > o2.resTime)
                ret= 1;
                else if (o1.resTime == o2.resTime){
                  ret = o1.name.compareTo(o2.name);
                }
                else if (o1.resTime < o2.resTime)
                ret=-1;
                return ret;
                }
        });
        var startTime = new Date().getTime();
        //коллекция для проврки методов
        List<Integer> proba = new ArrayList();
        for (int i = 0; i < 500; i++) {
            proba.add(i);
        }

        // создаем объект для метода mySort
        Collections.shuffle(proba);
        int time = 0;
        startTime = new Date().getTime();
        mySort(proba);
        time = (int) (new Date().getTime() - startTime);
        resultat.add(new Metod("mySort", time));
        //создаем объект для метода
        Collections.shuffle(proba);
        startTime = new Date().getTime();
        minSort(proba);
        time = (int) (new Date().getTime() - startTime);
        resultat.add(new Metod("minSort", time));
        // создаем объект для метода
        Collections.shuffle(proba);
        startTime = new Date().getTime();
        collSort(proba);
        time = (int) (new Date().getTime() - startTime);
        resultat.add(new Metod("collSort", time));
        List<String> coll3 = new ArrayList<>();
        for (Metod i: resultat){
            coll3.add(i.name);
        }
        return coll3;
    }
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(7);
        num.add(5);
        num.add(1);
        num.add(6);
        num.add(3);
        num.add(4);
        num.add(2);
        num.add(9);
        num.add(10);
        num.add(8);
       // mySort(num);
        //minSort(num);
        //collSort(num);
        System.out.println(num);
        System.out.println(compareSort());
    }
}
