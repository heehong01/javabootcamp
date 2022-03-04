package com.heejinhong.Cafe;

public class Product {
    private String name;
    private double price;
    private String description;
    private int quantity;
    private final double SALES_TAX = 0.08;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(){

    }

    public Product(String name, double price, String description){
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void calculateProductTotal(){
        double subtotal = getPrice()*getQuantity();
        double total = subtotal + subtotal*SALES_TAX;
        System.out.println("Subtotal for " + getName() + " is: $" + subtotal);
        System.out.printf("Total for %s is: $%.2f\n\n", getName(),total);
    }


}
