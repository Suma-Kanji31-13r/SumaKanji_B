package Inheritance;
import java.util.*;
class Office extends Building2 {
    private int numberOfTelephones;
    private int numberOfTables;

    public Office(int numberOfFloors, int numberOfRooms, double totalFootage, int numberOfTelephones, int numberOfTables) {
        super(numberOfFloors, numberOfRooms, totalFootage);
        this.numberOfTelephones = numberOfTelephones;
        this.numberOfTables = numberOfTables;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Office Details:");
        System.out.println("Number of Telephones: " + numberOfTelephones);
        System.out.println("Number of Tables: " + numberOfTables);
    }
}
class Building2 {
    protected int numberOfFloors;
    protected int numberOfRooms;
    protected double totalFootage;

    public Building2(int numberOfFloors, int numberOfRooms, double totalFootage) {
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
class House2 extends Building2 {
    private int numberOfBedrooms;
    private int numberOfBathrooms;

    public House2(int numberOfFloors, int numberOfRooms, double totalFootage, int numberOfBedrooms, int numberOfBathrooms) {
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

public class BuildingDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input and Display for Building
        System.out.println("Enter Building Details:");
        System.out.print("Number of Floors: ");
        int floors = scanner.nextInt();
        System.out.print("Number of Rooms: ");
        int rooms = scanner.nextInt();
        System.out.print("Total Footage: ");
        double footage = scanner.nextDouble();
        Building2 building = new Building2(floors, rooms, footage);
        System.out.println("\nDisplaying Building Information:");
        building.display();

        // Input and Display for House
        System.out.println("\nEnter House Details:");
        System.out.print("Number of Bedrooms: ");
        int bedrooms = scanner.nextInt();
        System.out.print("Number of Bathrooms: ");
        int bathrooms = scanner.nextInt();
        House2 house = new House2(floors, rooms, footage, bedrooms, bathrooms);
        System.out.println("\nDisplaying House Information:");
        house.display();

        // Input and Display for Office
        System.out.println("\nEnter Office Details:");
        System.out.print("Number of Telephones: ");
        int telephones = scanner.nextInt();
        System.out.print("Number of Tables: ");
        int tables = scanner.nextInt();
        Office office = new Office(floors, rooms, footage, telephones, tables);
        System.out.println("\nDisplaying Office Information:");
        office.display();
    }
}
