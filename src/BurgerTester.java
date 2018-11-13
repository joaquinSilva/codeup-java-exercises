public class BurgerTester {
    public static void main(String[] args) {

        BurgerTools dblPatty = new BurgerTools();

        dblPatty.averageDaysBeforeExpiration = 15;
        dblPatty.mostPopularTopping = "ketchup";
        dblPatty.temperatureWhenCooked = 350;
        dblPatty.grill();

        System.out.println(dblPatty.temperatureWhenCooked);

    }
}
