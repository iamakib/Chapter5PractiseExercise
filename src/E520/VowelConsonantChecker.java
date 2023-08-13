package E520;

import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        input = input.toLowerCase();

        if(input.length() > 1 || !Character.isLetter(input.charAt(0)) ){
            System.out.println("ERROR");
        }
        else{
            if (input.charAt(0) == 'a' || input.charAt(0) == 'e' || input.charAt(0) == 'i' ||
                    input.charAt(0) =='o' || input.charAt(0) == 'u'){
                System.out.println("VOWEL");
            }
            else{
                System.out.println("CONSONANT");
            }
        }
    }
}
