package JavaExtraPractices;

public class LeapYear_Divisibility {

    public static void main(String[] args) {

        short year =2020;
        boolean leapyear = year%4==0;
        String result = year+" is the leap year: "+leapyear;
        //System.out.println(year+" is the leap year: "+leapyear);
        System.out.println(result);

        short num1 = 65;

        boolean div1= num1%2==0;
        boolean div2= num1%3==0;
        boolean div3= num1%5==0;

        System.out.println(num1+" is divisible by 2: "+div1);
        System.out.println(num1+" is divisible by 3: "+div2);
        System.out.println(num1+" is divisible by 5: "+div3);


        int num2 = 80;

        boolean d1= num2%2==0;
        boolean d2= num2%3==0;
        boolean d3= num2%5==0;

        System.out.println(num2+"is divisible by 2: "+d1);
        System.out.println(num2+"is divisible by 3: "+d2);
        System.out.println(num2+"is divisible by 5: "+d3);





    }



}
