import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person("defaultName");
        }

        System.out.println(people[0]);


        System.out.println(Arrays.toString(people));

        people[0].setName("Luke Skywalker");
        people[1].setName("Han Solo");
        people[2].setName("Jabba the Hutt");

        System.out.println(people[0].getName());

        for (Person person : people ) {
            System.out.println(person.getName());
        }

    }




}
