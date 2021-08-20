package com.ddd_workshop.driver;

import com.ddd_workshop.domain.Cart;
import com.ddd_workshop.domain.Item;
import com.ddd_workshop.domain.Notifier;
import com.ddd_workshop.domain.Product;

public class Shop {
    public static void main(String[] args) {

        Item iPad_pro = new Item(new Product("IPad Pro"));
        Item heroInkPen = new Item(new Product("Hero Ink Pen"));
        Item gmCricketBat = new Item(new Product("GM Cricket Bat"), 2);
        Notifier notifier = new Notifier();

        Cart cart = new Cart(notifier);
        cart.add(heroInkPen);
        cart.add(iPad_pro);
        cart.add(gmCricketBat);
        cart.removeItem(iPad_pro);

        //cart.view();
        notifier.viewDeletedItems();

    }
}
