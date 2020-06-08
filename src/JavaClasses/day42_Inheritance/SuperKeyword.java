package JavaClasses.day42_Inheritance;

public class SuperKeyword extends A {



    public static void main(String[] args) {

        SuperKeyword obj1 = new SuperKeyword();

        System.out.println("==========================");

        A obj2 = new A(12.3);




    }

    int a = 200;
    public SuperKeyword(){
        super(12.2);
        System.out.println(super.a);
    }




}


class A {

    int a = 100;
    public A(double b){
        System.out.println(this.a);
    }


}
