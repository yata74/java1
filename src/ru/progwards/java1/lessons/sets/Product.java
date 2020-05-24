package ru.progwards.java1.lessons.sets;

public class Product extends ProductAnalytics{
    private String code;
    public Product(String code){
        super();
        this.code=code;
    }

    public String getCode(){
        return code;
    }
    public String toString(){
        return ("Артикуль: "+ getCode());
    }
}
