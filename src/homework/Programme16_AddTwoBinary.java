package homework;

import java.util.Scanner;

public class Programme16_AddTwoBinary {
    public static void main(String [] args){
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //enter the first binary number
        System.out.println("Input the first binary number: ");
        String binary1 = scanner.next();
        //enter the second binary number
        System.out.println("Input the second binary number: ");
        String binary2 = scanner.next();
        //close the scanner
        scanner.close();

        //convert binary strings to integers
        int num1 = Integer.parseInt(binary1,2);
        int num2 = Integer.parseInt(binary2,2);
        //add the numbers and convert the result back to a binary string
        int sum = num1 + num2;
        String binarySum = Integer.toBinaryString(sum);
        //display the sum of the binary numbers
        System.out.println("Sum of two binary numbers: " + binarySum);


    }
}
