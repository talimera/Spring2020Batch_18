package JavaClasses.day38_Constructors;

public class Test {

    public Test(){
        System.out.println("constructor block");
    }

    static{
        System.out.println("static block");
    }

    public static void main(String[] args) {


        Test obj1 = new Test();

        System.out.println("hello");

        Test obj2 = new Test();

        


    }

    {
        System.out.println("instance block");
    }
}
