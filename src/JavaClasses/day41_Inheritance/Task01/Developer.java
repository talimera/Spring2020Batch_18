package JavaClasses.day41_Inheritance.Task01;

public class Developer extends Employee {

    public Developer(String name,double salary, long ID, String jobTitle,char gender){
        this.name=name;
        this.salary=salary;
        this.id=ID;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }


    public void fixingBug(){
        System.out.println(name+ " is fixing the bug");
    }

    public void coding(){
        System.out.println(name + " is coding");
    }
}
