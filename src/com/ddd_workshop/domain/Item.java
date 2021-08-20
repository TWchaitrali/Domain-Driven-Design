package com.ddd_workshop.domain;

public class Item {
    Product product;

    public Product getProduct() {
        return product;
    }

    int quantity;

    public Item(Product productName) {
        this.product = productName;
        this.quantity = 1;
    }

    public Item(Product name, int quantity) {
        this.product = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return " name='" + product.toString() + '\'' +
                ", quantity=" + quantity;
    }
}
