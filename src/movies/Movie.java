package movies;

public class Movie {

    private String name;
    private String category;


    public Movie(String newName, String newCategory) {
        name = newName;
        category = newCategory;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public String setName(String newName) {
        return this.name = newName;
    }

    public String setCategory(String newCategory) {
        return this.category = newCategory;
    }

}

