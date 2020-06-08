package JavaClasses.day40_Encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("talha");
        System.out.println(person1.name);

        //System.out.println(person1);

        person1.setSSN(12451213);
        person1.setId(12341);

        System.out.println(person1.getSSN());
        System.out.println(person1.getId());


    }
}
