package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class Checkout {
    private double subtotal;
    private final double taxRate = .055;
    private double tax;
    private double total;

    Items item1 = new Items();
    Items item2 = new Items();
    Items item3 = new Items();

    double price1 = item1.setPrice();
    int quant1 = item1.setQuantity();


    double price2 = item2.setPrice();
    int quant2 = item2.setQuantity();

    double price3 = item3.setPrice();
    int quant3 = item3.setQuantity();

    public double getSubtotal(){
        subtotal = (price1*quant1) + (price2*quant2) + (price3*quant3);
        return subtotal;
    }

    public void printItems(){
        System.out.printf("Item 1. Quantity: %d Price: %.2f%n" ,quant1, price1 );
        System.out.printf("Item 2. Quantity: %d Price: %.2f%n" ,quant2, price2 );
        System.out.printf("Item 3. Quantity: %d Price: %.2f%n" ,quant3, price3 );
    }

    public double getTax(){
        tax = subtotal * taxRate;
        return tax;
    }

    public double getTotal(){
        total = subtotal + tax;
        return total;
    }
}
