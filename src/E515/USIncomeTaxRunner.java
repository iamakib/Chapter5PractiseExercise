package E515;

import java.util.Scanner;

public class USIncomeTaxRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your income");
        int income = scanner.nextInt();

        USIncomeTax usIncomeTax = new USIncomeTax(income);

        double tax = usIncomeTax.getTax();
        System.out.println("Your income tax is : " + tax);
    }
}
