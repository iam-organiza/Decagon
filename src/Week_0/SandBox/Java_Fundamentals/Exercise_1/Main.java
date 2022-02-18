package Week_0.SandBox.Java_Fundamentals.Exercise_1;

import java.util.Scanner;

/**
 * Q1. Setup your environment for Java Programming.
 * Q2. Write a program that first tells the user welcome to my workstation,
 * ask the user to enter his or her name and display welcome [user name].
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Q2 Ans:
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my workstation");
        System.out.println("please enter your name");

        String name = input.next();
        System.out.println("Welcome " + name);
    }
}
