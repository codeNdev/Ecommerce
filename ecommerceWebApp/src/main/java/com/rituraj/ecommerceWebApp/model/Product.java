package com.rituraj.ecommerceWebApp.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
    // This class represents a product in the e-commerce application
    // It contains attributes like id, name, price, description, etc.
    private int id;
    private String name;
    private double price;
    private String description;
    public Product() {
        // Default constructor
    }
    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

}
