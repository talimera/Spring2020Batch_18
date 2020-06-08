package JavaClasses.day34_CustomClass;

public class CapitalOne {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setTesterInfo("Muhtar",123,"Manual Tester",125999);

        ScrumTeam scrum = new ScrumTeam();
        scrum.hireTester(tester1);

        System.out.println(scrum.testersteam.size());

        scrum.fireTester(123);

        System.out.println(scrum.testersteam.size());

    }
}
