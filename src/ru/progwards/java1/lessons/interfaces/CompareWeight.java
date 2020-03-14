package ru.progwards.java1.lessons.interfaces;


public interface CompareWeight {
    enum CompareResult{
        LESS,
        EQUAL,
        GREATER
    }

    public double getWeight();
    //Сравнение веса
    default public CompareResult compareWeight(CompareWeight smthHasWeigt){

        double a1 = Double.compare(getWeight(),smthHasWeigt.getWeight());
        if (a1<0){ return CompareResult.LESS; }
        if (a1==0){return CompareResult.EQUAL;}
        else return CompareResult.GREATER;
    }
    public static void sort(CompareWeight[] a){
            for (int i=0; i<a.length; i++){
                for (int j=i; j<a.length; j++){
                    if (a[i].compareWeight(a[j])==CompareResult.GREATER)  {
                        CompareWeight b = a[i];
                        a[i] = a[j];
                        a[j]= b;
                    }
                }
            }
        }


}
