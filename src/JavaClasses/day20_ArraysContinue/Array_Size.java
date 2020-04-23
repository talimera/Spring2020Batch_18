package JavaClasses.day20_ArraysContinue;

public class Array_Size {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3};

        // System.out.println(arr1[100]); // out of bounds exception

        int [] nums = new int[2];

        nums[0] = 10;
        nums[1] = 20;

        System.out.println(nums[0]);
        System.out.println(nums[1]);

        nums = new int[3]; // A new command will reset the array size and reset database and will be empty

        System.out.println(nums[0]);
        System.out.println(nums[1]);

    }
}
