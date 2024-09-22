package com.naveen.projectn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naveen.projectn.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
