package JavaClasses.day42_Inheritance;


class Test{

    public Test(int a){
        System.out.println("super class default constructor");
    }

}


    public class Constructor2 extends Test{

    public Constructor2(){
        super(12); // If the super class constructor is not default constructor we need to call constructor manually by using super(arg);
        System.out.println("sub class default constructor");
    }




}