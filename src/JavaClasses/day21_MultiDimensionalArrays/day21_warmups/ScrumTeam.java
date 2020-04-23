package JavaClasses.day21_MultiDimensionalArrays.day21_warmups;

import java.util.Arrays;

public class ScrumTeam {

    public static void main(String[] args) {

        String [] DevTeam = {"Keko","Retad","Kamil"};
        String [] Tester = {"Rahman","Aishan","Osman","Alibaba"};

        String ScrumTeam [][] = {DevTeam,Tester};

        ScrumTeam [0][2] = "Baha";
        System.out.println(ScrumTeam[0][2]);

        System.out.println(Arrays.toString(ScrumTeam[0]));

        for (String eachdev : ScrumTeam[0]){
            System.out.println(eachdev);
        }


    }
}
