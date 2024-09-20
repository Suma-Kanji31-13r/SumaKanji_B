package Inheritance;
import java.util.*;
class Num2 {
    protected int number;

    public Num2(int number) {
        this.number = number;
    }

    public void showNumber() {
        System.out.println("Number: " + number);
    }
}

class OctNum extends Num2 {
    public OctNum(int number) {
        super(number);
    }

    @Override
    public void showNumber() {
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class Oct_to_num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = scanner.nextInt();

        // Demonstrate base class functionality
        Num2 normalNum = new Num2(n);
        System.out.print("Base class (Num) output: ");
        normalNum.showNumber();

        // Demonstrate derived class functionality
        OctNum octNum = new OctNum(n);
        System.out.print("Derived class (OctNum) output: ");
        octNum.showNumber();
    }
}
