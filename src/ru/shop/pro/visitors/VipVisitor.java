package ru.shop.pro.visitors;

import java.util.ArrayList;

public class VipVisitor extends Visitor {
    private int saleSize;
    public VipVisitor(String name) {
        super(name);
    }
    public VipVisitor(String name, ArrayList<String> product) {
        super(name, product);
    }

    @Override
    public void buyProduct(String product) {
        super.products.add(product);
    }
}
