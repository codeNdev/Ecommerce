package com.rituraj.ecommerceWebApp.controller;

import com.rituraj.ecommerceWebApp.model.Product;
import com.rituraj.ecommerceWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController {
//    @Autowired
    ProductService service;
//    Constructor injection
    public ProductController(ProductService service) {
        this.service = service;
    }

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }
    @RequestMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    public void addProduct(Product product) {
        // Logic to add a new product
        // For now, returning null as a placeholder
         service.addProduct(product);
    }
}
