package homework;

public class Programme1 {
    //Declare two instance variables
    int variable1;
    String variable2;
//Declare one instance method
    public void myMethod(){
//Call both instance variables
        System.out.println("Instance variable 1: " + variable1);
        System.out.println("Instance variable 2: " + variable2);
    }
    //Declare main method
    public static void main(String [] args){
        //Create an object of the class
        Programme1 n1 = new Programme1();
        //set values for instance variables
        n1.variable1 = 20;
        n1.variable2 = "Prime Testing";

        //call instance method in main method
        n1.myMethod();
    }

}
