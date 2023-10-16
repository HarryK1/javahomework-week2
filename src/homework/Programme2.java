package homework;

public class Programme2 {
    //Declare two static variables
    static int staticVariable1;
    static String staticVariable2;
// Declare one static method
    static void myMethod(){
        //call both variables in static method
        System.out.println("Static Variable 1: " + staticVariable1);
        System.out.println("Static Variable 2: " + staticVariable2);
    }
    //Declare main method
    public static void main(String [] args){
        //set values for static variables
        staticVariable1 = 10;
        staticVariable2 = "Prime Testing";
        //call static method into main method
        myMethod();
    }


}
