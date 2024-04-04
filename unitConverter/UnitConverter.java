package unitConverter;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Unit Converter");

            // Accepting inputs from the user
            System.out.print("Enter the unit you want to convert from (Feet/Pounds/Fahrenheit): ");
            String fromUnit = scanner.nextLine();

            System.out.print("Enter the unit you want to convert to (Meters/Kgs/Celsius): ");
            String toUnit = scanner.nextLine();

            System.out.print("Enter the quantity to be converted: ");
            double quantity = scanner.nextDouble();

            // Performing conversions based on user inputs
            double result;
            switch (fromUnit.toLowerCase()) {
                case "feet":
                    if (toUnit.equalsIgnoreCase("meters")) {
                        result = feetToMeters(quantity);
                        System.out.println(quantity + " Feet is equal to " + result + " Meters.");
                    } else {
                        System.out.println("Invalid conversion units.");
                    }
                    break;
                case "pounds":
                    if (toUnit.equalsIgnoreCase("kgs")) {
                        result = poundsToKgs(quantity);
                        System.out.println(quantity + " Pounds is equal to " + result + " Kgs.");
                    } else {
                        System.out.println("Invalid conversion units.");
                    }
                    break;
                case "fahrenheit":
                    if (toUnit.equalsIgnoreCase("celsius")) {
                        result = fahrenheitToCelsius(quantity);
                        System.out.println(quantity + " Fahrenheit is equal to " + result + " Celsius.");
                    } else {
                        System.out.println("Invalid conversion units.");
                    }
                    break;
                default:
                    System.out.println("Invalid conversion units.");
            }
        }
    }

    // Conversion methods
    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double poundsToKgs(double pounds) {
        return pounds * 0.453592;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
