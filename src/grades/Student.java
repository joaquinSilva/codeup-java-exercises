package grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades;


    public Student(String newName) {
        this.name = newName;
        this.grades = new ArrayList<>();
    }


    // returns the student's name
    public String getName() {
        return name;
    }

    // returns the student's grades
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double listSize = this.grades.size();
        double averageGrade = 0;
        for (int i = 0; i < listSize; i++) {
            averageGrade += (this.grades.get(i));
        }
        return averageGrade / listSize;
    }

    public static void main(String[] args) {

//        Student Joaquin = new Student("Joaquin");
//        Joaquin.addGrade(25);
//        Joaquin.addGrade(50);
//        Joaquin.addGrade(25);
//
//
//        System.out.println(Joaquin.getGradeAverage());
//
//
//
//        Student Justin = new Student("Justin");
//        Justin.addGrade(100);
//        Justin.addGrade(90);
//        System.out.println(Justin.getGradeAverage());


    }
}
