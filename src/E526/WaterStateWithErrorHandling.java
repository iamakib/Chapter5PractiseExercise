package E526;

import java.util.Scanner;

public class WaterStateWithErrorHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");

        if(!(scanner.hasNextDouble())){
            System.out.println("Invalid Temperature Input");
            return;
        }
        double temperature = scanner.nextDouble();

        System.out.print("Enter 'C' for Celsius or 'F' for Fahrenheit: ");

        if(!scanner.hasNext()){
            System.out.println("Invalid Scale Input");
            return;
        }
        String scale = scanner.next();
        scale = scale.toLowerCase();

        double celsiusTemperature = temperature;

        if (scale.equals("f")) {
            celsiusTemperature = (temperature - 32) * 5 / 9;
        }

        System.out.print("Enter the altitude value: ");
        if(!scanner.hasNextDouble()){
            System.out.println("Invalid Altitude Input");
            return;
        }

        double altitude = scanner.nextDouble();

        System.out.print("Enter 'M' for meters or 'F' for feet: ");

        if(!scanner.hasNext()){
            System.out.println("Invalid Altitude Unit  Input");
            return;
        }
        String unit = scanner.next();

        unit = unit.toLowerCase();

        double boilingPoint = 0;

        if (unit.equals("m")) {
            boilingPoint = 100 - (altitude / 300);
        }
        else if (unit.equals("f")) {
            boilingPoint = 212 - (altitude / 1000);
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

    }
}
