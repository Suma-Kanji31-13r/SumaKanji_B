import java.util.*;
public class Admission_to_a_professional_course {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Enter marks for student " + i + ":");
            System.out.print("Mathematics marks: ");
            int mathMarks = scanner.nextInt();
            System.out.print("Physics marks: ");
            int physicsMarks = scanner.nextInt();
            System.out.print("Chemistry marks: ");
            int chemistryMarks = scanner.nextInt();
            if ((mathMarks >= 60) && (physicsMarks >= 50) && (chemistryMarks >= 40) &&
                    ((mathMarks + physicsMarks + chemistryMarks) >= 200 || (mathMarks + physicsMarks) >= 150)) {
                System.out.println("Student " + i + " is eligible for admission.");
            } else {
                System.out.println("Student " + i + " is not eligible for admission."); } } }
}
