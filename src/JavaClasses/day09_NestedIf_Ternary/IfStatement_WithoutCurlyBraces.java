package JavaClasses.day09_NestedIf_Ternary;

public class IfStatement_WithoutCurlyBraces {

    public static void main(String[] args) {
        int number = 100;
        // only executes one statement without curly braces. It doesnt have any common usage.
        if (number % 2 == 0)
            System.out.println("Even Number");
            // if we put another print statement here it will give us compile error because without braces we are only allowed give one print statement
        else
            System.out.println("Odd Number");


    }
}
