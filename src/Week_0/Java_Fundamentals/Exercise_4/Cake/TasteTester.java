package Week_0.Java_Fundamentals.Exercise_4.Cake;

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
