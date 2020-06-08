package JavaClasses.day46_final_abstract;

public class final_Encapsulation {


    final private int data1 = 200;

    private int data2 = 300;


    public int getData1(){
        return data1;
    }
    /*
    public void setData1(int data1){
        this.data1 = data1;

    }
    when we assign final variable to private data , setter will give us compile error. Because we cant reassign final interview
    */

    public int getData2() {
        return data2;
    }

    public void setData2(int data2) {
        this.data2 = data2;
    }


}
