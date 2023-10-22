package ru.gbhw;

public class Product {
    private int cost;
    private String title;

    public Product(int cost, String title){
        this.cost = cost;
        this.title = title;
    }
    public int getCost(){
        return cost;
    }
    public String getTitle(){
        return title;
    }
    @Override
    public String toString(){
        return "Product: (" + title + ", " + cost + ")"; 
    }
}
