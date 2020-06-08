package JavaClasses.day42_Inheritance;

public class TestData extends Data{


    public static void main(String[] args) {

        System.out.println(TestData.publicData);
        System.out.println(TestData.protectedData);
        System.out.println(TestData.defaultData);
     //   System.out.println(TestData.privateData); private can never be inheritedn, j 33w422q


        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultData);
    }
}
