package javastart;

import java.util.Scanner;

public class ConditionalDemo {

    public static void main(String[] args) {

        // Create Scanner object to accept user input
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Positive");
        } 
        else if (number < 0) {
            System.out.println("Negative");
        } 
        else {
            System.out.println("Zero");
        }

        // Ask user to enter a day number
        System.out.print("Enter a day number (1-7): ");
        int day = sc.nextInt();

        // Use switch statement to display the day name
        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day number");
        }

        // Close Scanner
        sc.close();
    }
}
