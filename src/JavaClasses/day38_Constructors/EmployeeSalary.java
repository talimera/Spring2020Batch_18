package JavaClasses.day38_Constructors;

public class EmployeeSalary {

    public static void main(String[] args) {

        SalaryCalculator employee1 = new SalaryCalculator(65,45,0.08,0.17);

        System.out.println(employee1);

        System.out.println("=======================================");

        SalaryCalculator employee2 = new SalaryCalculator(62,40,0.0875,0.2);

        System.out.println(employee2);
    }

}
