package JavaClasses.day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class BankOfAmerica {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Talha",12314115,"SDET",200000);

        Tester tester2 = new Tester();
        tester2.setTesterInfo("Venera",234567834,"Senior SDET",150000 );

        Tester tester3 = new Tester();
        tester3.setTesterInfo("Michael", 234567654,"QA", 95000.00);

        Tester tester4 = new Tester();
        tester4.setTesterInfo("Muhtar",111,"Manual Tester",120000);

        Tester tester5 = new Tester();
        tester5.setTesterInfo("John",12314,"Uber Driver",60000);

        Predicate<Tester> sdets = p -> !p.jobTitle.contains("SDET");


        ArrayList<Tester> testers = new ArrayList<>();
        testers.addAll(Arrays.asList(tester1,tester2,tester3,tester4,tester5));
        testers.removeIf(sdets);

        double totalBudget = 0;
        for (Tester eachTester : testers){
            System.out.println(eachTester);
            totalBudget += eachTester.salary;
        }

        System.out.println(totalBudget);


    }
}
