public class RestaurantDish {

    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public void eat() {
        System.out.println("Nom nom nom!");
    }


    public String setRestaurantDish(String nameOfDish) {
        return this.nameOfDish = nameOfDish;
    }

    public String getRestaurantDish() {
        return this.nameOfDish;
    }

    public boolean isWouldRecommend() {
        return this.wouldRecommend;
    }

    public boolean setWoulRecommend(boolean recommends) {
        return this.wouldRecommend = recommends;
    }

    public int getCostInCents() {
        return this.costInCents;
    }

    public int setCostInCents(int newPrice) {
        return this.costInCents = newPrice;
    }

}

//    Include an integer property called "costInCents"
//        Include a string property called "nameOfDish"
//        Include a boolean property called "wouldRecommend"
//        Include a method called "eat"
//        this method will print out "Nom nom nom!"