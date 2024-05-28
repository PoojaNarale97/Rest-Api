package com.example.SpringAnnotation.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SpringAnnotation.entity.Product;
import com.example.SpringAnnotation.repository.ProductRepository;

import jakarta.transaction.Transactional;


@Service
public class ServiceSpring {
    
    @Autowired
    private ProductRepository productRepository; // Correctly injected repository interface
    
    public Product saveProduct(Product product) {
        // Save the product using the repository
        return productRepository.save(product); // Pass the product to the save method
    }
    
    public List<Product> getAllProducts()
    {
    	return productRepository.findAll();
    }
    
    @Transactional
    public void insert10Products()
    {
    	System.out.println("product1");
    	System.out.println("product2");

    	System.out.println("product3");

    	System.out.println("product4");

    	System.out.println("product5");

    	System.out.println("product6");


    	

    	
    	
    }
}
