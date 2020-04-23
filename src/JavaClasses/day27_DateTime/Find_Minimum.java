package JavaClasses.day27_DateTime;

public class Find_Minimum {

    public static void main(String[] args) {

        int arr[] = {5, 4, 6, 3};


    }

    public static int minumum(int[] arr) {
        int minimum = arr[0];

        for (int each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }
}