package util;
import java.util.Scanner;

public class Input {


    private Scanner scanner;
//    private Scanner scanner = new Scanner(System.in);

//    public Input() {
//        scanner = new Scanner(System.in);
//
//    }

    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        System.out.println("would you like to continue?");
        String userInput = getString();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            return true;
        } else return false;
    }

    public int getInt(int min, int max) {
        System.out.println("Enter a number between the min and max!");
        int userInput;
        do {
            userInput = scanner.nextInt();
            System.out.println(userInput);
            if (userInput < min || userInput > max) {
                System.out.println("Oops! Your number is not valid. Please try again!");
            }
        } while (userInput < min || userInput > max);
        System.out.format("Great! You entered a valid number!");
        return userInput;

    }

    public int getInt() {

        return scanner.nextInt();

    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a number between the min and max!");
        double userDblInput;
        do {
            userDblInput = this.scanner.nextDouble();
            System.out.println(userDblInput);
            if (userDblInput < min || userDblInput > max) {
                System.out.println("Oops! Your number is not valid. Please try again!");
            }
        } while (userDblInput < min || userDblInput > max);
        System.out.format("Great! You entered a valid number!");
        return userDblInput;

    }

    public double getDouble() {
        return this.scanner.nextDouble();

    }

    public static void main(String[] args) {
//    Justin's way of creating the scanner'
//        input in - new Input(new Scanner(System.in));
//
        Scanner sc = new Scanner(System.in);

//        Input tools = new Input(new Scanner(System.in));

        Input tools = new Input(sc);
        Input tools1 = new Input(sc);
        Input tools2 = new Input(sc);

        tools.getInt(1, 6);

        System.out.println(tools.yesNo());
    }




}
