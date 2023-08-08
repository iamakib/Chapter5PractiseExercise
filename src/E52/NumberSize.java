package E52;

import java.util.Scanner;

public class NumberSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any floating number : ");
        double number = scanner.nextFloat();

        if(Math.abs(number) < 1){
            System.out.println("Small");
        }
        else if (Math.abs(number) > 1000000) {
            System.out.println("Exceed");
        }
    }
}
