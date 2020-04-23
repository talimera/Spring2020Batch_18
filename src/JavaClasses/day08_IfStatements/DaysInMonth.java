package JavaClasses.day08_IfStatements;


/*
28 days: 2
30 days: 4,6,9,11
31 days: 1,3,5,7,8,10,12
 */
public class DaysInMonth {

    public static void main(String[] args) {

        byte  month = 11;

        boolean day28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean days31 = !day28 && !days30;

        if(days31) {
            System.out.println("Month has 31 days"); }
        if (day28){
             System.out.println("Month has 28 days"); }
        if(days30){
             System.out.println("Month has 30 days"); }
        }
    }

