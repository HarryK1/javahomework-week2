package homework;

import java.util.Scanner;

public class Programme9_ConvertUpperToLowerCase {
    //main method
    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //enter uppercase character
        System.out.print("Enter an uppercase character: ");
        String input = scanner.next();
        //close scanner
        scanner.close();

        if (input.length() == 1) {
            char uppercaseChar = input.charAt(0);

            if (Character.isUpperCase(uppercaseChar)){
            char lowercaseChar = Character.toLowerCase(uppercaseChar);
            System.out.println("Lowercase equivalent: " + lowercaseChar);
        } else {
            System.out.println("The input is not an uppercase character");
        }
    } else {
        System.out.println("Please enter a single uppercase character");

    }
}
}

