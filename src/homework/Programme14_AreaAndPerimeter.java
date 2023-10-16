package homework;

import java.util.Scanner;

public class Programme14_AreaAndPerimeter {
    public static void main(String [] args){
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //enter width and height of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of the rectangle: ");
        double height = scanner.nextDouble();
        //close the scanner
        scanner.close();
        //calculate area and perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);
        //display calculated area and perimeter
        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ")= " + perimeter);
    }
}
