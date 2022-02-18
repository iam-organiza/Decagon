package Week_0.SandBox.Java_Fundamentals.Exercise_4;

/**
 * The Objective of this game is to travel the entire game board of 20 spaces within 5 die rolls.
 * - Roll the die for the user (generate a random number between 1 - 6)
 * and advance the user that number of spaces on the game board.
 * After each roll, tell the user which game space they are on how many spaces they have to go to win
 * Repeat this 4 additional times for 5 rolls in total
 * However, if the user gets to 20 before 5 rolls, end the game - they won.
 * If they are greater than or less than 20 spaces exactly, they lose
 * Remember there are only 20 spaces on the board, so a message like "you advance to space 22" is a bug
 */
public class RollTheDieGame {

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.floor(Math.random()*((max - min) + 1)) + min);
    }

    public static void main(String[] args) {
        Integer boardSpaces = 20;
        int numberOfRolls = 5;
        boolean won = false;

        // 1. Generate a random number between 1 - 6
        int min = 1;
        int max = 6;
        int randomNumber = getRandomNumber(min, max);

        // 2. Roll 5 times
        for (int j = 0; j < numberOfRolls; j++) {
            // 3. Subtract random number from board spaces
            boardSpaces -= randomNumber;

            // 4. Check if board spaces is exactly 0 or is less than 0 to know if board spaces has been exhausted
            //    and break to end the game and declare the user winner.
            if (boardSpaces.equals(0) || boardSpaces < 0) {
                won = true; // Declaring user the winner
                System.out.println("You won!");
                break;
            } else { // 5. Else print out n number of spaces the user has used
                System.out.println("You are on game space " + randomNumber);
            }
            randomNumber = getRandomNumber(min, max); // Update random number so the loop does not run forever
        }

        if (!won) { // if won equals false after the game finishes then let the user know they have lost the Roll the die game
            System.out.println("OOps! you lost this round");
        }
    }

}
