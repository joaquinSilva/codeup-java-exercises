import java.util.Arrays;

public class ArraysExercises {

//    Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


    public static Person[] addPerson(Person[] arrayofPeople, Person aPerson) {
        Person[] newArray = Arrays.copyOf(arrayofPeople, arrayofPeople.length + 1);
        newArray[newArray.length - 1] = aPerson;
        return newArray;

    }

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person("defaultName");
        }

//        System.out.println(people[0]);
//
//
//        System.out.println(Arrays.toString(people));

        people[0].setName("Luke Skywalker");
        people[1].setName("Han Solo");
        people[2].setName("Jabba the Hutt");

//        System.out.println(people[0].getName());

//        for (Person person : people ) {
//            System.out.println(person.getName());
//        }

        Person c3po = new Person("C3P0");

//        System.out.println(Arrays.toString(addPerson(people, c3po)));

        Person[] newArray = (addPerson(people, c3po));
        for (Person person : newArray) {
            System.out.println(person.getName());
        }


    }




}
