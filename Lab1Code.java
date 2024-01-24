// Lab1Code.java
// Programmer: Gigi Li and Jorge Sacasa
// Course:  CS 212, Mr. John
// Due Date: 1/28/24
// Lab: 1
// Problem Statement: Ask the user for 2 items with the amount they bought, and price per unit, them output subtotal price for both items and output total price
// Inputs: name, unit, and price of the two items
// Output: Name of the item with amount and price per unit with also subtotal price, total price of both items
// Credits: https://java2blog.com/print-float-to-2-decimal-places-java/#:~:text=7%20ways%20to%20print%20float%20to%202%20decimal,Using%20NumberFormat%20...%205%205.%20Using%20BigDecimal%20

import java.util.Scanner;
public class Lab1Code {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Shop. We hope you had a pleasant shopping experience with us today!");

        //asks the user for the name, unit, and price of the first item
        System.out.println("\n What was the first item that you purchased?");
        String firstItem = input.nextLine();
        System.out.println("\n Great! How many units of " + firstItem + " did you buy?");
        int firstUnit = input.nextInt();
        System.out.println("\n Okay! How much did " + firstItem + " cost per unit?");
        float firstCost = input.nextFloat();

        //asks the user for the name, unit, and price of the second item
        System.out.println("\n What was the second item that you purchased?");
        String secondItem = input.nextLine();
        System.out.println("\n Great! How many units of " + secondItem + " did you buy?");
        int secondUnit = input.nextInt();
        System.out.println("\n Okay! How much did " + secondItem + " cost per unit?");
        float secondCost = input.nextFloat();

        float firstSubTotal = firstUnit * firstCost;
        float secondSubTotal = secondUnit * secondCost;
        float totalCost = firstSubTotal + secondSubTotal;

        System.out.println("\n Sounds like you had a productive shopping trip.\nHere is your receipt:");

        System.out.println( firstItem + " " + firstUnit + " @ " + firstCost + ": " + firstSubTotal);
        System.out.println( secondItem + " " + secondUnit + " @ " + secondCost + ": " + secondSubTotal);
        System.out.println("TOTAL: " + totalCost);
        System.out.println("Thanks for your visit. Have a nice day.");


    }
}
