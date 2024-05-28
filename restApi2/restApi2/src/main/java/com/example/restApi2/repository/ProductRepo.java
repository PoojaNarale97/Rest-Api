package com.example.restApi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restApi2.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
