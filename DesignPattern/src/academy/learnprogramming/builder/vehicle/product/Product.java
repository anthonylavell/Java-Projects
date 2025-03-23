package academy.learnprogramming.builder.vehicle.product;

import java.util.LinkedList;

public class Product {
    private LinkedList<String> parts;

    public Product(){
        parts = new LinkedList<>();
    }

    public void add( String part){
        parts.addLast(part);
    }

    public void show(){
        System.out.println("Product completed as below");
        for (String str: parts){
            System.out.println(str);
        }
    }
}
