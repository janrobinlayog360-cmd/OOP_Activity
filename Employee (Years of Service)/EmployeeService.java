package Employee (Years of Service);

import java.time.LocalDate;
import java.time.Period;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Calculate years of service
    public int getYearsOfService() {
        return Period.between(hireDate, LocalDate.now()).getYears();
    }

    // Display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₱" + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsOfService());
        System.out.println("------------------------");
    }
}