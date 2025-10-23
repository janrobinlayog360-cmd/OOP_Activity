package School;

import java.util.ArrayList;

public class School {
    private ArrayList<String> students;
    private ArrayList<String> teachers;
    private ArrayList<String> classes;

    public School() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
        System.out.println(student + " added as a student.");
    }

    public void removeStudent(String student) {
        students.remove(student);
        System.out.println(student + " removed from students.");
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
        System.out.println(teacher + " added as a teacher.");
    }

    public void removeTeacher(String teacher) {
        teachers.remove(teacher);
        System.out.println(teacher + " removed from teachers.");
    }

    public void createClass(String className) {
        classes.add(className);
        System.out.println("Class created: " + className);
    }

    public void displayInfo() {
        System.out.println("\n--- School Information ---");
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classes);
    }
}
