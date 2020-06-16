package ru.progwards.java1.lessons.maps;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class FiboMapCache {

    private Map<Integer, BigDecimal> fiboCache;
    private boolean cacheOn;
    public FiboMapCache(boolean cacheOn) {
        this.cacheOn = cacheOn;
        if (cacheOn == true) {
            fiboCache = new HashMap<>();
        }
    }

    public static BigDecimal fibonacci(int n){
        BigDecimal sum = BigDecimal.ZERO;
        BigDecimal b1;
        BigDecimal b2 = BigDecimal.ONE;
        int i = 1;
        do {
            b1 = b2;
            b2 = sum;
            sum = b1.add(b2);
            i++;
        }while (i<=n);

        return sum;
    }

    public  BigDecimal fiboNumber(int n){
        if (cacheOn ==true){
            if (fiboCache.containsKey(n)){
                return fiboCache.get(n);
            }
            BigDecimal a = fibonacci(n);
            fiboCache.put(n,a);
            return a;
        }
        BigDecimal a = fibonacci(n);
        return a;
    }
//    очищаем кэш
    public void clearCahe(){
        if (cacheOn==true) {
            fiboCache.clear();
        }
        fiboCache=null;
        cacheOn=false;
    }
    public static void test(){
        var startTime = new Date().getTime();
        FiboMapCache obj = new FiboMapCache(true);
        for (int i=1; i<=1000;i++){
            obj.fiboNumber(i);
        }
        System.out.println("fiboNumber cacheOn=true время выполнения: "+(new Date().getTime() - startTime));
        var startTime1 = new Date().getTime();
        FiboMapCache obj1 =new FiboMapCache(false);
        for (int i=1; i<=1000;i++){
            obj1.fiboNumber(i);
        }
        System.out.println("fiboNumber cacheOn=false время выполнения: "+(new Date().getTime() - startTime1));
        }

    public static void main(String[] args) {
        test();
    }
    }
