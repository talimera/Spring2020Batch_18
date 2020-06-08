package JavaClasses.day38_Constructors;

public class ConstructorCalls3 {

    // constructor cant call itself
    // constructor cant call itself by call another constructor that it contains

    public  ConstructorCalls3(){

        this(3);
        System.out.println("default");

    }


    public  ConstructorCalls3(int a){

        System.out.println("int argument");

    }


    public static void main(String[] args) {

        ConstructorCalls3 obj1 = new ConstructorCalls3();


    }




}
