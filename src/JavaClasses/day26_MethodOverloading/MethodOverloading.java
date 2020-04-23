package JavaClasses.day26_MethodOverloading;

public class MethodOverloading {

    public static void main(String[] args) {

        // Method overloading is multiple methods sharing the same names
        // We can use it if we use different dataType or different number of parameters

       // method(10);
       // method(20,12);
        /*
        benefits :
        -easy to read
        -reusable
        -easy to remember
        - very flexible
         */

    }

    public static void method(int a){
        System.out.println("Original Method");
    }

    public static void method (int a,int b){
        System.out.println("Overloaded method");
    }

}
