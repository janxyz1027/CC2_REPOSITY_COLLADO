//COLLADO JOHN FRANK
//CITCS 1N A
package com.mycompany.finalchallengeno1;
import java.util.Scanner;

public class FinalChallengeNo1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Array of products
        String[] products = {"egg", "milk", "mayo", "salt", "sugar", "coffee", "water", "candy", "chicken", "beef"};
        int[] stocks = {13, 5, 7, 18, 20, 11, 23, 3, 9, 30};
        double[] prices = {5.15, 6.25, 7.35, 8.45, 9.55, 10.65, 11.75, 12.85, 13.95, 14.15};
        double totalStockValue = 0, highestStockValue = 0, lowestStockValue = Double.MAX_VALUE;
        
        // Prompt user to enter a product name to look up
        System.out.print("Enter a product name: ");
        String inputProduct = sc.nextLine();
        
        // Search for the product in the array
        boolean productFound = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(inputProduct)) {
                // Product found, display stock and price
                System.out.println("Stock: " + stocks[i]);
                System.out.println("Price: $" + prices[i]);
                System.out.println("Total value of stock for " + products[i] + ": $" + (stocks[i] * prices[i]));
                productFound = true;
                break;
            }
        }
        
        // If the product was not found in the list
        if (!productFound) {
            System.out.println("Product not found.");
        }
        
        // Calculate the total value of all items in stock
        for (int i = 0; i < stocks.length; i++) {
            double stockValue = stocks[i] * prices[i];
            totalStockValue += stockValue;

            // Check for highest and lowest stock values
            if (stockValue > highestStockValue) {
                highestStockValue = stockValue;
            }
            if (stockValue < lowestStockValue) {
                lowestStockValue = stockValue;
            }
        }
        
        // Calculate average stock value
        double averageStockValue = totalStockValue / stocks.length;

        // Display the total, average, highest, and lowest stock values
        System.out.println("Total value of all items in stock: $" + totalStockValue);
        System.out.println("Average stock value: $" + averageStockValue);
        System.out.println("Highest stock value: $" + highestStockValue);
        System.out.println("Lowest stock value: $" + lowestStockValue);

        sc.close();
    }
}
