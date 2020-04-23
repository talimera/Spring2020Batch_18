package JavaClasses.day02_Variables;

public class VariablesPractice {

    public static void main(String[] args) {

        // salary, tax rate, loan, ssn

        int salary = 175000;
        double federalTax = 0.18;
        float stateTax = 0.065f;
        //salary after tax=salary(1-sum of taxes)

        double sumTaxes = federalTax + stateTax;

        double salaryAfterTax = salary * (1-sumTaxes);

        System.out.println(salaryAfterTax);

        // area of the circle= r*r*pi

        double r= 5.5;
        double pi=3.14;
        double area= r*r*pi;
        System.out.println(area);
        // area of circle practice

        //=========================================

        double kg= 75;
        double lb= kg * 2.25;
        System.out.println(lb);







    }
}
