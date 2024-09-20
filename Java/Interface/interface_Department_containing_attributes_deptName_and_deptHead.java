package Interface;
import java.util.*;
interface Department {
    String deptName = "Default Department";
    String deptHead = "Default Head";
    void printDepartmentDetails(); }
class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int numberOfRooms;
    public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms; }
    public void getHostelDetails() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms); } }
class Student extends Hostel implements Department {
    private String studentName;
    private String regdNo;
    private String electiveSubject;
    private double avgMarks;
    public Student(String hostelName, String hostelLocation, int numberOfRooms,
                   String studentName, String regdNo, String electiveSubject, double avgMarks) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks; }
    public String getRegdNo() {
        return regdNo; }
    public void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        getHostelDetails();
        printDepartmentDetails(); }
    public void printDepartmentDetails() {
        System.out.println("Department Name: " + Department.deptName);
        System.out.println("Department Head: " + Department.deptHead); } }
public class interface_Department_containing_attributes_deptName_and_deptHead {
    static ArrayList<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Admit new student\n2. Migrate a student\n3. Display details of a student\n4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    admitStudent(scanner);
                    break;
                case 2:
                    migrateStudent(scanner);
                    break;
                case 3:
                    displayStudentDetails(scanner);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option."); }
        } while (choice != 4); }
    private static void admitStudent(Scanner scanner) {
        System.out.println("Enter Student Name, Registration Number, Elective Subject, Average Marks, Hostel Name, Hostel Location, Number of Rooms:");
        String studentName = scanner.nextLine();
        String regdNo = scanner.nextLine();
        String electiveSubject = scanner.nextLine();
        double avgMarks = scanner.nextDouble();
        scanner.nextLine();
        String hostelName = scanner.nextLine();
        String hostelLocation = scanner.nextLine();
        int numberOfRooms = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(hostelName, hostelLocation, numberOfRooms, studentName, regdNo, electiveSubject, avgMarks);
        students.add(student);
        System.out.println("Student admitted successfully."); }
    private static void migrateStudent(Scanner scanner) {
        System.out.print("Enter the Registration Number of the student to migrate: ");
        String regdNo = scanner.nextLine();
        for (Student student : students) {
            if (student.getRegdNo().equals(regdNo)) {
                System.out.println("Enter new Hostel Name, Hostel Location, and Number of Rooms:");
                student.hostelName = scanner.nextLine();
                student.hostelLocation = scanner.nextLine();
                student.numberOfRooms = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                System.out.println("Student migrated successfully."); return; } }
        System.out.println("Student not found."); }
    private static void displayStudentDetails(Scanner scanner) {
        System.out.print("Enter the Registration Number of the student to display details: ");
        String regdNo = scanner.nextLine();
        for (Student student : students) {
            if (student.getRegdNo().equals(regdNo)) {
                student.printData();
                return; } }
        System.out.println("Student not found."); }
}
