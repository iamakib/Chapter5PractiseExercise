package E517;

import java.util.Scanner;

public class largestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter three numbers");
        double number1 ,number2 ,number3,max;

        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        number3 = scanner.nextDouble();

        max = number3;
        if(number1 >= number2 && number1 >= number3){
            max = number1;
        }
        else if(number2 >= number3 && number2 >= number1){
            max = number2;
        }
        System.out.println("The largest number is : " + max);
    }
}
