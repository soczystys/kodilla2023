package com.kodilla.good.patterns.challenges.food2door.orderprocessor.order;

import com.kodilla.good.patterns.challenges.food2door.product.Product;
import com.kodilla.good.patterns.challenges.food2door.supplier.Supplier;

public class Order {

    private Supplier supplier;
    private Product product;

    public Order(Supplier supplier, Product product) {
        this.supplier = supplier;
        this.product = product;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }
}
