package JavaClasses.day26_MethodOverloading;

public class MethodOverloading3 {

    public static void main(String[] args) {

        sum(1,2); // int sum method
        sum(10.0,10); // double sum method


    }

    public static void sum (int a, int b){
        System.out.println(a+b);
    }

    public static double sum (double a, double b){
        return a+b;
    }

}
