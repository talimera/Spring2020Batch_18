package JavaClasses.day47_Abstraction;

public class Abstract_Vs_NonAbstract {




}



class Test1 {
    public Test1(){

    }

    public void method1(){

    }

    public static void method2(){


    }

    int a = 200;

    static int b = 213;

    // cant have abstract method in regular class
    //public abstract void method3();



}



abstract class Test2 {

    // CANT USE FINAL KEYWORD IN ABSTRACT CLASS

    public Test2(){

    }

    public void method1(){}

    public static void method2(){}

    public abstract void method3();

    int a = 100;

    static int b = 209;

    {
        //CAN HAVE INSTANCE METHOD
    }

    static{
        // CAN HAVE STATIC METHOD
    }

    public static void main(String[] args) {
        //Test2 obj1 = new Test2();
        // CANT CREATE OBJECT
    }




}
