package com.naveen.projectn.contollers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.projectn.models.Product;
import com.naveen.projectn.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	@GetMapping
	public List<Product> getAllProducts() {
		return productService.getAllProducts();		
	}
	
	@GetMapping("/catagory")
	public List<Map<String,Object>> getCatagoryProducts() {
		return Arrays.asList(
				Map.of("name", "Product 1", "price",234),
				Map.of("name", "Product 2", "price",134)
				
				);
				
	}

}
