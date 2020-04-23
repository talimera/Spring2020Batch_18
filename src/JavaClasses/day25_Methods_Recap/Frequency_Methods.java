package JavaClasses.day25_Methods_Recap;

public class Frequency_Methods {

    public static void main(String[] args) {
    String str1 = "AAA";
    String str2 = "A";

    int count = 0;

        while(str1.contains(str2)){
        count++;
        str1 = str1.replaceFirst(str2,"");
    }
        System.out.println(str1);
        System.out.println(count);

        String a = "python python python python";
        String b = "python";

        int num = Frequency(a,b);
        System.out.println(num);

    }

    public static int Frequency (String str1,String str2){
        int count =0;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2,"");
        }

        return count;
    }



}
