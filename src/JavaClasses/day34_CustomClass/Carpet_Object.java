package JavaClasses.day34_CustomClass;

import java.util.ArrayList;

public class Carpet_Object {

    public static void main(String[] args) {

        // Carpet carpet1 = new Carpet();

        Carpet [] carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet()};

        carpets[0].customOrder(7,8.5,20,true);
        carpets[1].customOrder(10,15,30,false);
        carpets[2].customOrder(9,20,15,true);
        carpets[3].customOrder(20,18,25,false);
        carpets[4].customOrder(35, 45, 35, true);

        System.out.println(carpets[0]);
        System.out.println("=============");
        System.out.println(carpets[1]);

        ArrayList<Carpet> persian = new ArrayList<>();
        ArrayList<Carpet> regular = new ArrayList<>();

        for (Carpet eachCarpet : carpets){
            if (eachCarpet.isPersian){
                persian.add(eachCarpet);
            }else{
                regular.add(eachCarpet);
            }
        }

        System.out.println(persian);
        System.out.println("====================");
        System.out.println(regular);

        System.out.println(persian.size());



    }

}
