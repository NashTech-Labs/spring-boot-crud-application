package com.example.service;

import com.example.entity.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    /**
     *  ProductRepository  .
     */
    @Autowired
    private ProductRepository repository;

    /**
     * @param product  .
     * @return The product  .
     */
    public Product saveProduct(final Product product) {
        return repository.save(product);
    }

    /**
     * @return List of product  .
     */
    public List<Product> getProducts() {
        return repository.findAll();
    }

    /**
     * @param id  .
     * @return the product  .
     */
    public Product getProductById(final int id) {
        return repository.findById(id).orElse(null);
    }

    /**
     * @param name  .
     * @return the product  .
     */
    public Product getProductByName(final String name) {
        return repository.findByName(name);
    }

    /**
     * @param id  .
     * @return string  .
     */
    public String deleteProduct(final int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }

    /**
     * @param product  .
     * @return the product  .
     */
    public Product updateProduct(final Product product) {
        Product existingProduct =
                repository.findById(product.getId()).orElse(null);
        existingProduct.setProductName(product.getProductName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
}
