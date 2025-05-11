package com.pritiiitd.java8.streams;

import java.util.List;

public class Order {
    private String orderId;
    private List<Product> products;

    public Order(String orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }
}
