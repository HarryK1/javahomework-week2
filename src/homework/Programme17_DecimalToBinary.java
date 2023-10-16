package homework;

import java.util.Scanner;

public class Programme17_DecimalToBinary {
    public static void main(String [] args){
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        //close the scanner
        scanner.close();

        //convert decimal number to binary
        String binaryNumber = Integer.toBinaryString(decimalNumber);
        //display binary equivalent
        System.out.println("Binary number is: " + binaryNumber);
    }
}
