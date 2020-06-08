package JavaClasses.day35_Static;

public class Static_Variables {

    static String talha = "talha"; // static variable

    int a2 = 200; // instance variable

    public static void main(String[] args) {
        int a1 = 10; //local variable

        Static_Variables obj1 = new Static_Variables();
        obj1.a2 = 1000;

        Static_Variables obj2 = new Static_Variables();
        obj2.a2 = 2000;
        obj1.talha = "kamil";

        System.out.println(obj1.a2);
        System.out.println(obj2.a2);

        System.out.println(obj2.talha);
        System.out.println(obj1.talha);
    }
}
