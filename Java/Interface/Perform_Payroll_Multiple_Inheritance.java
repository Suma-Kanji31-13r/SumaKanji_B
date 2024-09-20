package Interface;
import java.util.*;
interface Employee2{
    void setDetails(String name, String id, double basicSalary);
    void displayDetails(); }
interface Payroll {
    void calculatePayroll(); }
class PermanentEmployee implements Employee2, Payroll {
    String name;
    String id;
    double basicSalary;
    double bonus;
    public void setDetails(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.bonus = 0.1 * basicSalary; }
    public void displayDetails() {
        System.out.println("Permanent Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id); }
    public void calculatePayroll() {
        double totalSalary = basicSalary + bonus;
        System.out.printf("Total Salary (with Bonus): %.2f\n", totalSalary); } }
class ContractualEmployee implements Employee2, Payroll {
    String name;
    String id;
    double basicSalary;
    double deduction;
    public void setDetails(String name, String id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.deduction = 0.05 * basicSalary; }
    public void displayDetails() {
        System.out.println("Contractual Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id); }
    public void calculatePayroll() {
        double totalSalary = basicSalary - deduction;
        System.out.printf("Total Salary (after Deduction): %.2f\n", totalSalary); } }
public class Perform_Payroll_Multiple_Inheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Permanent Employee:");
        System.out.print("Name: ");
        String permName = scanner.nextLine();
        System.out.print("ID: ");
        String permId = scanner.nextLine();
        System.out.print("Basic Salary: ");
        double permSalary = scanner.nextDouble();
        scanner.nextLine();
        PermanentEmployee permEmployee = new PermanentEmployee();
        permEmployee.setDetails(permName, permId, permSalary);
        permEmployee.displayDetails();
        permEmployee.calculatePayroll();
        System.out.println("\nEnter details for Contractual Employee:");
        System.out.print("Name: ");
        String contractName = scanner.nextLine();
        System.out.print("ID: ");
        String contractId = scanner.nextLine();
        System.out.print("Basic Salary: ");
        double contractSalary = scanner.nextDouble();
        ContractualEmployee contractEmployee = new ContractualEmployee();
        contractEmployee.setDetails(contractName, contractId, contractSalary);
        contractEmployee.displayDetails();
        contractEmployee.calculatePayroll(); }
}
