package JavaClasses.day09_NestedIf_Ternary;

public class ageGroups_NestedIf {

    /* write a program that can define the age of groups of a person
    age groups are:
                Teenager (<21)
                Adult ( >=21 && <55)
                Senior (>55)

                age cannot be negative or greater than 150
     */

    public static void main(String[] args) {

        short age = 55;
        String tas = "";

        if(age>0 && age<150){

            if( age<21){
                tas = "Teenager";
            }else if(age<55){
                tas = "Adult";
            }else {
                tas = "Senior";
            }
        }else{
                tas = "Invalid Entry";
        }

        System.out.println(tas);

     //=============================================================\\

        short age2 = 45;
        String ageGroup2 = "";

        if(age2 < 150 && age2>0){

            ageGroup2 = (age2<21) ? "Teenager" : (age<55) ? "Adult": "Senior";

        }else {
            ageGroup2 = "Invalid Entry";
        }

        System.out.println(ageGroup2);



    }
}
