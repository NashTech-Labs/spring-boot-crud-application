package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {

    /**
     *  The id  .
     */
    @Id
    @GeneratedValue
    private int id;

    /**
     *  The name of product  .
     */
    private String productName;

    /**
     * The quantity of product  .
     */
    private int quantity;

    /**
     * The price of product  .
     */
    private double price;
}
