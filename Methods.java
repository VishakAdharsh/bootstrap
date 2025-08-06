import java.util.Scanner;

class Methods{

    // Type: With Argument and with Return
    // Example: Addition

    public static int add(int a, int b)
    {
        System.out.println("add method is invoked with a: "+ a + " b: " + b);
        int result = a+b;
        return result;
    }

    // Type: Without Argument and Without Return
    // Example: Greet

    public static void greet(){
        System.out.println("Vanakkam |^|");
    }

    // Type: With Argument and Without Return
    // Example: Subtration

    public static void sub(int a, int b){
        System.out.println("sub method is invoked with a: "+ a + " b: " + b);
        int result = a-b;
        System.out.println("Subraction Result: " + result);
    }

    // Type: Without Argument and With Return
    // Example: sendOff
    public static String sendOff() {
        return "sendoff method is involked";
    }
    
    public static void main(String[] args){
        System.out.println("Main method started..");

        Scanner in = new Scanner(System.in);

        greet();

        int a = in.nextInt();
        int b = in.nextInt();

        
        // int summation = add(10, 70);
        // System.out.println(summation);

        System.out.println(add(b, a)); //add(3, 5)
        sub(a, b); //sub(5, 3)
        System.out.println(sendOff());

        System.out.println("Main method ended..");
    }
}