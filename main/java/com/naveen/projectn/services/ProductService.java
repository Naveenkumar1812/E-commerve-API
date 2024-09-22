package com.naveen.projectn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.projectn.models.Product;
import com.naveen.projectn.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository; 
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
}
