package javaProgramming;

import java.util.Scanner;

public class StudentGradingSystem {

    public static void main(String[] args) {

        // Create Scanner object to accept user input
        Scanner sc = new Scanner(System.in);

        // Variable to store the number of students
        int numberOfStudents = 3;

        // Loop to process multiple students
        for (int i = 1; i <= numberOfStudents; i++) {

            System.out.println("\n----- Student " + i + " Details -----");

            // Accept student name
            System.out.print("Enter student name: ");
            String studentName = sc.nextLine();

            // Accept marks in three subjects
            System.out.print("Enter marks in Subject 1: ");
            double subject1 = sc.nextDouble();

            System.out.print("Enter marks in Subject 2: ");
            double subject2 = sc.nextDouble();

            System.out.print("Enter marks in Subject 3: ");
            double subject3 = sc.nextDouble();

            // Calculate total marks
            double total = subject1 + subject2 + subject3;

            // Calculate average marks
            double average = total / 3;

            // Determine grade using conditional statements
            char grade;

            if (average >= 90) {
                grade = 'A';
            }
            else if (average >= 75) {
                grade = 'B';
            }
            else if (average >= 50) {
                grade = 'C';
            }
            else {
                grade = 'F';
            }

            // Display student result
            System.out.println("\n----- Student Result -----");
            System.out.println("Student Name: " + studentName);
            System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);
            System.out.println("Grade: " + grade);

            // Consume the newline before reading the next student's name
            sc.nextLine();
        }

        // Close Scanner
        sc.close();
    }
}

