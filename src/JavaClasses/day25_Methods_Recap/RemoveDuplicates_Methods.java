package JavaClasses.day25_Methods_Recap;

public class RemoveDuplicates_Methods {

    public static void main(String[] args) {

        String str = "talhameral";
        String nonDuplicates = RemoveDuplicates(str);
        System.out.println(nonDuplicates);
    }



    public static String RemoveDuplicates (String str) {

        String result = "";

        for (int i = 0; i<str.length(); i++){
            if (!result.contains(""+str.charAt(i))){
                result +=""+ str.charAt(i);
            }
        }

        return result;

    }
}
