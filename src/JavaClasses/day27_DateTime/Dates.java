package JavaClasses.day27_DateTime;

import java.time.LocalDate;

public class Dates {

    /*
        methods
        isAfter():
        isBefore():
        isEqual():
        isLeapyear():
     */

    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020,10,25);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(1992,12,12);
        System.out.println(birthday);

        //isAfter(date2)
        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);

        // isBefore(date2)
        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);

        // isEqual(date2)
        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

        //isLeapyear
        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("=================================");

        LocalDate now = LocalDate.now();
        System.out.println(now);

        String str = now.toString();
        str = str.replaceAll("-","/");
        System.out.println(str);


    }

    public static void Birthday (int a, int b, int c){
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate BirthRahman = LocalDate.of(1990,04,23);
        int month = BirthRahman.getMonthValue();
        int day = BirthRahman.getDayOfMonth();

        int month1 = now.getMonthValue();
        int day1 = now.getDayOfMonth();

        if ((month==month1)&&(day==day1)){
            System.out.println("Happy Birthday");
        }else{
            System.out.println("not your birhtday");
        }
    }
}
