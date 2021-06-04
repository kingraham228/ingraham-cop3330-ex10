package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */

public class App 
{
    public static void main( String[] args )
    {
        Checkout userCheckout = new Checkout();
        userCheckout.printItems();

        System.out.printf("Subtotal: $%.2f%n", userCheckout.getSubtotal());
        System.out.printf("Tax: $%.2f%n", userCheckout.getTax());
        System.out.printf("Total: $%.2f%n", userCheckout.getTotal());


    }
}
