package JavaClasses.day18_NestedLoop;

public class do_whileLoop_2 {

    public static void main(String[] args) {

        int number = 103;

        while (number >=100){ // if we change the condition to false condition it will be false and wont execute anything !!!

            System.out.println(number);
            number--;
        }

        System.out.println("================================");

        int num1 = 103;
        do {
            System.out.println(num1);
            num1--;
        }while ( num1 >=100); // if we change the condition to false it will only gets executed once !!!

    }

}
