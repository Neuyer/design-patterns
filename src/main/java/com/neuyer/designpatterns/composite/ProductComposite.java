package com.neuyer.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductComposite implements ProductComponent {

    List<ProductComponent> products = new ArrayList<>();

    public void addComponent(ProductComponent productComponent) {
        products.add(productComponent);
    }

    public void removeComponent(ProductComponent productComponent) {
        products.remove(productComponent);
    }

    @Override
    public double calcCost() {
        float totalCost = 0;
        for (ProductComponent product : products) {
            totalCost += product.calcCost();
        }
        return totalCost;
    }
}
