package OfficeHours.Practice_05_06_2020;

public class TestersObject {

    public static void main(String[] args) {

        Tester tester1 = new Tester();

        tester1.setInfo("Muhtar","SDET",900_000,121231241);
        System.out.println(tester1);

        Tester tester2 = new Tester();
        tester2.setInfo("Talha","Developer",1000000,12412);
        System.out.println(tester2);

        tester2.smokeTesting();
        tester1.creatingTicket();

    }
}
