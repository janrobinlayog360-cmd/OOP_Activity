package Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kim", "CEO", 150000);
        Employee emp2 = new Employee("Emdro", "Developer", 40000);

        emp1.displayInfo();
        emp2.displayInfo();

        emp2.updateSalary(5000);
        emp2.displayInfo();
    }
}