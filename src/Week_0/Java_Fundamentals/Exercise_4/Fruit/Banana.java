package Week_0.Java_Fundamentals.Exercise_4.Fruit;

public class Banana extends Fruit {

    public Banana() {
        this.setCalories(15);
    }

    public void peel() {
        System.out.println("Peeled and ready");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana Juice is ready");
    }
}
