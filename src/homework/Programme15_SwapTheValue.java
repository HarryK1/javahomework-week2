package homework;

public class Programme15_SwapTheValue {
    public static void main(String [] args){
        //define two variables
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        //swap the values without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
