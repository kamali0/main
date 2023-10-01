 import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        // Prompt the user to enter height in inches
        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        // Constants for conversion
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        // Convert weight and height to metric units
        double weightKilograms = weightPounds * KILOGRAMS_PER_POUND;
        double heightMeters = heightInches * METERS_PER_INCH;

        // Calculate BMI
        double bmi = weightKilograms / (heightMeters * heightMeters);

        // Display BMI
        System.out.println("BMI is " + bmi);

        // Interpret BMI
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}