import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

//        Create a class named Bob with a main method for the following exercise.
//
//                Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//        He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//        He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//        He answers 'Whatever.' to anything else.
//        Write the Java code necessary so that a user of your command line application can have a conversation with Bob.

        Scanner sc = new Scanner(System.in);


        System.out.println("Hi. I'm Bob.");
        String userInput;
        do {
            userInput = sc.nextLine();
            String BobResponse = "Whatever.";
            if (userInput.endsWith("?")) {
                BobResponse = "Sure.";
            } else if (userInput.endsWith("!")) {
                BobResponse = "Whoa, chill out!";
            } else if (userInput.equals("")) {
                BobResponse = "Fine. Be that way!";
            }
            System.out.println(BobResponse);
        } while (!userInput.equals("bye"));
    }
}
