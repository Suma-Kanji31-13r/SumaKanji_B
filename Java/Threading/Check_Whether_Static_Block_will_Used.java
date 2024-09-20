package Threading;

public class Check_Whether_Static_Block_will_Used {
    static {
        System.out.println("Static block is executed when the class is loaded into the JVM."); }
    public static void main(String[] args) {
        System.out.println("Main method is executed after the static block."); }
}
