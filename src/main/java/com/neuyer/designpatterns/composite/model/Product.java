package com.neuyer.designpatterns.composite.model;

import com.neuyer.designpatterns.composite.ProductComponent;

public class Product implements ProductComponent {

    private Integer quantity;
    private Double price;

    public Product(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public double calcCost() {
        return price * quantity;
    }
}
