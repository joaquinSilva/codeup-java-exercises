package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = getUsers();
        userGreeting(students);


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
        Pibo.addGrade(90);
        Pibo.addGrade(100);
        Pibo.addGrade(80);
        Pibo.addGrade(75);

        Student Steven = new Student("Steven");
        Pibo.addGrade(95);
        Pibo.addGrade(85);
        Pibo.addGrade(90);
        Pibo.addGrade(100);

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

    public static void userGreeting(HashMap<String, Student> nameOfHashMap) {
//        https://stackoverflow.com/questions/5920135/printing-hashmap-in-java
        System.out.format("%nWelcome! %n%nHere are the github usernames of our students:%n%n");
        getCurrentUsers(nameOfHashMap);
        System.out.format("%n%nWhat student would you like to see information on?%n%n%n");

    }


}
