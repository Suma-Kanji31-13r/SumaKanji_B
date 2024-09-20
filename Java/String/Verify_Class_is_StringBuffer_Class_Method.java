package String;
import java.util.*;
import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.HashSet;
public class Verify_Class_is_StringBuffer_Class_Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a set to store all method names of the StringBuffer class
        Set<String> stringBufferMethods = new HashSet<>();
        Method[] methods = StringBuffer.class.getDeclaredMethods();
        for (Method method : methods) {
            stringBufferMethods.add(method.getName());
        }

        // Ask the user to enter a method name
        System.out.print("Enter the name of a StringBuffer method to verify: ");
        String userInput = scanner.nextLine();

        // Verify if the entered method name is part of the StringBuffer class
        if (stringBufferMethods.contains(userInput)) {
            System.out.println(userInput + " is a method of the StringBuffer class.");
        } else {
            System.out.println(userInput + " is NOT a method of the StringBuffer class.");
        }
    }
}
