package JavaClasses.day48_Abstraction;

public class PhoneObjects {

    public static void main(String[] args) {

        iPhone phone1 = new iPhone("5",299,"small");

        phone1.calling(213412414);
        phone1.faceTiming(13124814);
        phone1.texting(12314145);

        System.out.println(phone1);

        Samsung phone2 = new Samsung("Note 10",1000,"Large");

        phone2.calling(12314);
        phone2.texting(1142314);

        System.out.println(phone2);

    }

}
