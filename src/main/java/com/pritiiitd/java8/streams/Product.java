package com.pritiiitd.java8.streams;

import lombok.*;

import java.util.Objects;


public class Product {
    private String name;
    private int id;

    public Product(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
