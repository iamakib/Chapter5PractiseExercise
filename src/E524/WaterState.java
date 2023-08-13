package E524;

import java.util.Scanner;

public class WaterState {
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

        if(scale.equals("c") || scale.equals("f")) {
            if (celsiusTemperature >= 0 && celsiusTemperature <= 100) {
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
