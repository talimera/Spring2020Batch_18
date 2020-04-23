package JavaClasses.day21_MultiDimensionalArrays.day21_warmups;

public class Longest_Shortest_Words {

    public static void main(String[] args) {

        String [] names ={"Retad","Kamil","Tali","Keko","sultiseker","ismailbey","tubis"};

        int maxlength = names[0].length();
        int minlength = names[0].length();

        String longest ="";
        String shortest ="";


        for (int i =1; i<= names.length-1; i++){
            if (names[i].length() > maxlength){
                maxlength = names[i].length();
                longest = names[i];
            }
            if (names[i].length() < minlength){
                minlength = names[i].length();
                shortest = names[i];
            }
        }
        System.out.println(longest);
        System.out.println(shortest);
    }
}
