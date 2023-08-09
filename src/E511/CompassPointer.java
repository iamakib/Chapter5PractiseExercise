package E511;

import java.util.Scanner;

public class CompassPointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a angle :");

        double angle = scanner.nextDouble();
        if(angle < 0 || angle >360){
            System.out.println("Invalid Input");
        }
        else{
            if(angle >= 337.5 || angle <= 22.5){
                System.out.println("N");
            }
            else if(angle > 22.5 && angle < 67.5){
                System.out.println("NE");
            }
            else if(angle >= 67.5 && angle <= 112.5){
                System.out.println("E");
            }
            else if(angle > 112.5 && angle < 157.5){
                System.out.println("SE");
            }
            else if(angle >= 157.5 && angle <= 202.5){
                System.out.println("S");
            }
            else if(angle > 202.5 && angle < 247.5){
                System.out.println("SW");
            }
            else if(angle >= 247.5 && angle <= 292.5){
                System.out.println("W");
            }
            else if(angle > 292.5 && angle < 337.5){
                System.out.println("NW");
            }
        }
    }
}
