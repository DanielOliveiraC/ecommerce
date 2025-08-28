package com.store.demo.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
    private String category;
    private String imageUrl;

    // Constructor
    public Product() {}

    // Getters and Setters
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public int getStockQuantity() {return stockQuantity;}
    public void setStockQuantity(int stockQuantity) {this.stockQuantity = stockQuantity;}

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public String getImageUrl() {return imageUrl;}
    public void setImageUrl(String imageUrl) {this.imageUrl = imageUrl;}
}
