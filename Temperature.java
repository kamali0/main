import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahrenheit (-58 to 41): ");
        double temp = input.nextDouble();

        System.out.print("Enter the wind speed in mph (>= 2): ");
        double windSpeed = input.nextDouble();

       
        if (temp < -58 || temp > 41 || windSpeed < 2) {
            System.out.println("Invalid input. Temperature must be between -58 and 41 Fahrenheit, and wind speed must be >= 2 mph.");
        } else {
            
            double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temp * Math.pow(windSpeed, 0.16);

           
            System.out.println("Wind Chill Temperature: " + windChill + " ºF");
        }

        input.close();
    }
}