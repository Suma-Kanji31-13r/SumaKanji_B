package Inheritance;
import java.util.*;
class OctNum3 extends Num3 {
    public OctNum3(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}
class HexNum3 extends Num {
    public HexNum3(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
    }
}
class Num3 {
    protected int number;

    public Num3(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Decimal: " + number);
    }
}

public class NumDEmo_and_Oct_tonum_merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = scanner.nextInt();

        // Instance of the base class to show the number in decimal
        Num3 numObj = new Num3(num);
        System.out.print("Base class (Num) output: ");
        numObj.showNum();

        // Instance of the derived class to show the number in hexadecimal
        HexNum3 hexNumObj = new HexNum3(num);
        System.out.print("Derived class (HexNum) output: ");
        hexNumObj.showNum();

        // Instance of the derived class to show the number in octal
        OctNum3 octNumObj = new OctNum3(num);
        System.out.print("Derived class (OctNum) output: ");
        octNumObj.showNum();
    }
}
