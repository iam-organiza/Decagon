package Week_0.Java_Fundamentals.Exercise_4.Cake;

/**
 * Create a super class called Cake that has two fields:
 * flavor and price, and a constructor that accepts the flavor.
 * Getters and Setters methsds should be created for the fields
 *
 * Create a BirthCake class which inherits from Cake and has a fieldcalled candles.
 * its constructor should set the flavor. Include getter and setter method.
 *
 * Create WeddingCake class which inherits from Cake and has a field called tiers.
 * Its constructor should set the flavor.
 * Include getter and setter method
 *
 * Create a TasteTester class to test out your inheritance by printing the flavor and price of these types of cakes.
 */
public class TasteTester {
    public static void main(String[] args) {
        WeddingCake weddingCake = new WeddingCake();
        System.out.println(weddingCake.getFlavor());
        System.out.println(weddingCake.getPrice());
        System.out.println(weddingCake.getTiers());

        System.out.println("------");

        BirthdayCake birthdayCake = new BirthdayCake("Strawberry", 400, 20);
        System.out.println(birthdayCake.getFlavor());
        System.out.println(birthdayCake.getPrice());
        System.out.println(birthdayCake.getCandles());
    }
}
