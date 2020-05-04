package JavaClasses.day33_CustomClass;

public class catObjects {

    public static void main(String[] args) {

        Cat cat1 = new Cat();

        cat1.setCatInfo("Siemes","White",2,"Azman");
        System.out.println(cat1);

        Cat cat2 = new Cat();
        cat2.setCatInfo("Scottish","Orange",5,"Guppy");
        System.out.println(cat2);

        Cat cat3 = new Cat();
        cat3.setCatInfo("Turkish Van","White",1,"KittyKitty");
        System.out.println(cat3);


        System.out.println("=================================");
        cat1.sleep();
        cat2.sleep();

        System.out.println("=================================");
        cat1.eat("ciger");
        cat2.eat("catnip");

        System.out.println("=============================");
        cat1.drink("Water");
        cat2.drink("Milk");
    }
}
