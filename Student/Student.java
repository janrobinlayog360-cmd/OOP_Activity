package Student;

import java.util.ArrayList;

class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " added for " + name);
    }

    public void removeCourse(String course) {
        courses.remove(course);
        System.out.println(course + " removed for " + name);
    }

    public void displayInfo() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
    
}
