package com.ddd_workshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Item> products;
    private final Notifier notifier;

    public Cart(Notifier notifier) {
        this.notifier = notifier;
        products = new ArrayList<>();
    }

    public void add(Item item) {
        products.add(item);
    }

    public void removeItem(Item item) {
        products.remove(item);
        notifier.addDeletedItems(item.getProduct());
    }

    public void view() {
        products.forEach(System.out::println);
    }

}
