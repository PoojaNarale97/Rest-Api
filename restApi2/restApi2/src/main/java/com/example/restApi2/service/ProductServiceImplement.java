package com.example.restApi2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restApi2.entity.Product;


@Service
public class ProductServiceImplement implements ProductService {
	
	List<Product> list;
	
	public ProductServiceImplement() {
		list=new ArrayList<Product>();
		list.add(new Product(1,"Jova Book",45.19));
		list.add(new Product(1,"Jova Book",45.19));
		list.add(new Product(1,"Jova Book",45.19));
		
	}

	@Override
	public List<Product> getProduct() {
		// TODO Auto-generated method stub
		return list;
	}
	
	

}
