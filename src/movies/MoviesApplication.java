package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {

        init();


    }

    private static void init() {
//        add conditional if else statements here to give prompts and run methods in response to user inputs

        System.out.format("%nHello! Welcome to our movie database. What would you like to do?%n%n" +
                "      0 - exit\n" +
                "      1 - view all movies\n" +
                "      2 - view movies in the animated category\n" +
                "      3 - view movies in the drama category\n" +
                "      4 - view movies in the horror category\n" +
                "      5 - view movies in the scifi category\n" +
                "      6 - add movie");




//        Input.getInt();




//        Movie[] allMoviesArray = MoviesArray.findAll();
//
//        showAllMovies(allMoviesArray);
//
//        showAnimatedCategory(allMoviesArray);
//
//        showDramaCategory(allMoviesArray);
//
//        showHorrorCategory(allMoviesArray);
//
//        showScifiCategory(allMoviesArray);
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

    public static void showAllMovies(Movie[] movieArray) {
        for (Movie movie : movieArray) {
            System.out.format("%n%s -- %s", movie.getCategory(), movie.getName());
        }
    }


    public static void showAnimatedCategory(Movie[] movieArray) {
        int animated = 0;
        for (Movie movie : movieArray) {
            if (movie.getCategory().equals("animated")) {
                System.out.format("%n%s -- %s", movie.getCategory(), movie.getName());
            }
        }
    }


    public static void showDramaCategory(Movie[] movieArray) {
        int animated = 0;
        for (Movie movie : movieArray) {
            if (movie.getCategory().equals("drama")) {
                System.out.format("%n%s -- %s", movie.getCategory(), movie.getName());
            }
        }
    }

    public static void showHorrorCategory(Movie[] movieArray) {
        int animated = 0;
        for (Movie movie : movieArray) {
            if (movie.getCategory().equals("horror")) {
                System.out.format("%n%s -- %s", movie.getCategory(), movie.getName());
            }
        }
    }

    public static void showScifiCategory(Movie[] movieArray) {
        int animated = 0;
        for (Movie movie : movieArray) {
            if (movie.getCategory().equals("scifi")) {
                System.out.format("%n%s -- %s", movie.getCategory(), movie.getName());
            }
        }
    }


//
//    public static Movie[] addNewMovie(Person[] arrayofPeople, Person aPerson) {
//        Person[] newArray = Arrays.copyOf(arrayofPeople, arrayofPeople.length + 1);
//        newArray[newArray.length - 1] = aPerson;
//        return newArray;
//
//    }






}
