public class RestaurantTest {
    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish();

//        dish.costInCents = 500;
//        dish.nameOfDish = "Pad Thai";
        dish.wouldRecommend = true;

//        System.out.println(dish.costInCents);
//        System.out.println(dish.nameOfDish);
//        System.out.println(dish.wouldRecommend);

        dish.eat();

        dish.setRestaurantDish("meatloaf");
        System.out.println(dish.getRestaurantDish());

    }


}


//    Add a main method and inside the method...
//        1) instantiate a RestaurantDish object called "dish"
//        2) assign values creative to each of the properties
//        3) print out each of the property values
//        4) test the eat() method by calling it


//-- SHORT ASSIGNMENT #2 (part 2) --
//        Refactor your RestaurantDish and RestaurantTest classes...
//        1) Change your public properties in your RestaurantDish class to private
//         2) Add getters and setters for these properties (write them manually then erase them and use IntelliJ to do this quickly)
//         3) Refactor code used in RestaurantTest to set and print these property values...
//         ...to use your getters and setters
//         4) Add a constructor method to RestaurantDish that will assign property...
//         ...values based on arguments passed into the constructor