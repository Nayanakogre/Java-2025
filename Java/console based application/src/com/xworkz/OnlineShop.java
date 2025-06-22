package com.xworkz;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, productId;
        double total = 0;
        String[] groceries = {
                "Rice", "Wheat Flour", "Sugar", "Salt", "Eggs",
                "Pulses", "Lentils", "Cooking Oil", "Spices", "Biscuits"
        };

        double[] prices = {
                50.0, 40.0, 45.0, 20.0, 6.0,
                80.0, 90.0, 150.0, 120.0, 30.0
        };

        while (true) {
            // Display menu
            System.out.println("\nGrocery Shopping Menu:");
            System.out.println("1. View Groceries");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have choosen Grocirires");
                    for (int i = 0; i < groceries.length; i++) {
                        System.out.println("Product ID: " + (i + 1) + " | " + groceries[i] + " - ₹" + prices[i] + " per kg/unit");
                    }
                    break;
                case 2:
                    System.out.print("Enter Product ID to add to cart: ");
                    productId = scanner.nextInt();
                    if (productId >= 1 && productId <= groceries.length) {
                        total += prices[productId - 1];
                        System.out.println(groceries[productId - 1] + " added to cart!");
                    } else {
                        System.out.println("Invalid Product ID!");
                    }
                    break;
                case 3:
                    System.out.println("\nTotal Cart Value: ₹" + total);
                    break;

                case 4:
                    System.out.println("Thank you for shopping! Your total bill is ₹" + total);
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");

            }

        }
    }
}




