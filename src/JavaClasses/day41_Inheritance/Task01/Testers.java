package JavaClasses.day41_Inheritance.Task01;

public class Testers extends Employee{


    public Testers(String name,double salary, long ID, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=ID;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }


    public void reporting(){
        System.out.println(name +" is reporting");

    }

    public void testing(){
        System.out.println(name +" is testing");


    }

}
