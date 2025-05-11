package com.pritiiitd.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        Order order1 = new Order("123", Arrays.asList(
                new Product("Apple", 1),
                new Product("Orange", 2),
                new Product("Banana", 3)));

        Order order2 = new Order("456", Arrays.asList(
                new Product("Apple", 4),
                new Product("Grape", 5),
                new Product("Banana", 6)));

        List<Order> orders = Arrays.asList(order1, order2);
        List<Product> uniqueProducts = orders.stream()
                .flatMap(order -> order.getProducts().stream())

                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueProducts);
        //
    }
    }

