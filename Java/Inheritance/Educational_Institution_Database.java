package Inheritance;
import java.util.Scanner;

class Staff {
    protected String code;
    protected String name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void display() {
        System.out.println("Code: " + code + ", Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject;
    private String publication;

    public Teacher(String code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject + ", Publication: " + publication);
    }
}

class Officer extends Staff {
    private String grade;

    public Officer(String code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    protected int speed;

    public Typist(String code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Speed: " + speed + " wpm");
    }
}

class RegularTypist extends Typist {
    private double remuneration;

    public RegularTypist(String code, String name, int speed, double remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Remuneration: $" + remuneration);
    }
}

class CasualTypist extends Typist {
    private double dailyWages;

    public CasualTypist(String code, String name, int speed, double dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Daily Wages: $" + dailyWages);
    }
}


public class Educational_Institution_Database {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example for Teacher
        System.out.println("Enter Teacher's Details:");
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        System.out.print("Publication: ");
        String publication = scanner.nextLine();

        Teacher teacher = new Teacher(code, name, subject, publication);
        System.out.println("\nTeacher's Information:");
        teacher.display();

        // Add similar input and display sections for Officer, RegularTypist, and CasualTypist
        // Follow the pattern used for Teacher
    }
}
