package com.kodilla.good.patterns.challenges.food2door.orderprocessor;

import com.kodilla.good.patterns.challenges.food2door.orderprocessor.order.Order;
import com.kodilla.good.patterns.challenges.food2door.producer.FoodProducerProcessor;
import com.kodilla.good.patterns.challenges.food2door.product.Product;
import com.kodilla.good.patterns.challenges.food2door.supplier.Supplier;

public class OrderProcessor {

    public static OrderProcessorDto processOrder(Order order, FoodProducerProcessor foodProducerProcessor) {
        Supplier supplier = order.getSupplier();
        Product product = order.getProduct();

        boolean processed = foodProducerProcessor.process();
        inform(processed, order);

        return new OrderProcessorDto(supplier, product, processed);
    }

    private static void inform(boolean processed, Order order) {
        if (processed) {
            System.out.println("operation successful");
        } else {
            System.out.println("something went wrong");
        }
        System.out.println(order);
    }

}