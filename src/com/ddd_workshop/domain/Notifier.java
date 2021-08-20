package com.ddd_workshop.domain;

import java.util.HashSet;
import java.util.Set;

public class Notifier {
    Set<Product> deletedItems;

    public Notifier() {
        this.deletedItems = new HashSet<>();
    }

    public void viewDeletedItems(){
        System.out.println("Items Removed are- ");
        deletedItems.forEach(System.out::println);
    }

    public void addDeletedItems(Product product){
        deletedItems.add(product);
    }
}
