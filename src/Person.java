public class Person {

    private String name;


    // returns the person's name
    public String getName() {
        return this.name;
    }
    // changes the name property to the passed value
    public String setName(String name) {
        return this.name = name;
    }
    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.format("Greetings from Earth, %s!%n", this.name);
    }

    private Person(String newName) {
        name = newName;
    }


    public static void main(String[] args) {

        Person joaquin = new Person("Joaquin Silva");
        System.out.println(joaquin.getName());

        joaquin.sayHello();

        joaquin.setName("Justin");

        joaquin.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }

}
