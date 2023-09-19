import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter the distance to drive (in miles): ");
        double distance = input.nextDouble();

        System.out.print("Enter the car's fuel efficiency (miles per gallon): ");
        double fuelEfficiency = input.nextDouble();

        System.out.print("Enter the price per gallon of fuel: $");
        double pricePerGallon = input.nextDouble();

     
        double tripCost = (distance / fuelEfficiency) * pricePerGallon;

        
        System.out.printf("The cost of the trip will be: $%.2f%n", tripCost);

     
    }
}

