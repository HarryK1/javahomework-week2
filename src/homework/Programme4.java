package homework;

public class Programme4 {
    //Declare two instance and two static variables
    int instanceVar1;
    int instanceVar2;
    static int staticVar1;
    static int staticVar2;

    //Declare one instance method
    public void instanceMethod(){
        //call all instance and static variables
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }
    //Declare one static method
    public static void staticMethod(){
        Programme4 b1 = new Programme4();
        System.out.println("Instance Variable 1: " + b1.instanceVar1);
        System.out.println("Instance Variable 2: " + b1.instanceVar2);
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }
    //create main method
    public static void main(String [] args){
        Programme4 t1 = new Programme4();
        //set values for instance and static variables
        t1.instanceVar1 = 15;
        t1.instanceVar2 = 25;
        staticVar1 = 35;
        staticVar2 = 45;

        //call both instance and static method into main method
        t1.instanceMethod();
        staticMethod();

    }
}
