package Week_0.Java_Fundamentals.Exercise_4.Cake;

public class BirthdayCake extends Cake {
    private int candles;

    public BirthdayCake() {
        this.candles = 10;
    }

    public BirthdayCake(int candles) {
        this.candles = candles;
    }

    public BirthdayCake(String flavour, int price, int candles) {
        super(flavour, price);
        this.candles = candles;
    }

    public int getCandles() {
        return this.candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
