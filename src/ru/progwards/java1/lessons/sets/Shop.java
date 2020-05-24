package ru.progwards.java1.lessons.sets;

import java.util.List;

public class Shop extends ProductAnalytics{
    private List<Product> productsmag;
    public Shop(List<Product> productsmag){
        this.productsmag =productsmag;
    }
    public List<Product> getProducts(){
        return productsmag;
    }
}


