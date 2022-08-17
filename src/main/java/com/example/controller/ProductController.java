package com.example.controller;

import com.example.entity.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    /**
     *  ProductService
     */
    @Autowired
    private ProductService service;

    /**
     * @param product  .
     * @return the product  .
     */
    @PostMapping("/add/Product")
    public Product addProduct(final @RequestBody Product product) {
        return service.saveProduct(product);
    }

    /**
     * @return List of products  .
     */
    @GetMapping("/getAllProducts")
    public List<Product> findAllProduct() {
        return service.getProducts();
    }

    /**
     * @param id  .
     * @return the product  .
     */
    @GetMapping("/getProductById/{id}")
    public Product findProductById(final @PathVariable int id) {
        return service.getProductById(id);
    }

    /**
     * @param name  .
     * @return the product  .
     */
    @GetMapping("/getProductByName/{name}")
    public Product findProductByName(final @PathVariable String name) {
        return service.getProductByName(name);
    }

    /**
     * @param product
     * @return the product  .
     */
    @PutMapping("/updateProduct")
    public Product updateProduct(final @RequestBody Product product) {
        return service.updateProduct(product);
    }

    /**
     * @param id  .
     * @return string  .
     */
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(final @PathVariable int id) {
        return service.deleteProduct(id);
    }
}
