package org.example;

public class Product {
    private String imageURL;
    private String productName;
    private double price;
    private int stock;
    private boolean availability;

    public Product(String imageURL, String productName, double price, int stock, boolean availability) {
        this.imageURL = imageURL;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.availability = availability;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public boolean isAvailability() {
        return availability;
    }
}