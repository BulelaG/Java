package Maths;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Calculate sum, difference, product, average, maximum, and minimum
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double average = (double) (num1 + num2) / 2;
        int maximum = Math.max(num1, num2);
        int minimum = Math.min(num1, num2);

        // Print the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
