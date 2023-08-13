package E522;

import java.util.Scanner;

public class PayCheckRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter hourly wage: $");
        double hourlyWage = scanner.nextDouble();

        System.out.print("Enter hours worked in the past week: ");
        double hoursWorked = scanner.nextDouble();

        PayCheck paycheck = new PayCheck(name, hoursWorked, hourlyWage);
        paycheck.printPayCheck();
    }
}
