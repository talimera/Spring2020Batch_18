package JavaClasses.day37_Constructors;

public class Student {


    String name;
    int age;
    char gender;
    String University;


    public Student(String name, int age, char gender, String University){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.University = University;
    }

    public void setinfo(String name, int age, char gender, String University){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.University = University;
    }


    public String toString(){
        return "Name: "+name+" Age: "+age+" Gender: "+gender+" University: "+University;
    }



}
