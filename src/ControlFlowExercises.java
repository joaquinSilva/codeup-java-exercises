import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//1. Loop Basics

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//
//        } while (i < 102);

//        for (int i = 0; i < 102; i +=2) {
//            System.out.println(i);
//        }

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//
//        } while (i > -15);

//        for (int i = 100; i > -15; i -=5) {
//            System.out.println(i);
//        }

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//
//        } while (i < 1000000);

//        for (long i = 2; i < 1000000; i *=i) {
//            System.out.println(i);
//        }

//      2. Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.

//        for (int i = 1; i < 101; i += 1) {
//
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

//      3.  Display a table of powers.
//
//                Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an number to go up to!");
        int userInput = Integer.parseInt(sc.next());
        String header = "Here is your table! \n\n";
        header += "number  |  squared  |  cubed \n";
        header += "------  |  ------   |  ------\n";
        System.out.print(header);
        for (int j = 1; j <= userInput; j += 1 ) {
            int numSquared = (int)(Math.pow(j, 2));
            int numCubed = (int)(Math.pow(j, 3));
            System.out.format("%-5d   |  %-5d    |  %-5d %n", j, numSquared ,numCubed);
            if (j == 3) {
                System.out.println("Do you wish to continue?");
                String userResponse = sc.next();
                if (userResponse.equals("no")) {
                    break;
                }
            }
        }


//       4. Convert given number grades into letter grades.
//
//                Prompt the user for a numerical grade from 0 to 100.
        System.out.println("Please enter a numerical grade from 0 to 100!");

//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 59 - 0
//        Bonus
//
//        Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

    }
}



