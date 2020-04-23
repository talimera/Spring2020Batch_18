package JavaClasses.day10_Switch_Scanner;

public class SwitchStatement_Practice2 {

    public static void main(String[] args) {

        int num = 0;

        switch (2){
            case 1:
                num += 3;

            case 2:
                num += 2;

            case 3:
                num += 10;

            default:
                num -= 5;
                break;
        }

        System.out.println(num);

        char ch1 = 'A';

        switch (ch1){

            case 'A':
                System.out.println('A');
                break;
            case 'B':
                System.out.println('B');
                break;
            case 'C':
                System.out.println('C');
                break;
            case 'D':
                System.out.println('D');
            case 'E':
                System.out.println('E');
                break;
            default:
                System.out.println("Invalid Entry");
                break;
        }





    }


}
