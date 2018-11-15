import static java.lang.Math.random;

public class ServerNameGenerator {

//    Create two arrays whose elements are strings, one with at least 10 adjectives, another with at least 10 nouns.
//    Create a method that will return a random element from an array of strings.
//    Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.


    static String[] adjectives = {"blue", "cold", "red", "hot", "yellow", "soft", "fast", "", "hollow", "full"};
    static String[] nouns = {"house", "car", "bird", "feet", "desk", "computer", "television", "baby", "sky", "bear"};




    public static int randomNum(int min, int max) {

        return (int)(Math.random() * max ) + min;
    }

    public static String getRandomElement(String[] stringArray) {
        return stringArray[randomNum(0, 9)];

    }

    public static void main(String[] args) {

        String hyphenatedElements = getRandomElement(adjectives) + "-" + getRandomElement(nouns);

        System.out.println(hyphenatedElements);

    }

}
