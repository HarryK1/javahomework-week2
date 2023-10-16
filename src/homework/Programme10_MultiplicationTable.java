package homework;

import java.util.Scanner;

public class Programme10_MultiplicationTable {
    //main method
    public static void main(String [] args){
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //enter a number
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        //close the scanner
        scanner.close();

        //print multiplication table up to 10
        for(int i = 1; i <= 10; i++){
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }

    }
}
