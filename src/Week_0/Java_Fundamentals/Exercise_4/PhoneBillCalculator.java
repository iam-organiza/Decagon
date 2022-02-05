package Week_0.Java_Fundamentals.Exercise_4;

/**
 * Calculate the final total of someone's cell phone bill.
 * Allow the operator to input the plan fee and the number of the overage minutes
 * charge the user 0.25 for every minute they were over their plan, and 15% tax on the subtotal.
 * Create seperate methods to calculate the tax, overage fees, and final total.
 * print the itemized bill.
 */

public class PhoneBillCalculator {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;

    public PhoneBillCalculator(){
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBillCalculator(int id){
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBillCalculator(int id, double baseCost, int allottedMinutes, int minutesUsed){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int minutes){
        allottedMinutes = minutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }

    public void setMinutesUsed(int minutes){
        minutesUsed = minutes;
    }

    public double calculateOverage(){
        if(minutesUsed <= allottedMinutes){
            return 0;
        }

        double overageRate = 0.25;
        double overageMinutes = minutesUsed - allottedMinutes;
        return overageMinutes * overageRate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        return taxRate * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $"
                + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $"
                + String.format("%.2f", calculateTax()));
        System.out.println("Total: $"
                + String.format("%.2f", calculateTotal()));
    }

    public static void main(String[] args) {
        PhoneBillCalculator bill = new PhoneBillCalculator(123456);
        bill.setMinutesUsed(1000);
        bill.printItemizedBill();


    }
}
