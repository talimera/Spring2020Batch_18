package OfficeHours.Practice_04_15_2020;

public class _4for_eachLoop {

    public static void main(String[] args) {

        /*
        for each loop ; can only apply to data collection in hand
            syntax for(DataType variableName: Array or DataStructure)
            Data Type and Data Structure's datatype have to match !!
        */

        int [] arr = {1,2,3,4};

        for (int each: arr){
            System.out.println(each);
        }
    }
}
