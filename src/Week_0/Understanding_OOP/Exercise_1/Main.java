package Week_0.Exercise_1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        /**
         * Q1d Write a piece of code that creates a Holiday instance with the name “Independence Day”,
         * with the day “4”, and with the month “July”.
         */

        // Q1d Ans:
        Holiday indepenceDay = new Holiday("Independence Day", 4, "July");

        // For Testing Purpose
        Holiday christmas = new Holiday("Christmas", 25, "December");


        Holiday newYear = new Holiday("New Year", 1, "January");

        System.out.println(christmas.sameMonth(newYear));

        List<Holiday> holidays = List.of(christmas, newYear, indepenceDay);
        System.out.println(Holiday.avgDate(holidays));
    }
}
