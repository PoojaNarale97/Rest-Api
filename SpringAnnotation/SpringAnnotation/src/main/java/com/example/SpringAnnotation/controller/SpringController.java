package com.example.SpringAnnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List; // Import List interface

import com.example.SpringAnnotation.entity.Product;
import com.example.SpringAnnotation.service.ServiceSpring;

@RestController
@RequestMapping("/transaction/api")
public class SpringController {

    @Autowired
    private ServiceSpring service;
    
    // GET endpoint to retrieve all products
    @GetMapping("/get")
    public List<Product> getAllProducts() {
        return service.getAllProducts(); // Corrected method name
    }
    
    // POST endpoint to save a product
    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
}
