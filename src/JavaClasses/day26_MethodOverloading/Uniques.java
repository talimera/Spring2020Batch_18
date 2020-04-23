package JavaClasses.day26_MethodOverloading;

public class Uniques {

    public static void main(String[] args) {
        String str = "asdfhhhffbbvsaeww";
        String result = "";

        for (int i = 0; i<str.length(); i++){
            int num = frequency(str,str.charAt(i));
            if (num == 1){
                result += str.charAt(i);
            }
        }
        System.out.println(result);

        String str2 = "Cybertek";
        String uniq = Uniques(str2);
        System.out.println(uniq);
    }

    public static String Uniques (String str){

        String result = "";

        for (int i = 0; i<str.length(); i++){
            int num = frequency(str,str.charAt(i));
            if (num == 1){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static int frequency(String str, char ch) { // counts char (ch) frequency
        char[] arr = str.toCharArray();
        int count = 0;
        for (char each : arr) {
            if (each == ch) {
                count++;
            }
        }
        return count;
    }
}
