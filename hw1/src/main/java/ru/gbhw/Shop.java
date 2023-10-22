package ru.gbhw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Shop {
    private ArrayList<Product> listProducts = new ArrayList<>();

    public void addProduct(int cost, String title){
        listProducts.add(new Product(cost, title));
    }
    //Сортировка продуктов
    public void sortProductsByPrice(){
        Collections.sort(listProducts, (Product a, Product b) -> a.getCost() - b.getCost());
    }
    public void print(){
        for(Product item : listProducts){
            System.out.println(item.toString());
        }
    }
    //Самый дорогой продукт из списка
    public Product getMostExpensiveProduct(){
        return listProducts.stream().max(Comparator.comparing(v -> v.getCost())).get();
    }

    public int size(){
        return listProducts.size();
    }
    public Product getProduct(int element){
        return listProducts.get(element);
    }
}
