package JavaClasses.day17_WhileLoops;

public class PalidromeTest {

    public static void main(String[] args) {

        String str = "Java";

        String reversedStr ="";

        int index = str.length()-1;

        while(index>=0){
            reversedStr += str.charAt(index);
            index--;
        }
        System.out.println(reversedStr);
    }

}
