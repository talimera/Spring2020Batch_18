package JavaClasses.day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){

        System.out.println("default constructor");

    }


    public ConstructorCalls2(int a){

        this();
        System.out.println("constructor with an int argument");

    }


    public ConstructorCalls2(String str){
        this(10); // constructor call has to be in the first place before anything
        //this(); constructor can only call one constructor
        System.out.println("constructor with string argument");
    }

    public void method1(){
       // ConstructorCalls2(); cant call constructor in instance method
    }

    {

    }


    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2(1);
        //System.out.println(obj1);

        System.out.println("==================================");

        ConstructorCalls2 obj2 = new ConstructorCalls2("kamil");
    }

}
