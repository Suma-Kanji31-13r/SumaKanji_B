package Inheritance;
import java.util.Scanner;

class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData() {
        System.out.println("This is a vehicle class");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

class Bus extends Vehicle {
    private int routeNumber;

    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle {
    private String manufacturerName;

    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for a Bus:");
        System.out.print("Registration Number: ");
        String regnNumber = scanner.nextLine();
        System.out.print("Speed: ");
        int speed = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Owner Name: ");
        String ownerName = scanner.nextLine();
        System.out.print("Route Number: ");
        int routeNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Bus bus = new Bus(regnNumber, speed, color, ownerName, routeNumber);
        bus.showData();

        System.out.println("\nEnter details for a Car:");
        System.out.print("Registration Number: ");
        regnNumber = scanner.nextLine();
        System.out.print("Speed: ");
        speed = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.print("Color: ");
        color = scanner.nextLine();
        System.out.print("Owner Name: ");
        ownerName = scanner.nextLine();
        System.out.print("Manufacturer Name: ");
        String manufacturerName = scanner.nextLine();

        Car car = new Car(regnNumber, speed, color, ownerName, manufacturerName);
        car.showData();
    }
}
