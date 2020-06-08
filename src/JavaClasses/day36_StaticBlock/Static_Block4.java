package JavaClasses.day36_StaticBlock;

import JavaClasses.day34_CustomClass.Tester;

public class Static_Block4 {

    static String name;
    static Tester tester1 = new Tester();


    static {
        name = "Cybertek School";
        tester1.setTesterInfo("muhtar",123,"Sdet",12314124);
        tester1.setTesterInfo("namik",123,"sdet",123000);

    }

    public static void main(String[] args) {
        System.out.println(name);
    }
}
