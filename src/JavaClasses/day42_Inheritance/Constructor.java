package JavaClasses.day42_Inheritance;

class test{

    public test(){
        System.out.println("super class default constructor");
    }

}





public class Constructor extends test {

    public Constructor (){
        System.out.println("sub class default constructor");
    }

    public static void main(String[] args) {

        Constructor obj1 = new Constructor();

    }


}
