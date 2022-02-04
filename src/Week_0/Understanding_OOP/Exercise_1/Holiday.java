package Week_0.Understanding_OOP.Exercise_1;

import java.util.List;

public class Holiday {
    public String name, month;
    public int day;

    /**
     * Q1a Write a constructor for the class Holiday,
     * which takes a String representing the name,
     * an int representing the day,
     * and a String representing the month as its arguments,
     * and sets the class variables to these values
     */

    // Q1a Ans:
    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }

    /**
     * Q1b Write a method inSameMonth,
     * which compares two instances of the class Holiday,
     * and returns the Boolean value true if they have the same month,
     * and false if they do not.
     */

    // Q1b Ans:
    public boolean sameMonth(Holiday obj) {
        if (this.month == obj.month) {
            return true;
        }
        return false;
    }

    /**
     * Q1c Write a method avgDate which takes an array of base type Holiday as its argument,
     * and returns a double that is the average of the day variables in the Holiday instances in the array.
     * You may assume that the array is full (i.e. does not have any null entries).
     */

    // Q1c Ans:
    public static double avgDate(List<Holiday> arr) {
        double avgDate = 0.0;
        int sumTotal = 0;
        for (int i = 0; i < arr.size(); i++) {
            sumTotal += arr.get(i).day;
        }

        avgDate = (double) (sumTotal / arr.size());

        return avgDate;
    }
}

