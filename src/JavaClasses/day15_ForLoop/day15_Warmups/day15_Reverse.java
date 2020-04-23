package JavaClasses.day15_ForLoop.day15_Warmups;

import java.util.Scanner;

public class day15_Reverse {

    public static void main(String[] args) {

        /*write a program that can reverse the following string:
				String str = "Java";
				output: avaJ
			please provide two solutions:
						first solution, you MUST use substring method
						second solution, you MUST use charAt method
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your one word");
        String str = scan.next();

        String reverse = "" +str.charAt(str.length()-1) + str.charAt(str.length()-2)+str.charAt(str.length()-3)+
                str.charAt(str.length()-4)+str.charAt(str.length()-5);
        if(!(str.length()==5)){
            System.out.println("Please write 5 letter words");
        }else{
            System.out.println(reverse);
        }

        String str2 = "Batch 18";

        String sa = str2.trim();
        System.out.println(sa);





    }


}
