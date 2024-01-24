// Lab1Code.java
// Programmer: Gigi Li and Jorge Sacasa
// Course:  CS 212, Mr. John
// Due Date: 1/28/24
// Lab: 1
// Problem Statement: Ask the user for 2 items with the amount they bought, and price per unit, them output subtotal price for both items and output total price
// Inputs: name, unit, and price of the two items
// Output: Name of the item with amount and price per unit with also subtotal price, total price of both items
// Credits: https://java2blog.com/print-float-to-2-decimal-places-java/#:~:text=7%20ways%20to%20print%20float%20to%202%20decimal,Using%20NumberFormat%20...%205%205.%20Using%20BigDecimal%20
// https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo

import java.util.Scanner;
public class Lab1Code {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Shop. We hope you had a pleasant shopping experience with us today!");

        //asks the user for the name, unit, and price of the first item
        System.out.println("\nWhat was the first item that you purchased?");
        String firstItem = input.nextLine();
        System.out.println("\nGreat! How many units of " + firstItem + " did you buy?");
        int firstUnit = input.nextInt();
        System.out.println("\nOkay! How much did " + firstItem + " cost per unit?");
        float firstCost = input.nextFloat();

        //debugs the error with the code skipping lines for the 2nd string input
        input.nextLine();

        //asks the user for the name, unit, and price of the second item
        System.out.println("\nWhat was the second item that you purchased?");
        String secondItem = input.nextLine();
        System.out.println("\nGreat! How many units of " + secondItem + " did you buy?");
        int secondUnit = input.nextInt();
        System.out.println("\nOkay! How much did " + secondItem + " cost per unit?");
        float secondCost = input.nextFloat();

        //calculate the cost for each item and the total cost
        float firstSubTotal = firstUnit * firstCost;
        float secondSubTotal = secondUnit * secondCost;
        float totalCost = firstSubTotal + secondSubTotal;

        //print the receipt to the user and thank them
        System.out.println("\nSounds like you had a productive shopping trip. Here is your receipt:");
        System.out.println( firstItem + " " + firstUnit + " @ " + firstCost + ": " + firstSubTotal);
        System.out.println( secondItem + " " + secondUnit + " @ " + secondCost + ": " + secondSubTotal);
        System.out.println("\nTOTAL: " + totalCost);
        System.out.println("\nThanks for your visit. Have a nice day.");


    }
}
