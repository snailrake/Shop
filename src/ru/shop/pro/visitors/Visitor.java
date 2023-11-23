package ru.shop.pro.visitors;

import ru.shop.pro.interfaces.IVisitor;

import java.util.ArrayList;

public class Visitor implements IVisitor {
    private String name;
    protected ArrayList<String> products = new ArrayList<>();

    public Visitor(String name) {
        this.name = name;
    }
    public Visitor(String name, ArrayList<String> products) {
        this.name = name;
        this.products = products;
    }

    public void buyProduct() {

    }

    public void refundProduct() { //ftghrfthj

    }
}
