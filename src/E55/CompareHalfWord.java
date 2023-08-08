package E55;

import java.util.Scanner;

public class CompareHalfWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aWord = scanner.next();
        int length = aWord.length();

        int half = length/2;

        String secondHalf;

        if(length % 2 == 0){
            secondHalf = aWord.substring(half);
        }
        else{
            secondHalf = aWord.substring(half+1);
        }

        if(aWord.substring(0,half).equals(secondHalf)){
            System.out.println("first and second half same");
        }
        else{
            System.out.println("first and second half different");
        }

    }
}
