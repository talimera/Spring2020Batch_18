package JavaClasses.day16_ForLoop.day16_Warmups;

public class Upper_Lower_Alphabet {

    public static void main(String[] args) {

        String upper ="";
        String lower= "";


        for (char ch = 'A'; ch<= 'Z'; ch++){
            upper += ch;
        }

        for (char ch= 'a'; ch<= 'z'; ch++){
            lower += ch;
        }
        String result ="";
        for (int i=0; i <=upper.length()-1 ; i++){
            result +=""+upper.charAt(i)+ lower.charAt(i)+" ";
        }
        System.out.println(result);

    }
}
