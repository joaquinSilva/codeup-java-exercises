import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

//        String message = "We don't need no education\nWe don't need no thought control";
//        System.out.println(message);

//        String message = "Check \"this\" out!, \"s inside of \"s!";
//        System.out.println(message);

//        String message = "In windows, the main drive is actually C:\\";
//        System.out.println(message);

//        String message = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
//        System.out.println(message);

        String message = "\nWe don't need no education\nWe don't need no thought control\n\n";
        message += "Check \"this\" out!, \"s inside of \"s!\n\n";
        message += "In windows, the main drive is actually C:\n\n";
        message += "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
        System.out.println(message);

    }
}
