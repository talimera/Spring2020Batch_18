package JavaClasses.day18_NestedLoop;

public class do_whileLoopPractice2 {

    public static void main(String[] args) {

        int z =1;

        do {
            System.out.println(z);
            if (z == 2){
                break;
            }
            // System.out.println(z);  if we out print statement after if statement it will increment one than break due to if statement and we will get result of 1 instead (1,2)!!!
            z++;
        }while (z<=5);

        System.out.println("===================================");

        int y = 1;

        do {
            if(y==3){
                y++;
                continue;
            }
            System.out.println(y);
            y++;
        }while (y<=5);

        System.out.println("====================================");

    }
}
