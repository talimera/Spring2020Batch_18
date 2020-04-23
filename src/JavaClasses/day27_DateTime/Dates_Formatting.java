package JavaClasses.day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    /*
    EEEE full name of the day
    EEE three letters od the day (can be E or EE too )
    MM number of the month
    MMM three letters of the month
    MMMM full name of the month
    YY last two digit of the given year
    YYYY full number of the given year
     */

    public static void main(String[] args) {

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("EEE MMMM/dd/yyyy");

        LocalDate local1 = LocalDate.now();
        System.out.println(local1.format(DTF));

        LocalDate local2 = LocalDate.now();

        System.out.println(local2.format(DTF));

    }
}
