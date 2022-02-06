package Week_0.Java_Fundamentals.Exercise_4.Cake;

public class Cake {
    private String flavor;
    private int price;

    public Cake() {
        this.flavor = "Vanilla";
        this.price = 250;
    }

    public Cake(String flavor, int price) {
        this.flavor = flavor;
        this.price = price;
    }

    public String getFlavor() {
        return this.flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
