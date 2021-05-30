package oop.example;


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
