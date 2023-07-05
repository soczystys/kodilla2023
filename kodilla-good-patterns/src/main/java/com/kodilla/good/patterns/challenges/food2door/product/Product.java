package com.kodilla.good.patterns.challenges.food2door.product;

public class Product {
    private String productName;
    private double quantity;
    private Unit unitOfMeasure;

    public Product(String productName, double quantity, Unit unitOfMeasure) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitOfMeasure = unitOfMeasure;
    }
}
