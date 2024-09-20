import java.util.*;
public class Employee_to_accept {
    private int empId;
    private String empName;
    private double basicSalary;
    private double grossSalary;
    private static final Scanner scanner = new Scanner(System.in);
    public Employee_to_accept() {
        System.out.print("Enter employee ID: ");
        this.empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter employee name: ");
        this.empName = scanner.nextLine();
        System.out.print("Enter basic salary: ");
        this.basicSalary = scanner.nextDouble();
        calculateGrossSalary(); }
    private void calculateGrossSalary() {
        this.grossSalary = this.basicSalary + (this.basicSalary * 0.20); }
    public void displayDetails() {
        System.out.println("\nEmployee ID: " + this.empId);
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Gross Salary: " + this.grossSalary); }
    public static void main(String[] args) {
        Employee_to_accept employee = new Employee_to_accept();
        employee.displayDetails();
    }
}
