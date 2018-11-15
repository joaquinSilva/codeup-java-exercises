package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {

    public static Movie[] allMoviesArray = MoviesArray.findAll();

    public static void main(String[] args) {
        init();
    }

    private static void init() {
//        add conditional if else statements here to give prompts and run methods in response to user inputs

        useMenu();

    }


//    Use your Input class to get input from the user, and display information based on their choice.
//    (Remember to import your Input class)
//    If a category is selected, only movies from that category should be displayed.
//    Your application should continue to run until the user chooses to exit.
//

//
//    What would you like to do?
//
//      0 - exit
//      1 - view all movies
//      2 - view movies in the animated category
//      3 - view movies in the drama category
//      4 - view movies in the horror category
//      5 - view movies in the scifi category
//      6 - add movie
//
//    Enter your choice: 1
//
//    Frankenstein -- horror
//    Goodfellas -- drama
//    Pulp Fiction -- drama

    //    Bonus
//
//    Add functionality to allow a user to add a new movie to the list.
//...

//This overloaded method shows all movies if only a movie array is passed as an argument.
    public static void showMovies(Movie[] movieArray) {
        for (Movie movie : movieArray) {
            System.out.format("%n%s -- %s", movie.getCategory(), movie.getName());
        }
    }


//This overloaded method shows all the movies from a specific category if a category is passed in as a 2nd argument.
    public static void showMovies(Movie[] movieArray, String category) {
        for (Movie movie : movieArray) {
            if (movie.getCategory().equals(category)) {
                System.out.format("%n%s -- %s", movie.getCategory(), movie.getName());
            }
        }
    }

    public static String showMenu() {

        return ("%n%nHello! What would you like to do with our movie database?%n%n" +
                "      0 - exit\n" +
                "      1 - view all movies\n" +
                "      2 - view movies in the animated category\n" +
                "      3 - view movies in the drama category\n" +
                "      4 - view movies in the horror category\n" +
                "      5 - view movies in the scifi category\n" +
                "      6 - view movies in the musical category\n" +
                "      7 - add movie%n");
    }

    public static void useMenu() {
        System.out.format(showMenu());
        Scanner sc = new Scanner(System.in);
        Input input = new Input(sc);
        int userInput = input.getInt();


        if (userInput == 0) {
            System.out.println("Goodbye");
        } else if (userInput == 1) {
            showMovies(allMoviesArray);
            useMenu();
        } else if (userInput == 2) {
            showMovies(allMoviesArray, "animated");
            useMenu();
        } else if (userInput == 3) {
            showMovies(allMoviesArray, "drama");
            useMenu();
        } else if (userInput == 4) {
            showMovies(allMoviesArray, "horror");
            useMenu();
        } else if (userInput == 5) {
            showMovies(allMoviesArray, "scifi");
            useMenu();
        } else if (userInput == 6) {
            showMovies(allMoviesArray, "musical");
            useMenu();
        } else if (userInput == 7) {
//            addNewMovie();
            useMenu();
        }

    }

//    public static Movie[] addNewMovie(Movie[] arrayofMovies, Movie aNewMovie) {
//        allMoviesArray = Arrays.copyOf(arrayofMovies, arrayofMovies.length + 1);
//        newArray[newArray.length - 1] = aNewMovie;
//        return newArray;
//
//    }






}
