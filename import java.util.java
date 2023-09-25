import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the coordinates of three points
        System.out.println("Enter the coordinates of three points (x1, y1), (x2, y2), (x3, y3):");

        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        // Calculate the area of the triangle
        double area = calculateTriangleArea(x1, y1, x2, y2, x3, y3);

        // Display the area of the triangle
        System.out.println("The area of the triangle is: " + area);

        input.close();
    }

    public static double calculateTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        // Calculate the area using the formula: 0.5 * |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|
        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }
}