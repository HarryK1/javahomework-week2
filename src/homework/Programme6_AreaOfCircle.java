package homework;

import java.util.Scanner;

public class Programme6_AreaOfCircle {
    //main method
    public static void main(String [] args) {

        //create scanner object
        Scanner scanner = new Scanner(System.in);
        //enter radius of the circle
        System.out.print("Enter the radius of the circle: ");
        //read radius
        double radius = scanner.nextDouble();
        //close the scanner
        scanner.close();

        //Calculate area of the circle
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
