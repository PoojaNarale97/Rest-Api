package com.example.SpringAnnotation.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String about;
	
	//@OneToOne
	//private Category category;
	@OneToMany(mappedBy="product")
	private List<Category> categoryList;
	
	

}

/*
 * mysql> INSERT INTO product_categories (about, title) VALUES ('Category
 * Description 1', 'Category Title 1'), -> ('Category Description 2', 'Category
 * Title 2'), -> ('Category Description 3', 'Category Title 3');
 *  Query OK, 3
 * rows affected (0.02 sec) Records: 3 Duplicates: 0 Warnings: 0 
 * mysql> INSERT
 * INTO product (about, title, category_id) VALUES -> ('Description 1', 'Title
 * 1', 1), -> ('Description 2', 'Title 2', 2), -> ('Description 3', 'Title 3',
 * 3); 
 * Query OK, 3 rows affected (0.00 sec) Records: 3 Duplicates: 0 Warnings: 0
 */