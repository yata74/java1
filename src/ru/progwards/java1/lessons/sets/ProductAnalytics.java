package ru.progwards.java1.lessons.sets;

import java.util.*;

public class ProductAnalytics {
    private List<Shop> shops;
    private List<Product> products;
    public ProductAnalytics(List<Product> products, List<Shop> shops){
        this.products = products;
        this.shops = shops;
    }

    public ProductAnalytics() {

    }

//    public static class Product{
//        private String code;
//        public Product(String code){
//            this.code=code;
//        }
//
//        public String getCode(){
//            return code;
//        }
//        public String toString(){
//            return ("Артикуль: "+ getCode());
//        }
//    }
//    public static class Shop{
//        private List<Product> productsmag;
//        public Shop(List<Product> productsmag){
//            this.productsmag=productsmag;
//        }
//        public List<Product> getProducts(){
//            return productsmag;
//        }
//    }
    public Set<Product> existInAll(){
        Set<Product> res = new HashSet<>();
        for (Product name:products){
            int ind=0; //в скольких магазинах есть этот товар
            for (Shop mag:shops){
                if (mag.getProducts().contains(name)){
                    ind+=1;
                }
            }
            if (ind==shops.size()){
                res.add(name);
            }
        }
        return res;
    }
    public Set<Product> existAtListInOne(){
        Set<Product> res = new HashSet<>();
        for (Product name:products){
            int ind=0; //в скольких магазинах есть этот товар
            for (Shop mag:shops){
                if (mag.getProducts().contains(name)){
                    ind+=1;
                }
            }
            if (ind!=0){
                res.add(name);
            }
        }
        return res;
    }
    public Set<Product> notExistInShops(){
        Set<Product> res = new HashSet<>();
        for (Product name:products){
            int ind=0; //в скольких магазинах есть этот товар
            for (Shop mag:shops){
                if (mag.getProducts().contains(name)){
                    ind+=1;
                }
            }
            if (ind ==0){
                res.add(name);
            }
        }
        return res;
    }
    public Set<Product> existOnlyInOne(){
        Set<Product> res = new HashSet<>();
        for (Product name:products){
            int ind=0; //в скольких магазинах есть этот товар
            for (Shop mag:shops){
                if (mag.getProducts().contains(name)){
                    ind+=1;
                }
            }
            if (ind ==1){
                res.add(name);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Product bread = new Product("120");
        Product salt = new Product("121");
        Product butter = new Product("122");
        Product water = new Product("123");
        Product sugar = new Product("124");
        Product meat = new Product("125");
        Product cookies = new Product("126");
        Product chicken= new Product("127");
        Product milk = new Product("128");
        Product cheese = new Product("129");
        List<Product> pr1=new ArrayList<Product>();
        pr1.add(bread);
        pr1.add(salt);
        pr1.add(butter);
        List<Product> pr2=new ArrayList<Product>();
        pr2.add(bread);
        pr2.add(water);
        pr2.add(sugar);
        pr2.add(meat);
        List<Product> pr3=new ArrayList<Product>();
        pr3.add(bread);
        pr3.add(salt);
        pr3.add(cookies);
        pr3.add(chicken);
        pr3.add(milk);
        Shop food1 = new Shop(pr1);
        Shop food2 = new Shop(pr2);
        Shop food3 = new Shop(pr3);
        List<Shop> magas =new ArrayList<Shop>();
        magas.add(food1);
        magas.add(food2);
        magas.add(food3);
        List<Product> tovar = new ArrayList<Product>();
        tovar.add(bread);
        tovar.add(salt);
        tovar.add(butter);
        tovar.add(water);
        tovar.add(sugar);
        tovar.add(meat);
        tovar.add(cookies);
        tovar.add(chicken);
        tovar.add(milk);
        tovar.add(cheese);
        ProductAnalytics pran = new ProductAnalytics(tovar, magas);
        System.out.println("Во всех магазинах есть:");
        for (Product i:pran.existInAll()){
            System.out.println(i);
        }
        System.out.println("Хотябы в одном магазине есть:");
        for (Product i:pran.existAtListInOne()){
            System.out.println(i);
        }
        System.out.println("Нет ни в одном магазине:");
      //  System.out.println(pran.existAtListInOne());
        System.out.println(pran.notExistInShops());
        System.out.println("Есть только в одном магазине:");
        System.out.println(pran.existOnlyInOne());
    }
}
