package homework;

import java.util.Scanner;

public class Programme8_AreaOfTriangle {
    //main method
    public static void main(String [] args){
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //enter base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        //close the scanner
        scanner.close();

        //calculate area of a triangle
        double area = (base * height) / 2.0;
        //display the calculated area
        System.out.println("The area of the triangle is: " + area);
    }
}
