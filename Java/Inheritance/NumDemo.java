package Inheritance;
import java.util.*;
class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
    }
}
class Num {
    protected int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

public class NumDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();

        // Demonstrate base class functionality
        Num normalNum = new Num(num);
        System.out.print("Base class (Num) output: ");
        normalNum.showNum();

        // Demonstrate derived class functionality
        HexNum hexNum = new HexNum(num);
        System.out.print("Derived class (HexNum) output: ");
        hexNum.showNum();
    }
}
