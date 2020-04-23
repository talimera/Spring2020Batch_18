package JavaClasses.day18_NestedLoop;

public class do_whileLoopPractice {

    public static void main(String[] args) {
        int i=0;


        do {

            if (i%2 != 0){
                i++;
                continue;
            }else{
                System.out.print(i + " ");
            }

            i++;


        } while (i<=100);





        }
    }