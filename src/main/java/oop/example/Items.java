package oop.example;

import java.util.Scanner;

public class Items {
    private double price;
    private int quantity;

    public double setPrice() {
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("What is the price of the item? ");
            while (!input.hasNextDouble()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid price.");
                System.out.println("What is the price of the item? ");
            }
            price = input.nextDouble();
            if (price < 0) {
                System.out.println("Price cannot be a negative value.");
            }
        } while (price < 0);
        return price;
    }

    public int setQuantity() {
        Scanner input = new Scanner(System.in);
        do {

            System.out.println("What is the quantity of the item? ");
            while (!input.hasNextInt()) {
                String str1 = input.next();
                System.out.println(str1 + " is not a valid quantity.");
                System.out.println("What is the quantity of the item? ");
            }
            quantity = input.nextInt();
            if (quantity < 0) {
                System.out.println("Quantity cannot be a negative value.");
            }
        } while (quantity < 0);
        return quantity;

    }

}
