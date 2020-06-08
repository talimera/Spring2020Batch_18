package OfficeHours.Practice_05_06_2020;

public class AppleINC {

    public static void main(String[] args) {

        Tester tester1 = new Tester();

        tester1.setInfo("Onur","Junior Tester",75000,1245);

        Tester tester2 = new Tester();
        tester2.setInfo("Rahman","SDET",120000,22222);

        Tester tester3 = new Tester();
        tester3.setInfo("Adil", "SDET", 111000, 1020304050);

        ScrumTeam scrum1 = new ScrumTeam();
        scrum1.hireTester(tester1);
        scrum1.hireTester(tester2);
        scrum1.hireTester(tester3);

        scrum1.fireTester(22222);

       for (Tester eachtester :scrum1.testers) {
           System.out.println(eachtester);
       }

        System.out.println(scrum1.developers.size()); // number of developers in Scrum Team

        System.out.println("================================================================");


        Developer dev1 = new Developer();
        dev1.setInfo("Barzy","Senior Developer",220200,1122337);
        Developer dev2 = new Developer();
        dev2.setInfo("Kim", "Junior Developer", 120000, 90678);

        scrum1.hireDeveloper(dev1);
        scrum1.hireDeveloper(dev2);

        System.out.println(scrum1.developers.size());

        int scrumsize = scrum1.developers.size()+scrum1.testers.size();

        System.out.println(scrumsize);


        System.out.println("================================================================");


    }
}
