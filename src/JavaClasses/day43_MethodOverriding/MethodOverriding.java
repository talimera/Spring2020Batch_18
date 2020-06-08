package JavaClasses.day43_MethodOverriding;

public class MethodOverriding extends Test {
    @Override
    public void method(){
        System.out.println("Zarina");
    }


    public static void main(String[] args) {
        Test obj1 = new Test();

        obj1.method();

        MethodOverriding obj2 = new MethodOverriding();

        obj2.method();
    }





}

class Test {


     void method(){
        System.out.println("Onur");
    }


}
