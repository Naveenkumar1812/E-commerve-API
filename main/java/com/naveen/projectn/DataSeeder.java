package com.naveen.projectn;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.naveen.projectn.models.Product;
import com.naveen.projectn.repository.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public void run(String ...args) throws Exception {
		
		
		//check if the table is empty
		
		if (productRepository.count() == 0) {
			// inserting data 
			List<Product> products = Arrays.asList(
					new Product ("Oppo f12 5g", 245.23, "Oppo f12 5g is the most powerfull phone in the current mobile market", 40.5, "Mobile Phone","Amazon", 5, 15, Arrays.asList("https://opsg-img-cdn-gl.heytapimg.com/epb/202407/25/XR1jPDUegtdkCOl5.png")),
					new Product ("Vivo 15g", 245.23, "Vivo v15 5g is the most powerfull phone in the current mobile market", 40.5, "Mobile Phone","Amazon", 5, 15, Arrays.asList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQWeLVWOzWla8Zy87cK4a2GlNrHkJ3S6s2w4w&s")),
					new Product ("Apple 16 pro max", 245.23, "Apple 16 pro max is the most powerfull phone in the current mobile market", 40.5, "Mobile Phone","Amazon", 5, 15, Arrays.asList("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSAgQVi2Iyctb8rJG2vkQ5ERNC78mqkReWqsw&s")),
					new Product ("Redmi note 13 pro", 245.23, "Redmi note 13 pro  is the most powerfull phone in the current mobile market", 40.5, "Mobile Phone","Amazon", 5, 15, Arrays.asList("https://i01.appmifile.com/v1/MI_18455B3E4DA706226CF7535A58E875F0267/pms_1680031226.49084509!800x800!85.jpg"))
					);
			
			productRepository.saveAll(products);
			System.out.println("Demo data seemed");
					
		}
		
		
	}

}
