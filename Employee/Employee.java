package Employee;

public class Employee {

    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Method to calculate bonus or raise
    public void updateSalary(double amount) {
        salary += amount;
        System.out.println(name + "'s salary updated by " + amount);
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}  

