package Week_0.Java_Fundamentals.Exercise_4.Farm;

/**
 * Create an abstract class called Animal, which declares an abstract
 * method called makeSound(), and implements anon-abstract method called eat().
 *
 * Create a Pig class and a Duck class that both extend the animal class.
 *
 * Create a Farm class to test the implementations.
 */
public class Farm {

    public static void main(String[] args) {
        Animal animal = new Pig();
        animal.eat();
        animal.makeSound();

        animal = new Duck();
        animal.eat();
        animal.makeSound();
    }

}
