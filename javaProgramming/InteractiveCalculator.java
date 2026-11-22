package javaProgramming;


import java.util.Scanner;

public class InteractiveCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variables of different data types
        String userName;
        int calculationCount = 0;
        double num1, num2, result = 0;
        char operator;
        boolean continueCalculation = true;

        // Welcome message
        System.out.println("================================");
        System.out.println("    INTERACTIVE CALCULATOR");
        System.out.println("================================");

        System.out.print("Enter your name: ");
        userName = sc.nextLine();

        System.out.println("\nWelcome, " + userName + "!");

        // While loop to perform multiple calculations
        while (continueCalculation) {

            System.out.println("\n========== MENU ==========");
            System.out.println("+  Addition");
            System.out.println("-  Subtraction");
            System.out.println("*  Multiplication");
            System.out.println("/  Division");
            System.out.println("%  Modulus");
            System.out.println("X  Exit");

            // Accept operator from user
            System.out.print("\nChoose an operator: ");
            operator = sc.next().charAt(0);

            // Check exit condition
            if (operator == 'X' || operator == 'x') {

                continueCalculation = false;
                System.out.println("Thank you for using Calculator!");

            } else {

                // Accept first number
                System.out.print("Enter first number: ");

                if (sc.hasNextDouble()) {

                    num1 = sc.nextDouble();

                    // Accept second number
                    System.out.print("Enter second number: ");

                    if (sc.hasNextDouble()) {

                        num2 = sc.nextDouble();

                        // Perform calculations
                        switch (operator) {

                            case '+':

                                result = num1 + num2;
                                System.out.println("Addition = " + result);
                                calculationCount++;
                                break;

                            case '-':

                                result = num1 - num2;
                                System.out.println("Subtraction = " + result);
                                calculationCount++;
                                break;

                            case '*':

                                result = num1 * num2;
                                System.out.println("Multiplication = " + result);
                                calculationCount++;
                                break;

                            case '/':

                                if (num2 != 0) {

                                    result = num1 / num2;
                                    System.out.println("Division = " + result);
                                    calculationCount++;

                                } else {

                                    System.out.println("Error! Cannot divide by zero.");

                                }

                                break;

                            case '%':

                                if (num2 != 0) {

                                    result = num1 % num2;
                                    System.out.println("Modulus = " + result);
                                    calculationCount++;

                                } else {

                                    System.out.println("Error! Cannot calculate modulus by zero.");

                                }

                                break;

                            default:

                                System.out.println("Invalid operator!");

                        }

                    } else {

                        System.out.println("Invalid input! Please enter a number.");
                        sc.next();

                    }

                } else {

                    System.out.println("Invalid input! Please enter a number.");
                    sc.next();

                }

            }

        }

        // Display total successful calculations
        System.out.println("\nTotal Calculations: " + calculationCount);
        System.out.println("Goodbye, " + userName + "!");

        sc.close();

    }
}

