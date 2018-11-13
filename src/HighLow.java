import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {

        init();
    }

    public static void init () {

        int getNum = randomNum();
        userGuesses(getNum);
    }

    public static int randomNum() {

        int min = 1;
        int max = 100;
        int range = max - min + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void userGuesses(int getNum) {

        System.out.println("I'm thinking of a number between 1 and 100. Guess my number!");
        Scanner sc = new Scanner(System.in);
        int userGuess;
        int totalGuesses = 0;

        do {
            userGuess = sc.nextInt();
            totalGuesses++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Oops! That number is not between 1 and 100. Please try again.");
            } else if (totalGuesses == 10) {
                System.out.println("Oops! You've ran out of tries! Game over!");
            } else if (userGuess < getNum) {
                    System.out.println("HIGHER");
            } else if (userGuess > getNum) {
                    System.out.println("LOWER");
            } else if (userGuess == getNum) {
                    System.out.format("GOOD GUESS! It only took you %d tries!", totalGuesses);
                }

        } while ((!(userGuess == getNum)) && !(totalGuesses == 10));
    }
}


//    5. Game Development 101
//
//    Welcome to the world of game development!
//
//    You are going to build a high-low guessing game. Create a class named HighLow inside of src.
//
//    The specs for the game are:
//
//    Game picks a random number between 1 and 100.
//    Prompts user to guess the number
//    All user inputs are validated
//    If user's guess is less than the number, it outputs "HIGHER"
//    If user's guess is more than the number, it outputs "LOWER"
//    If a user guesses the number, the game should declare "GOOD GUESS!"
//    Hints
//
//    Use the random method of the java.lang.Math class to generate a random number.

//    Bonus
//
//    Keep track of how many guesses a user makes
//    Set an upper limit on the number of guesses
