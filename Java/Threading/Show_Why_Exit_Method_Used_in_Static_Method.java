package Threading;

public class Show_Why_Exit_Method_Used_in_Static_Method {
    public static void main(String[] args) {
        System.out.println("Before checking condition");
        if (true) {
            System.out.println("Condition met, exiting program.");
            System.exit(0); }
        System.out.println("This line won't be executed if the condition is true."); }
}
