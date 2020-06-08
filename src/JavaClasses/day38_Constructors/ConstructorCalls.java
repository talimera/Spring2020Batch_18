package JavaClasses.day38_Constructors;

public class ConstructorCalls {

    String name;

    public ConstructorCalls(){
        method1();
        method2();
    }

    public ConstructorCalls(int a){
        this();

    }

    public static void method1(){
      //  method2(); cant call because method2 is not static method
      //  ConstructorCalls(); only constructor can call a constructor !!!
    }

    public void method2 (){

    }

}
