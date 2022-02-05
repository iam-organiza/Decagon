package Week_0.Java_Fundamentals.Exercise_4;

import java.util.Scanner;

/**
 * The objective of the game is to enter enough change to equal exactly $1!
 * Create a program that asks a user to enter the quantities for the following coins: pennies, nickels,
 * dimes, and quarters. Your program should count up the value of all the change.
 * if it's exactly $1, they win! if it's more than $1, tell them by how much they went over.
 * if it's less than $1, tell them by how much they went under.
 * feel free to change the game for your currency!
 */
public class ChangeForADollarGame {
    public static void main(String[] args) {
        // 1. Get user values for [pennies, nickels, dimes, quarters]
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to change for a dollar game.");
        System.out.println("The rules are simple you need to provide the exact quatity of coins for the following:");
        System.out.println("Pennies, Nickels, Dimes, and Quarter");
        System.out.println("that the sum total equal exactly $1");
        System.out.println("----------- Start -------------");
        System.out.println("Provide a quantity of pennies: ");
        int pennies = scanner.nextInt();
        // A penny is 1 cent
        pennies *= 1;

        System.out.println("Provide a quantity of nickels: ");
        int nickels = scanner.nextInt();
        // A nickel is 5 cents
        nickels *= 5;

        System.out.println("Provide a quantity of dimes: ");
        int dimes = scanner.nextInt();
        // A dime is 10 cents
        dimes *= 10;

        System.out.println("Provide a quantity of quarters: ");
        int quarters = scanner.nextInt();
        // A quarter is 25 cents
        quarters *= 25;

        scanner.close();

        // 2. Get total of change provided
        Integer total = pennies + nickels + dimes + quarters;

        // 3. Check if its exactly $1
        if (total.equals(100)) {
            System.out.println("Good job! you won.");
        } else {
            // 4. Else if it is not exactly $1
            if (total > 100) {
                System.out.println("OOps! you lost. you were over by " + (total - 100));
            } else {
                System.out.println("OOps you lost. you were under by " + (100 - total));
            }
        }
        System.out.println("----------- End -------------");
    }
}
