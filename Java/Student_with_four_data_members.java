import java.util.*;
public class Student_with_four_data_members {
    String name;
    int rollNo;
    float sub1, sub2;

    // Constructor to initialize data members
    public Student_with_four_data_members(String name, int rollNo, float sub1, float sub2) {
        this.name = name;
        this.rollNo = rollNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }

    // Method to calculate and display total marks and percentage
    public void displayResults() {
        float total = sub1 + sub2;
        float percentage = (total / 200) * 100; // Assuming each subject is out of 100 marks

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for student details
        System.out.println("Enter student's name:");
        String name = scanner.nextLine();

        System.out.println("Enter roll number:");
        int rollNo = scanner.nextInt();

        System.out.println("Enter marks in Subject 1:");
        float sub1 = scanner.nextFloat();

        System.out.println("Enter marks in Subject 2:");
        float sub2 = scanner.nextFloat();

        // Creating Student object with user input
        Student_with_four_data_members student = new Student_with_four_data_members(name, rollNo, sub1, sub2);

        // Displaying student details and results
        student.displayDetails();
        student.displayResults();
    }
}
