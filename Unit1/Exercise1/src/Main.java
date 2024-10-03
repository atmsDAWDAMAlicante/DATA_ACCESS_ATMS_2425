import java.lang.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Student LuisGarcia = new Student("Luis García", 5);
        Student ManoloPerez = new Student("Manolo Pérez", 2);
        Student MariaLopez = new Student("María López", 7);

        System.out.println("Nota de " + LuisGarcia.getName() + " " + LuisGarcia.getGrade() + " Passed: " + LuisGarcia.Passed(LuisGarcia.getGrade()));
        System.out.println("Nota de " + ManoloPerez.getName() + " " + ManoloPerez.getGrade() + " Passed: " + ManoloPerez.Passed(ManoloPerez.getGrade()));

        Students Classroom = new Students();
        Classroom.setStudentsList(LuisGarcia);
        Classroom.setStudentsList(ManoloPerez);
        Classroom.setStudentsList(MariaLopez);
        System.out.println("The classroom has " + Classroom.getStudentsList() + " student/s");
        System.out.println("Who is the no. 1?: " + Classroom.studentAtPosition(1) + "... and, who is the no. 5?: " + Classroom.studentAtPosition(5));
        System.out.println("Average: " + Classroom.averageGrade());
    }

}
    class Student {

        // Fields
        private String name;
        private int grade;

        // Constructor
        public Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }

        // Getters && Setters
        public String getName() {
            return name;
        }

        public void setName(String value) {
            name = value;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int value) {
            grade = value;
        }

        //Methods
        public boolean Passed(int value) {
            if (value >= 5) { // Why IntelliJ says "simplify"?
                return true;
            } else {
                return false;
            }
        }

    }


class Students {

    // Fields
    private final ArrayList<Student> studentsList = new ArrayList<>(); // Why IntelliJ says that may be 'final'?

    // Getters && Setters
    public int getStudentsList() {
        // No length, no count
        return studentsList.size();
    }

    public void setStudentsList(Student oneStudent) {
        studentsList.add(oneStudent);
    }

    //Methods

    public String studentAtPosition(int position) {
        if (position > 0 && position <= studentsList.size()) {
            // Warning: get(int) don't use array[int]
            // .getName() to return a string
            return studentsList.get(position).getName();
        } else return null;
    }

    public float averageGrade()

    {
        float average = 0;
        if (studentsList.size() == 0) { // studentsList.isEmpty()
            return 0;
        } else {
            for (int i = 0; i < studentsList.size(); i++) {
                average += studentsList.get(i).getGrade();
            }
            return (average / studentsList.size());
        }
    }

}






