package Week_0.SandBox.Java_Fundamentals.Exercise_4;

import java.util.Locale;
import java.util.Scanner;

/**
 * Make an array that holds the textual values of the day of the week
 * have the user input a number corresponding to the day of the week
 * your program should output the string that represents the day of the week
 * Example: User inputs the number 1, your program should print "Monday"
 */
public class DayOfTheWeek {
    public static String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        DayOfTheWeek dayOfTheWeek = new DayOfTheWeek();
        String dayString = dayOfTheWeek.getDayString();

        if (dayString == "0")
            System.out.println("Day string not found");
         else
            System.out.println(dayString);

        scanner.close();
    }

    public String getDayString() {
        System.out.println("Provide an integer representation of the day you want");
        int intDay = scanner.nextInt();
        int i;
        for (i = 0; i < days.length; i++) {
            if ((i+1) == intDay) {
                return days[i];
            }
        }
        return "0";
    }
}