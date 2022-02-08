package Week_0.Java_Fundamentals.Exercise_4;

import java.util.Random;
import java.util.random.RandomGenerator;

/**
 * Write the following statement and execute
 *
 * int c = 30/0;
 *
 * Update program to handle exception
 *
 * Print a statement after division to say "Division is fun". This statement should be outputted no matter what.
 */
public class DividingByZero {

    public static double divideByZero() throws ArithmeticException {
        return 30/0;
    }

    public static void main(String[] args) {
        try {
            System.out.println(divideByZero());
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println("Error! you can not divide by zero ("+e.getMessage()+")");
        } finally {
            System.out.println("Division is fun");
        }

        Random random = new Random();
        System.out.println(random.nextInt(10000, 99999));
    }
}
