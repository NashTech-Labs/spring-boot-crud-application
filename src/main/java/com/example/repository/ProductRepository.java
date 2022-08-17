package com.example.repository;

import com.example.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    /**
     * @param name  .
     * @return The product  .
     */
    Product findByName(String name);
}

