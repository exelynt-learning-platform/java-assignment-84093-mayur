package javastart;

import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter their name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Ask user to enter their age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Clear the leftover newline after nextInt()
        sc.nextLine();

        // Ask user to enter their favorite number
        System.out.print("Enter your favorite number: ");
        int favoriteNumber = sc.nextInt();

        // Display personalized message
        System.out.println("\n----- User Details -----");
        System.out.println("Hello, " + name + "!");
        System.out.println("Your age is: " + age);
        System.out.println("Your favorite number is: " + favoriteNumber);

        // Close Scanner
        sc.close();
    }
}
