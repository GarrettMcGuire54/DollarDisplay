package com.company;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //create Scanner and Variables

        Scanner Keyboard = new Scanner(System.in);
        double unitPrice;
        int quantity;
        boolean taxable;

        //set Number Format to currency ($) American USD

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        //prompt user for unit price, quantity, and taxable. Collect answers

        System.out.println("Unit price: ");
        unitPrice = Keyboard.nextDouble();
        System.out.println("Quantity: ");
        quantity = Keyboard.nextInt();
        System.out.println("Taxable? True/False");
        taxable = Keyboard.nextBoolean();

        //algorithm to solve for total

        double total = unitPrice * quantity;
        if (taxable) {
            total = total * 1.05;
        }

        //output of the amount, now shows the $ in front of total

        String niceTotal = currency.format(total);
        System.out.println("Total: ");
        System.out.println(niceTotal);

        Keyboard.close();

    }
}
