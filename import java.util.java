import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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

        
        double area = calculateTriangleArea(x1, y1, x2, y2, x3, y3);
        System.out.println("The area of the triangle is: " + area);

        input.close();
    }

    public static double calculateTriangleArea(double x1, double y1, double x2, double y2, double x3, double y3) {
       
        return 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
    }
}
