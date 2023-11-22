package ru.shop.pro.visitors;

import java.util.ArrayList;

public class Visitor {
    private String name;
    protected ArrayList<String> products = new ArrayList<>();

    public Visitor(String name) {
        this.name = name;
    }
    public Visitor(String name, ArrayList<String> products) {
        this.name = name;
        this.products = products;
    }

    public void buyProduct(String product) {
        this.products.add(product);
    }

    public void refund(String product) {
        this.products.remove(product);
    }
}
