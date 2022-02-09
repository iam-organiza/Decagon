package Week_0;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ObjectRelationship {

    /**
     * Inheritance:
     *
     * Inheritance is “IS-A” type of relationship.
     * “IS-A” relationship is a totally based on Inheritance,
     * which can be of two types Class Inheritance or Interface Inheritance.
     * Inheritance is a parent-child relationship where we create a new class by using existing class code.
     * It is just like saying that “A is type of B”. For example is “Apple is a fruit”, “Ferrari is a car”.
     *
     *
     * Composition:
     *
     * Composition is a "part-of" relationship.
     * Simply composition means use of instance variables that are references to other objects.
     * In composition relationship both entities are interdependent of each other for example “engine is part of car”,
     * “heart is part of body”.
     *
     *
     * Association:
     *
     * Association is a “has-a” type relationship.
     * Association establish the relationship between two classes using through their objects.
     * Association relationship can be one to one,
     * One to many, many to one and many to many.
     * For example suppose we have two classes then these two classes are said
     * to be “has-a” relationship if both of these entities share each other’s
     * object for some work and at the same time they can exist without
     * each other's dependency or both have their own lifetime.
     *
     *
     * Aggregation
     *
     * Aggregation is based is on "has-a" relationship.
     * Aggregation is a special form of association.
     * In association there is not any classes (entity) work as owner but in aggregation one entity work as owner.
     * In aggregation both entities meet for some work and then get separated.
     * Aggregation is a one way association.
     *
     *
     * Generally, these four types of relationships (Inheritance, Composition, Association and Aggregation) are used in OOP.
     */

    public static String substring(String string, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += string.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome (String string) {

        String palindrome = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            palindrome += string.charAt(i);
        }

        if (string.equals(palindrome)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Provide an Integer: ");
        // Integer n = scanner.nextInt();

        // One method
        // System.out.println(n.toString());

        // Second method
        // String result = n + "";
        // System.out.println(result);

        // System.out.println("Provide a string: ");
        // String string = scanner.next();

        // System.out.println("Provide a start: ");
        // int start = scanner.nextInt();

        // System.out.println("Provide an end: ");
        // int end = scanner.nextInt();


        // First method
        // System.out.println("Result: " + string.substring(start, end));

        // Second method
        // System.out.println("Result: " + substring(string, start, end));


        System.out.println("Provide a string(palindrome): ");
        String string = scanner.next();
        scanner.close();

        System.out.println(isPalindrome(string));

    }

}
