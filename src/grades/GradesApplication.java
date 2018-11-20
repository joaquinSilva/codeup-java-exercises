package grades;

import java.util.HashMap;
import util.Input;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Input input = new Input(sc);
        Input sc = new Input();
        HashMap<String, Student> students = getUsers();
        userGreeting(students, sc);
    }

    public static HashMap<String, Student> getUsers() {

        Student Joaquin = new Student("Joaquin");
        Joaquin.addGrade(25);
        Joaquin.addGrade(50);
        Joaquin.addGrade(25);
        Joaquin.addGrade(100);

        Student Justin = new Student("Justin");
        Justin.addGrade(100);
        Justin.addGrade(90);
        Justin.addGrade(60);
        Justin.addGrade(85);


        Student Pibo = new Student("Pibo");
        Pibo.addGrade(15);
        Pibo.addGrade(30);
        Pibo.addGrade(25);
        Pibo.addGrade(55);

        Student Steven = new Student("Steven");
        Steven.addGrade(95);
        Steven.addGrade(85);
        Steven.addGrade(90);
        Steven.addGrade(100);

        HashMap<String, Student> students = new HashMap<>();

        students.put("SILVAj", Joaquin);
        students.put("jreich", Justin);
        students.put("piboIsAwesome", Pibo);
        students.put("JiuJitsuSteven", Steven);

        return students;
    }

    public static void getCurrentUsers(HashMap<String, Student> nameOfHashMap) {
        for (String name: nameOfHashMap.keySet()){
            String key = name;
            System.out.format("|%s|   ", key);
        }
    }

    public static void userGreeting(HashMap<String, Student> nameOfHashMap, Input sc) {
//        https://stackoverflow.com/questions/5920135/printing-hashmap-in-java
        System.out.format("%nWelcome! %n%nHere are the github usernames of our students:%n%n");
        getCurrentUsers(nameOfHashMap);
        seeStudentInfo(nameOfHashMap, sc);
    }

//    with the seeAnotherStudent() method, if the user chooses to see another student, this method will pass
//    further execution of the application to the seeStudentInfo() method. If the user does not choose to see another
//    student, then the application ends and closes out here with a goodbye message.
    public static void seeAnotherStudent(HashMap<String, Student> nameOfHashMap, Input sc) {

        System.out.println("\nWould you like to see another student [y / n]");
        String userInput = sc.getString();

        if (userInput.equals("y")) {
            getCurrentUsers(nameOfHashMap);
            seeStudentInfo(nameOfHashMap, sc);
        } else if (userInput.equals("n")) {
            System.out.println("Goodbye! Have a wonderful Thanksgiving!");
        }
    }

//    Once the seeStudentInfo() method has either returned the info of a student to the user or detected that the user
//    input does not match a student in the Hashmap, then this method will pass further execution of the application
//    to the seeAnotherStudent() method.
    public static void seeStudentInfo(HashMap<String, Student> nameOfHashMap, Input sc) {
        System.out.format("%n%nWhat student would you like to see information on?%n%n");
        String userInput = sc.getString();
        Student see = nameOfHashMap.get(userInput);
        if (!nameOfHashMap.containsKey(userInput)) {
            System.out.format("Sorry, no student found with the gihub username of %s.%n%n", userInput);
            seeAnotherStudent(nameOfHashMap, sc);
        } else {
            System.out.format("Name: %s - Github username: %s%nCurrentAverage: %f", see.getName(),
                    userInput, see.getGradeAverage());
            seeAnotherStudent(nameOfHashMap, sc);
        }
    }



}
