package JavaClasses.day35_Static;

public class Static_Methods {

    int a = 100;
    static int b = 200; // global variable

    public static void main(String[] args) {

        // System.out.println(a); static only accepts static, to be able to call instance variable you need to create object instance.

        Static_Methods obj1 = new Static_Methods();
        System.out.println(obj1.a);

        System.out.println("=======================================");

        System.out.println(b);
        System.out.println(Static_Methods.b);
        System.out.println(obj1.b); // static preferred to be called through class name not by object



    }

    public void method(){
        System.out.println(a);
        System.out.println(b);
    }
}
