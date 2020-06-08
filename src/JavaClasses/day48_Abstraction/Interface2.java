package JavaClasses.day48_Abstraction;

public interface Interface2 {

    // public Interface2 (); cannot have constructor in interface

    //public void method1(){} cannot have instance method either

    // cant have instance variable

    // { } can have instance block either

    // static { } cant have static block either

    public static final int a =100; // by default make it public

    public static void main(String[] args) {

        System.out.println(a);

        // a = 200; can have instance variable because they belong to the object . interface creates abstraction and abstraction doesnt allow creation of object


    }

    static void method4(){}

    void method5();

    default void method6(){}; // default method only used in interface and allows us to use special Lambda expression

}
