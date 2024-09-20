package Interface;
import java.util.*;
class Vehicle {
    int ID;
    String Name;
    String LicenseNumber;
    public Vehicle(int ID, String name, String licenseNumber) {
        this.ID = ID;
        Name = name;
        LicenseNumber = licenseNumber; }
    public void display() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("License Number: " + LicenseNumber); } }
class TwoWheeler extends Vehicle {
    String SteeringHandle;
    public TwoWheeler(int ID, String name, String licenseNumber, String steeringHandle) {
        super(ID, name, licenseNumber);
        SteeringHandle = steeringHandle; }
    public void display() {
        super.display();
        System.out.println("Steering Handle: " + SteeringHandle); } }
class FourWheeler extends Vehicle {
    String SteeringWheel;
    public FourWheeler(int ID, String name, String licenseNumber, String steeringWheel) {
        super(ID, name, licenseNumber);
        SteeringWheel = steeringWheel; }
    public void display() {
        super.display();
        System.out.println("Steering Wheel: " + SteeringWheel); } }
public class Diagram_Vehicle_Four_Wheeler_Two_Wheeler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Vehicle ID: ");
        int vehicleID = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Vehicle Name: ");
        String vehicleName = scanner.nextLine();
        System.out.print("Enter License Number: ");
        String licenseNumber = scanner.nextLine();
        System.out.print("Is it a Two-Wheeler? (yes/no): ");
        String type = scanner.nextLine();
        if (type.equalsIgnoreCase("yes")) {
            System.out.print("Enter Steering Handle: ");
            String steeringHandle = scanner.nextLine();
            TwoWheeler twoWheeler = new TwoWheeler(vehicleID, vehicleName, licenseNumber, steeringHandle);
            twoWheeler.display();
        } else {
            System.out.print("Enter Steering Wheel: ");
            String steeringWheel = scanner.nextLine();
            FourWheeler fourWheeler = new FourWheeler(vehicleID, vehicleName, licenseNumber, steeringWheel);
            fourWheeler.display(); }
        scanner.close(); }
}
