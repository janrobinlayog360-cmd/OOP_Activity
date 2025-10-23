package Student;
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Kim", "A");
        Student s2 = new Student("Emdro", "B");

        s1.addCourse("Math");
        s1.addCourse("Science");
        s1.displayInfo();

        s1.removeCourse("Math");
        s1.displayInfo();

        s2.addCourse("English");
        s2.displayInfo();
    }
}