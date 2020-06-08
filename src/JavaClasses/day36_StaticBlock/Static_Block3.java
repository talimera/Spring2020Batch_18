package JavaClasses.day36_StaticBlock;

import JavaClasses.day34_CustomClass.Tester;

public class Static_Block3 {


    static String name;
    static int num;

    static Tester tester1;

    static{
        name = "Muhtar";
        num = 12314;
        tester1 = new Tester();
        tester1.setTesterInfo("Namik",124,"Developer",1214231);


    }


    public static void main(String[] args) {
        name ="Muhtar";
        num = 200;
    }

}
