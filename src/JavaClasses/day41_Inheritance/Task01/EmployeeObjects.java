package JavaClasses.day41_Inheritance.Task01;

public class EmployeeObjects {

    public static void main(String[] args) {

        Developer dev1 = new Developer("Jack",130_000,321654, "FullTime", 'M');

        dev1.fixingBug();
        dev1.coding();


        BusinessAnalyst analyst1 = new BusinessAnalyst("Ozgur",123141,123141,'M');

        analyst1.gathering();
        analyst1.writingReq();

    }
}
