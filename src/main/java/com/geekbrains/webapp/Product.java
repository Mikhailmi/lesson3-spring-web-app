package com.geekbrains.webapp;

public class Product {

    private long id;
    private String name;
    private int cost;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public Product(long id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
