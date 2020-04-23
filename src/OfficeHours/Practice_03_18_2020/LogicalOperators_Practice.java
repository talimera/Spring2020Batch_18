package OfficeHours.Practice_03_18_2020;

public class LogicalOperators_Practice {

    public static void main(String[] args) {


        boolean r1 = "Muhtar" == "Bad Guy"; //false

        System.out.println(r1);

        boolean r2 = "Muhtar" != "Good guy"; // true

        System.out.println(r2);

        boolean r3 = 10 >= 9; // true

        System.out.println(r3);

        //============================================\\ ||  LOGIC OPERATORS

        boolean result1 = 9 != 8 || 9 == 8;

        System.out.println(result1);

        boolean result2 = 9 != 8 && 9 == 8;

        System.out.println(result2);

        boolean result3 = 'a' == 'A' || 'A' == 'b';

        System.out.println(result3);

        //============================================\\ && LOGIC OPERATORS

        boolean a1 = 6>5 && 6<4 ;

        System.out.println(a1);

        boolean a2 = !false != false && !true == false ;

        System.out.println(a2);


    }
}
