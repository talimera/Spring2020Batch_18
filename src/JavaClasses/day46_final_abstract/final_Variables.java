package JavaClasses.day46_final_abstract;

public class final_Variables {

    final int InstanceVariable = 300;

    //final int InstanceVarialbe2; final instance variables need to be initalized immediately

    static int staticVariable = 1000; // compare to final keyword static can be reassign

    //final static int staticVariable2; even if we have static having final keyword we have to assign value to the variable


    public static void main(String[] args) {

        final double PI = 3.14;

        final String gender = "Male";
         //   gender = "female"; cannot reassign because final keyword gives permanent value to it

        final int score;
        score = 100;

       // score = 200; we can only assign one time because its a final specifier

        System.out.println(score);

        final_Variables obj1 = new final_Variables();

       // obj1.InstanceVarialbe = 400; cant change or reassign because it is final


        staticVariable = 2000;








    }

}
