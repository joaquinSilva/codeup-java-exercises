package grades;

import java.util.HashMap;

public class GradesApplication {


    


    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

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

        students.put("SILVAj", Joaquin);
        students.put("jreich", Justin);
        students.put("piboIsAwesome", Pibo);
        students.put("JiuJitsuSteven", Steven);


        System.out.println(students.get("SILVAj").getName());
        System.out.println(students.get("SILVAj").getGrades());

    }


}
