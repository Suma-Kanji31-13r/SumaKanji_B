package Exception_Handling;
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message); } }
public class custom_Exception_handle_two_kind_of_Arithmetic_Exception {
    public static double calculateExpression(double X, double Y, double P, double Q, double Z, double I) throws CustomArithmeticException {
        if (Q == 0) {
            throw new CustomArithmeticException("Error: Division by zero."); }
        return X + Y * (P / Q) - Z - I; }
    public static void main(String[] args) {
        try {
            double X = 10.0;
            double Y = 20.0;
            double P = 30.0;
            double Q = 0.0; // This will cause a division by zero exception
            double Z = 40.0;
            double I = 50.0;
            double result = calculateExpression(X, Y, P, Q, Z, I);
            System.out.println("Result of the equation: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println(e.getMessage()); } }
}
