package JavaClasses.day21_MultiDimensionalArrays;

public class foreach_Loop {

    public static void main(String[] args) {

        // Usage of for each loop ; if there is no need to provide index number

        /* for(DataType variableName:ArrayName){ }
        Variable name represents each of the data in the Array
        DataType must match with Array's data type
         */

        int [] nums = {1,2,3,4};
         // iteration depends on length of the data structure (e.g Arrays)
        for (int eachElement : nums ){
            System.out.println(eachElement);
        }

        String [] arr = {"kamil","jamiryo","retad"};
        for (String eachelement: arr){
            System.out.print(eachelement+" ");
        }
        System.out.println();

        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        for (int each :arr1){
            if (each<5){
                continue;
            }
            System.out.print(each+" ");
        }

        // cant reverse with using for each loop because we cant manipulate for each loop's fixed index

        System.out.println();

        String sentence = "I like Java";
        String [] sp = sentence.split(" ");
        String reverse = "";

        for (int i =sp.length-1; i>=0 ;i--) {
            reverse += sp[i]+" ";
        }
        System.out.println(reverse);






    }
}
