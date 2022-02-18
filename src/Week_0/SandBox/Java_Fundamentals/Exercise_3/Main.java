package Week_0.SandBox.Java_Fundamentals.Exercise_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// Q. Create a program that ask a user for a season of the year,
// then a whole number,
// then an adjective.
// Use the input to complete the sentence below.
// "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee"
public class Main {

    public static void main(String[] args) {
        // 1. Ask user for a season of the year.
        System.out.println("Please provide a seson of the year (e.g Spring, Summer, Fall, Winter). ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // Personal twerk to restrict the type of seasons that are allowed :).
        // (Optional code starts here)
        ArrayList<String> seasons = new ArrayList<>(List.of("spring", "summer", "fall", "winter"));
        while(!seasons.contains(season.toLowerCase(Locale.ROOT))) {
            System.out.println("Wrong input format use one of this: " + seasons);
            season = scanner.next();
        }
        // (Optional code ends here)

        // 2. Get a whole number
        System.out.println("Minimum of coffees you take during " + season + " ? ");
        int wholeNumber = scanner.nextInt();

        // 3. Get an adjective.
        System.out.println("How would you describe " + season + " in a word ? ");
        String adjective = scanner.next();
        scanner.close();

        // 4. Output the template string: "On a [adjective] [season of the year] day, I drink a minimum of [whole number] cups of coffee"
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee");
    }

}

