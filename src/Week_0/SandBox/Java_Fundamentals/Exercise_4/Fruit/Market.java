package Week_0.Java_Fundamentals.Exercise_4.Fruit;

/**
 * This class should contain a field called calories and method called makeJuice();
 * which prints a statement - something like "Juice is made" -just something generic
 *
 * Then create two subclasses of the fruit class, for example you can do Apple and Banana, whatever you like to do
 *
 * And then create methods within these classes that are specific to them.
 * So if you're going to do the Apple class, then do something like removeSeeds(). if you're going to do the Banana class,
 * then do something like peel
 *
 * And then set the calories within the constructors of these subclasses
 *
 * Override the makeJuice() method to print the specific type of juice that's going to be made.
 *
 * And then finally create a Market class which tests polymorphism by creating several variations of these objects.
 * */
public class Market {

    public static void main(String[] args) {
//        Apple apple = new Apple();
//        apple.removeSeeds();
//        apple.makeJuice();

        Fruit fruit = new Apple();
        ((Apple) fruit).removeSeeds();
        fruit.makeJuice();

        fruit = new Banana();
        ((Banana) fruit).peel();
        fruit.makeJuice();

    }
}
