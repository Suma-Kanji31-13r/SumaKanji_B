package Inheritance;
import java.util.*;
class Building {
    protected int numberOfFloors;
    protected int numberOfRooms;
    protected double totalFootage;

    public Building(int numberOfFloors, int numberOfRooms, double totalFootage) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        this.totalFootage = totalFootage;
    }

    public void display() {
        System.out.println("Building Details:");
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Total Footage: " + totalFootage);
    }
}

class House extends Building {
    private int numberOfBedrooms;
    private int numberOfBathrooms;

    public House(int numberOfFloors, int numberOfRooms, double totalFootage, int numberOfBedrooms, int numberOfBathrooms) {
        super(numberOfFloors, numberOfRooms, totalFootage);
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("House Details:");
        System.out.println("Number of Bedrooms: " + numberOfBedrooms);
        System.out.println("Number of Bathrooms: " + numberOfBathrooms);
    }
}

public class BuildingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Building
        System.out.println("Enter Building Details:");
        System.out.print("Number of Floors: ");
        int floors = scanner.nextInt();
        System.out.print("Number of Rooms: ");
        int rooms = scanner.nextInt();
        System.out.print("Total Footage: ");
        double footage = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Building building = new Building(floors, rooms, footage);
        System.out.println("\nDisplaying Building Information:");
        building.display();

        // Input for House
        System.out.println("\nEnter House Details:");
        System.out.print("Number of Bedrooms: ");
        int bedrooms = scanner.nextInt();
        System.out.print("Number of Bathrooms: ");
        int bathrooms = scanner.nextInt();

        House house = new House(floors, rooms, footage, bedrooms, bathrooms);
        System.out.println("\nDisplaying House Information:");
        house.display();
    }
}
