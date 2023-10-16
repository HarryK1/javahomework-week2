package homework;

import java.util.Scanner;

public class Programme7_TempConverter {
    //main method
    public static void main(String[] args) {
        //Create a scanner
        Scanner scanner = new Scanner(System.in);
        //Enter temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        //Read the temperature in Fahrenheit
        double fahrenheit = scanner.nextDouble();
        //close the scanner
        scanner.close();

        //Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        //display the temperature in Celsius
        System.out.println(fahrenheit + "°F is equal to " + celsius + " °C ");
    }

}
