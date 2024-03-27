package Instance_Static_variable;

public class HelloWorld {
    
    public String myVar = "instance variable";
    public static String myClassVar = "class or static variable"; 
  
    public static void printHelloWorld(){
        String myVar = "Variable inside a Method";
        System.out.println(myClassVar);
        System.out.println(myVar);

    }

    public static void main(String[] args) {
        printHelloWorld();
    }



}
