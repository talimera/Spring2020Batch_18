package JavaClasses.day06_Shorthnd_LogicalOperators;

public class LogicalOperators {

    public static void main(String[] args) {

        // Opposite Logical Operator !!!!!!!!!!!!!!!!!!!!!!!!
        boolean result1= true ;
        System.out.println(!result1);

        boolean result2= 10 + 15> 15;
        System.out.println(result2);

        boolean  result3 = !true == !false;
        System.out.println(result3);


        //===========================================================//

        // AND && LOGICAL OPERATOR //

        boolean R1 = "CoronaVirus" != "End of the world" && "Toilet Paper" == "Cure";
        System.out.println(R1);

        boolean R2 = 10>15 && 15<13;
        System.out.println(R2);

        boolean R3 = 'a' == 'b'-1 && 'b'+1 == 'c' ;
        System.out.println(R3);

        // OR || lOGICAL OPERATOR //

        boolean t1 = true != false || false == !true ;
        System.out.println(t1);





    }
}
