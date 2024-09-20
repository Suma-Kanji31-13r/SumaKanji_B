import java.util.*;
public class employee_with_data_members {
    private int empid;
    private String name;
    private double salary;

    // Constructor to initialize employee details
    public employee_with_data_members(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + empid + ", Name: " + name + ", Salary: $" + salary);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        employee_with_data_members[] employees = new employee_with_data_members[5]; // Array to store 5 Employee objects

        // Loop to accept data for 5 employees
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for employee " + (i + 1) + " (ID, Name, Salary):");
            int id = scanner.nextInt(); // Reading employee ID
            scanner.nextLine(); // Consuming the leftover newline
            String name = scanner.nextLine(); // Reading employee name
            double salary = scanner.nextDouble(); // Reading employee salary

            // Creating new Employee object and storing it in the array
            employees[i] = new employee_with_data_members(id, name, salary);
        }

        // Displaying the details of all employees
        System.out.println("Employee Details:");
        for (employee_with_data_members emp : employees) {
            emp.display();
        }
    }
}
