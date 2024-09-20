package Interface;
import java.util.*;
abstract class MotorVehicle {
    protected String modelName;
    protected String modelNumber;
    protected double modelPrice;
    public MotorVehicle(String modelName, String modelNumber, double modelPrice) {
        this.modelName = modelName;
        this.modelNumber = modelNumber;
        this.modelPrice = modelPrice; }
    void display() {
        System.out.println("Vehicle Model Name: " + modelName);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Model Price: $" + modelPrice); } }
class Car extends MotorVehicle {
    private double discountRate;
    public Car(String modelName, String modelNumber, double modelPrice, double discountRate) {
        super(modelName, modelNumber, modelPrice);
        this.discountRate = discountRate; }
    void display() {
        super.display();
        System.out.println("Discount Rate: " + discountRate + "%");
        System.out.println("Price after discount: $" + discount()); }
    double discount() {
        return modelPrice - (modelPrice * discountRate / 100); } }
public class abstract_class_MotorVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Car details:");
        System.out.print("Model Name: ");
        String modelName = scanner.nextLine();
        System.out.print("Model Number: ");
        String modelNumber = scanner.nextLine();
        System.out.print("Model Price: ");
        double modelPrice = scanner.nextDouble();
        System.out.print("Discount Rate (%): ");
        double discountRate = scanner.nextDouble();
        Car car = new Car(modelName, modelNumber, modelPrice, discountRate);
        car.display(); }
}
