package School;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School();

        school.addStudent("Kim");
        school.addStudent("Emdro");
        school.addTeacher("Mr. Arniego");
        school.createClass("Math 101");

        school.displayInfo();

        System.out.println("\nRemoving a student...");
        school.removeStudent("Emdro");

        school.displayInfo();
    }
}
