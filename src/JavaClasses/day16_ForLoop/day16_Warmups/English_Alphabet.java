package JavaClasses.day16_ForLoop.day16_Warmups;

public class English_Alphabet {

    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch+" ");
        }
        System.out.println(" ");
        System.out.println("=========================================");
        for (char ch1 = 'Z'; ch1>='A'; ch1--){
            System.out.print(ch1+" ");
        }
    }
}
