package javastart;

public class Myclass {

    // Method 1: Prints a welcome message
    public static void Message1() {
        System.out.println("Welcome to Java!");
    }

    // Method 2: Prints a success message
    public static void Message2() {
        System.out.println("Java methods are working successfully.");
    }

    // Main method: Program execution starts here
    public static void main(String[] args) {

        // Calling the first custom method
        Message1();

        // Calling the second custom method
        Message2();
    }
}
