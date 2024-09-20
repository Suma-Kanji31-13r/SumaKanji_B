import java.util.*;
public class Complex_real_imaginary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first Complex object
        System.out.println("Enter the real and imaginary parts of the first complex number:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

        // Input for the second Complex object
        System.out.println("Enter the real and imaginary parts of the second complex number:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        // Adding the two complex numbers and displaying the result
        complex1.add(complex2);
    }
}
 class Complex {
    private double real;
    private double imaginary;

    // Constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add this complex number with another complex number
    public void add(Complex other) {
        double resultReal = this.real + other.real;
        double resultImaginary = this.imaginary + other.imaginary;
        System.out.printf("Sum of Complex Numbers: %.1f + %.1fi\n", resultReal, resultImaginary);
    }
}

