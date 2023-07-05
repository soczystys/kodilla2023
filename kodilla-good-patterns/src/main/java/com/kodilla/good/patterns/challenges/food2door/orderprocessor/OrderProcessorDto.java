package com.kodilla.good.patterns.challenges.food2door.orderprocessor;

import com.kodilla.good.patterns.challenges.food2door.product.Product;
import com.kodilla.good.patterns.challenges.food2door.supplier.Supplier;

public class OrderProcessorDto {

    private Supplier supplier;
    private Product product;
    private boolean processed;

    public OrderProcessorDto(Supplier supplier, Product product, boolean processed) {
        this.supplier = supplier;
        this.product = product;
        this.processed = processed;
    }
}
