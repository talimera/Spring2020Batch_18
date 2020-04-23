package JavaClasses.day22_Arrays_Loops_Practice;

public class NestedLoop_2 {

    public static void main(String[] args) {

        int [][] numbers = { {43,32,63,1245},{123,4546,4537},{1,1241}};

        for (int j =0; j< numbers.length; j++){

        for (int i = 0; i<numbers[j].length; i++) {
            System.out.print(numbers[j][i]+" ");
        }
            System.out.println();
        }

    }
}
