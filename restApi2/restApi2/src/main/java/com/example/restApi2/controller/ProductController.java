package com.example.restApi2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restApi2.entity.Product;
import com.example.restApi2.service.ProductServiceImplement;

@RestController
public class ProductController {
	
	@Autowired
	ProductServiceImplement service;	
	
	@GetMapping("/hello")
	public String welcome()
	{
		return "Hello Pooja";
	}

	
	@GetMapping("/getproduct")
	public List<Product> AllProduct()
	{
		return service.getProduct();
	}

}
