package JavaClasses.day28_DateTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");

        LocalTime time1 =LocalTime.of(16,30,12);

        System.out.println(time1.format(dtf));

        LocalTime time2 = LocalTime.of(9,30,59);

        System.out.println(time2.format(dtf));

        LocalTime time3 = LocalTime.of(0,0,23);
        System.out.println(time3.format(dtf));

    }
}
