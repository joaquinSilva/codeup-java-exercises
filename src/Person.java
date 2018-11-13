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
        System.out.format("Greetings from Earth, %s!", this.name);
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
    }

}
