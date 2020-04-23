package OfficeHours.Practice_04_08_2020;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class ForLoop_Task {

    // TASK = DIVISILBLE BY 3 or 5

    public static void main(String[] args) {

        for (int i=0; i<=100; i++){
            if (i%3 ==0 || i%5 == 0) {
                System.out.print(i + " ");
            }

        }

        System.out.println("=============================");

        String name = "Talha";

        String reverse ="";

        int lastindex = name.length()-1;

        for (int i=lastindex; i>=0; i--){
            //reverse+= name.charAt(i); // charAt() method
            reverse = reverse + name.substring(i,i+1); // subst
        }

        System.out.println(reverse);

        if (name.equalsIgnoreCase(reverse)){
            System.out.println(name+" is palindrome name");
        }else{
            System.out.println(name+" is not palindrome name");
        }


    }
}
