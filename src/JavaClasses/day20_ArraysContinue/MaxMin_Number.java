package JavaClasses.day20_ArraysContinue;

public class MaxMin_Number {

    public static void main(String[] args) {

        int [] arr = {2,3,4,5,6,7,8,9};

        int lastindex = arr.length -1 ;
        int max = arr[0];
        int min = arr[0];

        for (int i= 0; i<=lastindex; i++){

            if (arr[i] > max){  // array's index are compared with each other , and whichever is greater will be assigned to the max value.
                max = arr[i];
            }

            if (arr[i] < min){
                min = arr [i];
            }
        }

        System.out.println(max);
        System.out.println(min);

    }

}
