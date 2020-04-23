package JavaClasses.day19_Arrays;

public class What_is_Array {

    public static void main(String[] args) {


        /*

        3 DATA STRUCTURES

            1-Arrays
            2-Collection
            3-Maps

        Arrays is special kind of variable.
        It allows us store multiple data.

        declaration;

                DataType[] variableName = { multiple data}
                [] can be placed either after dataType or after variableName doesnt make difference.

                    Datatype [] variableName || Datatype variableName []
                    both are correct usage of syntax

         Each data in the array has its own index numbers ;
                    {data1 , data2, data3, data4 }
                       0       1      2      3 ....

         Retrieving data from Array ;
                 variableName [index number] ;
         int a = scores [2];

         -Array size is always fixed.

         - checking the size of the array

                length : returns the length of the array

         initializing the size of array ;

                    1) giving the values;
                            int [] arr = {10,20,30}; the amount of value you give will initialize the array size

                    2) giving the size only

                    if we dont give size , default value will be assigned for arrays

                            int [] arr = new int[length];
                            int [] arr1 = new int[5];

                     Default values are ;

                     byte,short,int,long ==> 0
                     string or any object ==> null








        */

        int []scores = {85,70,100,95,55};

        // Retrieving data from Array
            int a = scores [2];
            int b = scores [1];

        System.out.println(b+a);

        String [] names = {"kamil","kezban","muhtar","baho","Omerbasgan"};
                    //        0        1        2       3        4

        String name1 = names[3];
        System.out.println(name1);

        for (int i =0; i <= 4; i++){
            System.out.println(names[i]);
        }



































































    }
}
