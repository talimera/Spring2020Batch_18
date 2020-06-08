package JavaClasses.day40_Encapsulation;

public class Test {

    public static void main(String[] args) {

        Encapsulation obj1 = new Encapsulation();

        //  System.out.println(obj1.SSN); cant call it because it is private

        long ssn = obj1.getSSN();

        System.out.println(ssn);

        obj1.setSSN(213546465);

        System.out.println(obj1.getSSN());
    }
}
