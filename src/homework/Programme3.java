package homework;

public class Programme3 {
    // Declare one instance and one static variable
    int instanceVariable;
    static int staticVariable;

    //Declare one instance method
    public void instanceMethod() {
        //call both instance and static variables into instance method
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }

    //Declare one static method
    public static void staticMethod() {
        //call both instance and static variables into static method
        Programme3 t2 = new Programme3();
        System.out.println("Instance Variable: " + t2.instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
    }

    //Declare main method
    public static void main(String[] args) {
        //create an object of the class
        Programme3 obj = new Programme3();
        //set values for instance and static variables
        obj.instanceVariable = 21;
        staticVariable = 45;

        //call instance and static method into main method
        obj.instanceMethod();
        staticMethod();
    }


}
