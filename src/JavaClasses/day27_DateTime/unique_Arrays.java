package JavaClasses.day27_DateTime;

public class unique_Arrays {

    public static void main(String[] args) {

        int [] arr = {1,2,3,3,1,4};

         uniqueElements(arr);


}

    public static void uniqueElements (int arr [] ){
        for (int each2 : arr){

            int count= 0;
            for (int each : arr){
                if (each == each2){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(each2);
            }
        }
    }
}
