package JavaExtraPractices;

public class ExtraPractices {

    public static void main(String[] args) {

        double lb = 2.25;
        double kg = 1;
        double KgToPound = lb*kg;
        // program that can convert kg to lb.
        System.out.println(KgToPound);


        double lt = 6;
        double gl = 1/3.7;
        double lttogl= lt*gl;
        // program that can convert liters to gallons
        System.out.println(lttogl);


        double pounds = 36;
        double kilo = 0.435;
        double poundtokilos = pounds*kilo;
        // program that can convert pounds to kilograms
        System.out.println(poundtokilos);


        double gallons= 8.5;
        double liters = 3.7;
        double galstolits = gallons*liters;
        // program that can convert gallons to liters
        System.out.println(galstolits);

        double lira = 35;
        double dollar = 0.16;
        double liratodollar= lira*dollar;
        // program that can convert liras to dollars
        System.out.println(liratodollar);


        double r = 9.2;
        double pi = 3.14;
        double area= r*r*pi;
        // program that can calculate area of circle
        System.out.println(area);

        double l = 5;
        double w = l;
        double square= l*w;
        // program that can calculate the area of the square
        System.out.println(square);


        double rate = 81;
        double stateTax= 0.05;
        double federalTax= 0.19;
        byte weeklyHours= 45;
        double salary = rate*weeklyHours*52;
        double aftertax= salary*(1-federalTax+stateTax);
        //Salary calculator  for salary before and after tax-cut.
        System.out.println(salary);
        System.out.println(aftertax);








    }




}

