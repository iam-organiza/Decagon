package Week_0.Java_Fundamentals.Exercise_4.Fruit;

public class Apple extends Fruit {

    public Apple() {
        this.setCalories(35);
    }

    public void removeSeeds() {
        System.out.println("Seeds removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple Juice is ready");
    }
}
