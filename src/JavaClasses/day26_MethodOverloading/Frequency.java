package JavaClasses.day26_MethodOverloading;

public class Frequency {

    public static void main(String[] args) {

        String str = "AAA";
        char ch = 'A';
        int occurence = frequency(str,ch);
        System.out.println(occurence);

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