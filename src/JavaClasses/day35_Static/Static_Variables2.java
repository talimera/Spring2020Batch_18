package JavaClasses.day35_Static;

public class Static_Variables2 {

    int insVariable;
    static int staticVariable;

    public static void main(String[] args) {

        Static_Variables2 obj1 = new Static_Variables2();
        obj1.insVariable = 200;
        System.out.println(obj1.insVariable);

        obj1.staticVariable = 400;


        Static_Variables2 obj2 = new Static_Variables2();
        obj2.insVariable = 300;
        System.out.println(obj2.insVariable);
        System.out.println(obj2.staticVariable); // we dont need to initialize for obj2 since we have done it for obj1 because static variables only have one copy for every object

        System.out.println(Static_Variables2.staticVariable);// static can be called through class name


    }
}
