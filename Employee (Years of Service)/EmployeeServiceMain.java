package Employee (Years of Service);

import java.time.LocalDate;
public class EmployeeServiceMain {
    public static void main(String[] args) {
        // Create employee objects
        
        Employee emp1 = new Employee("Alice", 50000, LocalDate.of(2018, 3, 15));
        Employee emp2 = new Employee("Bob", 45000, LocalDate.of(2020, 8, 10));
        Employee emp3 = new Employee("Charlie", 60000, LocalDate.of(2015, 1, 20));

        // Display info for each employee
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        
    }
}