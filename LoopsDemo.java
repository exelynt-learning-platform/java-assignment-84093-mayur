package javastart;

public class LoopsDemo {

    public static void main(String[] args) {

        // 1. For loop: Print numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2. While loop: Print numbers from 10 to 1
        System.out.println("\nNumbers from 10 to 1:");

        int j = 10;

        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        // 3. Do-while loop: Print even numbers from 1 to 10
        System.out.println("\nEven numbers from 1 to 10:");

        int k = 1;

        do {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        } while (k <= 10);

        // 4. Enhanced for loop: Print array elements
        System.out.println("\nNames in the array:");

        String[] names = {"Mayur", "Rahul", "Amit", "Rohit"};

        for (String name : names) {
            System.out.println(name);
        }
    }
}