package E523;

import java.util.Scanner;

public class Coupon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the cost of your groceries $");
        double amountSpent = scanner.nextDouble();
        double couponPercentage = 0;

        if (amountSpent < 10) {
            couponPercentage = 0;
        } else if (amountSpent >= 10 && amountSpent <= 60) {
            couponPercentage = 0.08;
        } else if (amountSpent > 60 && amountSpent <= 150) {
            couponPercentage = 0.10;
        } else if (amountSpent > 150 && amountSpent <= 210) {
            couponPercentage = 0.12;
        } else if (amountSpent > 210) {
            couponPercentage = 0.14;
        }

        double couponAmount = amountSpent * couponPercentage;

        System.out.println("You win a discount coupon of $" + couponAmount);

    }
}

