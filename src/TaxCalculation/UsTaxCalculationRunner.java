package TaxCalculation;

import Constants.Constants;

import java.util.Scanner;

public class UsTaxCalculationRunner {

    public static void main(String[] args) {

        UsTaxCalculation usTaxCalculation ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your income: ");
        double income = scanner.nextInt();
        System.out.println("Married? (Y/N) ");
        String IsMarried = scanner.next();

        int status;

        if(IsMarried.equals("Y")){
            status = Constants.MARRIED;
        }
        else{
            status = Constants.SINGLE;
        }

        usTaxCalculation = new UsTaxCalculation(income,status);
        double tax =  usTaxCalculation.getTax();

        System.out.println("Your Total tax is " + tax );

    }
}
