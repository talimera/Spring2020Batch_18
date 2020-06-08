package JavaClasses.day46_final_abstract;

public class final_Practices {


    final int a = 10;
    final static int b = 12;

    {

        System.out.println(a);
        // a = 20; final cannot be reassign


    }

    static {

        System.out.println(b);
        // b = 30; final cannot be reassign


    }


    public final_Practices (){


    }

    public final void method1(){

    }

    public final double method1(double b){return b;} // final methods can be overloaded as long as we stay true with overloading rules

    public final int method1(int a){return a;}  // final methods can be overloaded as long as we stay true with overloading rules

    public final static void method2(){

    }


    class test extends final_Practices{

        //public final void method1(){} cant be overriden because original method has the final keyword







    }



}
