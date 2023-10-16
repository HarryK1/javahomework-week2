package homework;

import java.util.Scanner;

public class Programme13_AverageOfNumbers {
    public static void main(String [] args){
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();
        //close the scanner
        scanner.close();

        //calculate the average
        double average = (num1 + num2 + num3) / 3.0;

        //display the calculated average
        System.out.println("The average of the three numbers is: " + average);
    }
}
