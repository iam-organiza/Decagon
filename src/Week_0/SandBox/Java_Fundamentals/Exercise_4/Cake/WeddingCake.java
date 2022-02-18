package Week_0.Java_Fundamentals.Exercise_4.Cake;

public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake() {
        this.tiers = 3;
    }

    public WeddingCake(int tiers) {
        this.tiers = tiers;
    }

    public int getTiers() {
        return this.tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
