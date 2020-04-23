package JavaClasses.day22_Arrays_Loops_Practice;

public class NestedLoop_3 {

    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        int odd = 0;
        for (int k = 0;k<numbers.length; k++){
            for (int i = 0; i<numbers[k].length; i++){
                if (numbers[k][i] %2 == 0){
                    System.out.print(numbers[k][i]+" ");
                }else{
                    odd++;
                }
            }
        }
        System.out.println();
        System.out.println(odd);
    }
}
