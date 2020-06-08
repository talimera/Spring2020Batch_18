package JavaClasses.day42_Inheritance;

class B {

    public B(int a){
        System.out.println("int");
    }

    public B (double a){
        System.out.println("double");
    }

    public B (long a){
        System.out.println("long");
    }


}

public class InheritanceReview extends B{

    public InheritanceReview(String A){
        super(12l);
        System.out.println("String");
    }

    public static void main(String[] args) {

        InheritanceReview obj1 = new InheritanceReview("a");

    }



}
