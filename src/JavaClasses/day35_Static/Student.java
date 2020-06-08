package JavaClasses.day35_Static;

public class Student {

    /*
    create a custom class called student
            Attribute;
            name , id , gpa
            Schoolname = "Cybertek"

            actions:
            setInfo(); name id gpa
            printSchoolname();
            toString()
     */


    String name;
    int Id;
    double gpa;
    static String school = "Cybertek";



    public void setInfo (String name, int Id , double gpa){
        this.name = name;
        this.gpa = gpa;
        this.Id = Id;
    }

    public static void printSchoolname(){
        System.out.println(school);
    }


    public String toString(){
        return "Name: "+name+", School name: "+school;
    }

}
