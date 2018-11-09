import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(12, 3));
//        System.out.println(subtraction(12, 3));
//        System.out.println(multiplication(12, 3));
//        System.out.println(division(12, 3));
//        System.out.println(modulus(12,3));

//        int userInput = getInteger(12, 30);
//        System.out.println(userInput);

//        System.out.println(getFactorial());

        gambling();

    }

    public static int addition(int num1, int num2) {
        return (num1 + num2);
    }

    public static int subtraction(int num1, int num2) {
        return (num1 - num2);
    }

//    public static int multiplication(int num1, int num2) {
//        int finalNumber = 0;
//        for (int i = 0; i < num2; i++) {
//        finalNumber += num1;
//        }
//        return finalNumber;
//    }

    public static int multiplication(int num1, int num2) {

        if (num2 == 1) {
            return num1;
        }
        System.out.println("recur");
//        return 2 + multiplication(2, (4));
//                      2 + multiplication(2, (3));
//                          2 + multiplication(2, (2));
//                              2 + multiplication(2, (1));
//                                  + 2

        return num1 + multiplication(num1, num2 - 1);

    }

    public static int division(int num1, int num2) {
        return (num1 / num2);
    }

    public static int modulus(int num1, int num2) {
        return (num1 % num2);
    }

//  2. Create a method that validates that user input is in a certain range
//
//    The method signature should look like this:
//
//    public static int getInteger(int min, int max);

//    and is used like this:
//
//            System.out.print("Enter a number between 1 and 10: ");
//    int userInput = getInteger(1, 10);

//    If the input is invalid, prompt the user again.
//    Hint: recursion might be helpful here!

    public static int getInteger(int min, int max) {

        Scanner sc = new Scanner(System.in);
        System.out.format("Enter a number between %d and %d: ", min, max);
        int userNum = sc.nextInt();
        if (userNum < min || userNum > max) {
            return getInteger(min, max);
        }
        return userNum;
    }




//    3. Calculate the factorial of a number.

//    4! = 4(3)(2)(1) = 24
//    5! = 5(4)(3)(2)(1) = 120

//    Prompt the user to enter an integer from 1 to 10.
//    Display the factorial of the number entered by the user.
//    Ask if the user wants to continue.
//    Use a for loop to calculate the factorial.
//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
//    Factorials are denoted by the exclamation point (n!). Ex:

    public static long getFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a whole number from 1 to 10!");
        int userFactorial = sc.nextInt();
        long factorial = 1;
        System.out.format("You entered the number %d%n%n", userFactorial);
        if (userFactorial < 1 || userFactorial > 10) {
            return getFactorial();
        }
        System.out.println("Do you want to continue? [y/n]");
        String userContinue = sc.next();
        if (userContinue.equals("y")) {
            for (int i = 1; i <= userFactorial; i++) {
                factorial *= i;
            }
        } else {
            return userFactorial;
        }
        System.out.format("The factorial of your number is:%n%n");
        return factorial;
    }

//    BONUS
//    Test the application and find the integer for the highest factorial that can be accurately calculated by this application, then modify the prompt so that it prompts the user for a number "from 1 to {the highest integer that returns accurate factorial calculation}". Don’t forget to change your verification too!
//    Use Recursion to implement the factorial.

//    4. Create an application that simulates dice rolling.
//
//    Ask the user to enter the number of sides for a pair of dice.
//    Prompt the user to roll the dice.
//"Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
//            Use static methods to implement the method(s) that generate the random numbers.
//    Use the .random method of the java.lang.Math class to generate random numbers.

//    https://www.geeksforgeeks.org/java-math-random-method-examples/

    public static int gambling() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sides on a pair of dice.");
        int min = 1;
        int max = sc.nextInt();
        int range = max - min + 1;
        int dice1 = (int)(Math.random() * range) + min;
        int dice2 = (int)(Math.random() * range) + min;
        System.out.println("Would you like to roll the dice? [y/n]");
        String rollsDice = sc.next();
        if (rollsDice.equals("y")) {
            System.out.format("Your results are %d and %d!%n%n", dice1, dice2);
            System.out.println("Would you like to roll the dice again?");
            String rollsDiceAgain = sc.next();
            if (rollsDiceAgain.equals("y")) {
                gambling();
            }
        }
        return 0;
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





}
