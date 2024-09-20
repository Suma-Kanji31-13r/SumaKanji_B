package Interface;
import java.util.*;
interface Exam3 {
    void Percent_cal(); }
class Student3 {
    private String name;
    private int roll_no;
    private int[] marks;
    public Student3(String name, int roll_no, int[] marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks; }
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " "); }
        System.out.println(); }
    public int[] getMarks() {
        return marks; }
    public int getNumSubjects() {
        return marks.length; } }
class Result3 implements Exam3 {
    private Student3 student;
    private double percentage;
    public Result3(Student3 student) {
        this.student = student; }
    public void Percent_cal() {
        int total = 0;
        for (int mark : student.getMarks()) {
            total += mark; }
        percentage = (double) total / student.getNumSubjects(); }
    public void display() {
        student.show();
        System.out.println("Percentage: " + percentage + "%"); } }
public class diagram_Exam_Student_Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        int roll_no = scanner.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];
        System.out.println("Enter marks for each subject:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt(); }
        Student3 student = new Student3(name, roll_no, marks);
        Result3 result = new Result3(student);
        result.Percent_cal();
        result.display();
        scanner.close(); }
}
