package Interface;
import java.util.*;
interface Exam {
    void enterMarks();
    void calculateResult(); }
class Student2 {
    String name;
    int rollNumber;
    Student2(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber; }
    void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber); } }
class Result implements Exam {
    Student2 student;
    double marksMath, marksScience, marksEnglish;
    double average;
    Result(Student2 student) {
        this.student = student; }
    public void enterMarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks in Math: ");
        marksMath = scanner.nextDouble();
        System.out.print("Enter marks in Science: ");
        marksScience = scanner.nextDouble();
        System.out.print("Enter marks in English: ");
        marksEnglish = scanner.nextDouble(); }
    public void calculateResult() {
        average = (marksMath + marksScience + marksEnglish) / 3; }
    void displayResult() {
        student.displayStudentDetails();
        System.out.printf("Average Marks: %.2f\n", average); } }
public class Multiple_Inheritance_Exam_Student_Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        Student2 student = new Student2(name, rollNumber);
        Result result = new Result(student);
        result.enterMarks();
        result.calculateResult();
        result.displayResult(); }
}
