package util;
import java.util.Scanner;

class OutOfRangeException extends Exception {}

public class Input {


    private Scanner sc;
//    private Scanner scanner = new Scanner(System.in);

//    public Input() {
//        scanner = new Scanner(System.in);
//
//    }

    public Input() {
        sc = new Scanner(System.in).useDelimiter("\n");
    }

//    public Input(Scanner sc) {
//        this.sc = scanner;
//    }

    public String getString() {
        return sc.nextLine();
    }

    public boolean yesNo() {
        System.out.println("would you like to continue?");
        String userInput = getString();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else return false;
    }

//    public int getInt(int min, int max) {
//        System.out.println("Please enter an integer between " + min + " and " + max + "!");
//        int userInput;
//        do {
//            userInput = scanner.nextInt();
//            System.out.println(userInput);
//            if (userInput < min || userInput > max) {
//                System.out.println("Oops! Your number is not valid. Please try again!");
//            }
//        } while (userInput < min || userInput > max);
//        System.out.format("Great! You entered a valid number!");
//        return userInput;
//
//    }
//refactored getInt(int min, int max) with try and catch exceptions
    public int getInt(int min, int max) {
        System.out.println("Please enter an integer between " + min + " and " + max + "!");
        int userInput;
        try {
            userInput = Integer.valueOf(getString());
            if (userInput < min || userInput > max)
                throw new OutOfRangeException();
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid integer");
            userInput = getInt(min, max);

        } catch (OutOfRangeException e) {
            System.out.println("Oops! Your number is within range.");
            userInput = getInt(min, max);
        }
        return userInput;
    }

    public int getInt() {
        System.out.println("Please enter an integer.");
        int input;
        try {
            input = Integer.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("Input is not a valid integer");
            input = getInt();
        }
        return input;

    }

//    public double getDouble(double min, double max) {
//        System.out.println("Enter a number between the min and max!");
//        double userDblInput;
//        do {
//            userDblInput = this.sc.nextDouble();
//            System.out.println(userDblInput);
//            if (userDblInput < min || userDblInput > max) {
//                System.out.println("Oops! Your number is not valid. Please try again!");
//            }
//        } while (userDblInput < min || userDblInput > max);
//        System.out.format("Great! You entered a valid number!");
//        return userDblInput;
//    }
//refactored getDouble(double min, double max) with try and catch exceptions
    public double getDouble(double min, double max) {
        System.out.println("Please enter an double precision number between " + min + " and " + max + "!");
        double userDblInput;
        try {
            userDblInput = Double.valueOf(getString());
            if (userDblInput < min || userDblInput > max)
                throw new OutOfRangeException();
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid integer");
            userDblInput = getDouble(min, max);
        } catch (OutOfRangeException e) {
            System.out.println("Oops! Your number is within range.");
            userDblInput = getDouble(min, max);
        }
        return userDblInput;
    }

    public double getDouble() {
        System.out.println("Please enter a double precision number.");
        double input;
        try {
            input = Double.valueOf(getString());
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid double precision number.");
            input = getDouble();
        }
        return input;

    }

    public static void main(String[] args) {
//    Justin's way of creating the scanner'
        Input sc = new Input();
//
//        Scanner sc = new Scanner(System.in);

//        Input tools = new Input(new Scanner(System.in));

//        Input tools = new sc(sc);
//        Input tools1 = new Input(sc);
//        Input tools2 = new Input(sc);

//        tools.getInt(1, 6);

//        System.out.println(tools.yesNo());

        sc.getDouble(2, 7);

    }




}
