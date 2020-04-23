package JavaClasses.day25_Methods_Recap;

public class Return_Methods {

    public static void main(String[] args) {

    }

    public static int max (int a, int b){
        int max = 0;
        if(a>b){
            max = a;
        }else{
            max=b;
        }
        return max;
    }

    public static int max2 (int a, int b){
        if (a>=b){
            return a;
        }
        return b;
    }


}
