package JavaClasses.day18_NestedLoop;

public class NestedLoop2 {

    public static void main(String[] args) {

        for (int r=1; r<=5; r++) {
            for (int i = 1; i <= r; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int r=1; r<=5; r++){
            for (int i=5; i>=r; i--){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (char ch='a'; ch<='z'; ch++){
            for (char b= 'z'; b>=ch; b--){
                System.out.print(b+" ");
            }
            System.out.println();
        }


    }
}
