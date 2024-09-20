package Interface;
import java.util.*;
interface Gross {
    void calculateGrossSalary(); }
class Employee {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id; }
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name); } }
class Salary {
    double basicSalary;
    double hra;
    double da;
    Salary(double basicSalary, double hra, double da) {
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.da = da; }
    void displaySalaryDetails() {
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da); } }
class EmployeeSalaryDetails implements Gross {
    Employee employee;
    Salary salary;
    EmployeeSalaryDetails(Employee employee, Salary salary) {
        this.employee = employee;
        this.salary = salary; }
    public void calculateGrossSalary() {
        double grossSalary = salary.basicSalary + salary.hra + salary.da;
        System.out.println("Gross Salary: " + grossSalary); }
    void displayDetails() {
        employee.displayEmployeeDetails();
        salary.displaySalaryDetails();
        calculateGrossSalary(); } }
public class Multiple_Inheritance_Gross_Interface_Employee_Salary_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Employee ID:");
        int id = scanner.nextInt();
        System.out.println("Enter Basic Salary:");
        double basicSalary = scanner.nextDouble();
        System.out.println("Enter HRA:");
        double hra = scanner.nextDouble();
        System.out.println("Enter DA:");
        double da = scanner.nextDouble();
        Employee employee = new Employee(name, id);
        Salary salary = new Salary(basicSalary, hra, da);
        EmployeeSalaryDetails employeeSalaryDetails = new EmployeeSalaryDetails(employee, salary);
        employeeSalaryDetails.displayDetails(); }
}
