package Week_0.Java_Fundamentals.Exercise_4;

import java.util.Scanner;

/**
 * Calculate the final total of someone's cell phone bill.
 * Allow the operator to input the plan fee and the number of the overage minutes
 * charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
 * Create seperate methods to calculate the tax, overage fees, and final total.
 * print the itemized bill.
 */
public class PhoneBillCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double charge = 0.25;

        // Get plan fee and average minutes from user
        double planFee = getFee();
        double ovgMins = getOvgMins();
        scanner.close();


        double ovgTotal = getPercentageTotal(ovgMins);
        double taxTotal = getTax(planFee + ovgTotal);

        double finalTotal = planFee + ovgTotal + taxTotal;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: " + String.format("%.2f", planFee));
        System.out.println("Overage: " + String.format("%.2f", ovgTotal));
        System.out.println("Tax: " + String.format("%.2f", taxTotal));
        System.out.println("Total: " + String.format("%.2f", finalTotal));

    }

    public static double getFee() {
        System.out.println("Provide plan fee: ");
        double planFee = scanner.nextDouble();
        return planFee;
    }

    public static double getOvgMins() {
        System.out.println("Provide average minutes: ");
        double avarageMins = scanner.nextDouble();
        return avarageMins;
    }

    public static double getPercentageTotal(double ovgMins) {
        double charge = 0.25;
        return ovgMins * charge;
    }

    public static double getTax(double subtotal) {
        double taxPercentage = 0.15;
        return subtotal * taxPercentage;
    }
}
