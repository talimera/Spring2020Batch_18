package JavaClasses.day37_Constructors;

public class ConstructorIntro {

    // every class must have a constructor.Otherwise compiler will provide by default

    public ConstructorIntro(int a){

        System.out.println("Constructor with argument of int");

    }

    public static void main(String[] args) {

       // ConstructorIntro obj1 = new ConstructorIntro();

        ConstructorIntro obj2 = new ConstructorIntro(1);

        ConstructorIntro ojb3 = new ConstructorIntro(1);



    }

}
