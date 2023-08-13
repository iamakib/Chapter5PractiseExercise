package E525;

import java.util.Scanner;

public class WaterSateWithAltitude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter 'C' for Celsius or 'F' for Fahrenheit: ");
        String scale = scanner.next();
        scale = scale.toLowerCase();

        double celsiusTemperature = temperature;

        if (scale.equals("f")) {
            celsiusTemperature = (temperature - 32) * 5 / 9;
        }

        System.out.print("Enter the altitude value: ");
        double altitude = scanner.nextDouble();

        System.out.print("Enter 'M' for meters or 'F' for feet: ");
        String unit = scanner.next();
        unit = unit.toLowerCase();

        double boilingPoint;

        if (unit.equals("m")) {
            boilingPoint = 100 - (altitude / 300);
        } else if (unit.equals("f")) {
            boilingPoint = 212 - (altitude / 1000);
        } else {
            System.out.println("Invalid input for unit. Please enter 'M' or 'F'.");

            return;
        }

        if(scale.equals("c") || scale.equals("f")) {
            if (celsiusTemperature >= 0 && celsiusTemperature <= boilingPoint) {
                System.out.println("Water is in a liquid state.");
            } else if (celsiusTemperature < 0) {
                System.out.println("Water is in a solid state.");
            } else {
                System.out.println("Water is in a gaseous state.");
            }
        }
        else{
            System.out.println("Invalid scale input");
        }
    }
}
