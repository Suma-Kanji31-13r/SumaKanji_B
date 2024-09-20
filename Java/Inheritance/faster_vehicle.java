package Inheritance;
import java.util.*;
class Truck3 extends Vehicle3 {
    private double loadLimit;

    public Truck3(int wheels, double speed, double loadLimit) {
        super(wheels, speed);
        this.loadLimit = loadLimit;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Load Limit: " + loadLimit + " kg");
    }
}
class Car3 extends Vehicle3 {
    private int passengers;

    public Car3(int wheels, double speed, int passengers) {
        super(wheels, speed);
        this.passengers = passengers;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Number of Passengers: " + passengers);
    }
}
class Vehicle3 {
    protected int wheels;
    protected double speed;

    public Vehicle3(int wheels, double speed) {
        this.wheels = wheels;
        this.speed = speed;
    }

    public void display() {
        System.out.println("Number of Wheels: " + wheels);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class faster_vehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Car
        System.out.println("Enter details for Car:");
        System.out.print("Number of wheels: ");
        int carWheels = scanner.nextInt();
        System.out.print("Speed: ");
        double carSpeed = scanner.nextDouble();
        System.out.print("Number of passengers: ");
        int passengers = scanner.nextInt();
        Car3 car = new Car3(carWheels, carSpeed, passengers);

        // Input for Truck
        System.out.println("Enter details for Truck:");
        System.out.print("Number of wheels: ");
        int truckWheels = scanner.nextInt();
        System.out.print("Speed: ");
        double truckSpeed = scanner.nextDouble();
        System.out.print("Load limit (in kg): ");
        double loadLimit = scanner.nextDouble();
        Truck3 truck = new Truck3(truckWheels, truckSpeed, loadLimit);

        // Displaying information
        System.out.println("\nCar Details:");
        car.display();
        System.out.println("\nTruck Details:");
        truck.display();

        // Comparing speed
        System.out.println();
        if (car.speed > truck.speed) {
            System.out.println("Car is faster.");
        } else if (car.speed < truck.speed) {
            System.out.println("Truck is faster.");
        } else {
            System.out.println("Both vehicles have the same speed.");
        }
    }
}
