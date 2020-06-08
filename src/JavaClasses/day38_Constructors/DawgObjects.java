package JavaClasses.day38_Constructors;

public class DawgObjects {

    public static void main(String[] args) {

        TheDawg dawg1 = new TheDawg();

        System.out.println(dawg1.age);
        System.out.println(dawg1.breed);
        System.out.println(dawg1.name);


        System.out.println("=========================");

        TheDawg dawg2 = new TheDawg("husky");

        System.out.println(dawg2.name);
        System.out.println(dawg2.breed);
        System.out.println(dawg2.age);

        System.out.println("=========================");

        TheDawg dawg3 = new TheDawg("chiuahuha",2);

        System.out.println(dawg3.name);
        System.out.println(dawg3.breed);
        System.out.println(dawg3.age);

    }

}
