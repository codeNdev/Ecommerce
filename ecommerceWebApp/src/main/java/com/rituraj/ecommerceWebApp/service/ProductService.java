package com.rituraj.ecommerceWebApp.service;

import com.rituraj.ecommerceWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * ProductService is a service class that handles the business logic related to products.
 * It interacts with the data layer to fetch product information.
 */
@Service
public class ProductService {
     // This class represents a service that handles product-related operations
     // It contains methods to fetch all products, fetch a product by its ID, and add a new product
     // For now, we are using a static list of products as a placeholder
     List<Product> productsInitial= Arrays.asList(
            new Product(1,"Product 1", 100.0, "Description of Product 1"),
            new Product(2,"Product 2", 200.0, "Description of Product 2"),
            new Product(3,"Product 3", 300.0, "Description of Product 3"),
            new Product(4,"Product 4", 400.0, "Description of Product 4"),
            new Product(5,"Product 5", 500.0, "Description of Product 5"),
            new Product(6,"Product 6", 600.0, "Description of Product 6"));
     // Initializing the products list with some sample data
     List<Product> products=new ArrayList<>(productsInitial);
     public List<Product> getAllProducts() {
         // Logic to fetch all products from the database or any data source
         // For now, returning null as a placeholder
         return products;
     }
     // Method to fetch a product by its ID
     public Product getProductById(int id) {
         // Logic to fetch a product by its ID from the database or any data source
         // For now, returning null as a placeholder
         return products.stream().filter(product -> product.getId() == id).findFirst().orElse(null);
     }
     // Method to add a new product
     public void addProduct(Product product) {
        // Logic to add a new product to the database or any data source
        // For now, returning null as a placeholder
        products.add(product);
        System.out.println("Product added: " + product);
     }
}
