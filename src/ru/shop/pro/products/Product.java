package ru.shop.pro.products;

import ru.shop.pro.Department;

public class Product {
    private String name;
    private Department department;
    public Product(String name, String department) {
        this.name = name;
        this.department = new Department(department);
    }
}
