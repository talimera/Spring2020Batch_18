package JavaClasses.day10_Switch_Scanner;

public class localVariables {

    public static void main(String[] args) {

        // declare variable: DataType variableName;

        int a = 0;

        if(true){
            System.out.println(a);
            int b = 10;
        }
       // System.out.println(b); // wont compile because variable declared is outside of this block !!!!

        switch(3){
            case 1: // each case is considered as a individual blocks.
                int c = 100;
            case 2:
            //    System.out.println(c); // We cant use variable c because c belongs to case block 1 !!!!

        }


        if(9>10){
            int t = 100;
        }else if(11>10){
            int y= 200;
        }else if(12>10){
            int z = 300;
        }
    /*
        cant use any of these variables because they belong within their blocks.
        System.out.println(z);
        System.out.println(y);
        System.out.println(t);
    */
    }
}
