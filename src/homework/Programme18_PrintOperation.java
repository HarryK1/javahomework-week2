package homework;

import java.util.Scanner;

public class Programme18_PrintOperation {
    public static void main(String [] args){
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //enter the first number
        System.out.print("Input the first number: ");
        double firstNumber = scanner.nextDouble();
        //enter the second number
        System.out.print("Input the second number: ");
        double secondNumber = scanner.nextDouble();
        //close the scanner
        scanner.close();
        //perform arithmetic operations
        double sum = firstNumber + secondNumber;
        double subtract = firstNumber - secondNumber;
        double multiply = firstNumber * secondNumber;
        double divide = firstNumber / secondNumber;
        double remainder = firstNumber % secondNumber;
        //display the results
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        System.out.println(firstNumber + " - " + secondNumber + " = " + subtract);
        System.out.println(firstNumber + " * " + secondNumber + " = " + multiply);
        System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
        System.out.println(firstNumber + " % " + secondNumber + " = " + remainder);
    }
}
