package com.company;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        double unitPrice;
        int quantity;
        boolean taxable;

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Unit price: ");
        unitPrice = Keyboard.nextDouble();
        System.out.println("Quantity: ");
        quantity = Keyboard.nextInt();
        System.out.println("Taxable? True/False");
        taxable = Keyboard.nextBoolean();

        double total = unitPrice * quantity;
        if (taxable) {
            total = total * 1.05;
        }

        String niceTotal = currency.format(total);
        System.out.println("Total: ");
        System.out.println(niceTotal);

        Keyboard.close();
        
    }
}
