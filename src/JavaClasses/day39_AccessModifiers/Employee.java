package JavaClasses.day39_AccessModifiers;

public class Employee {


    /*
 2. create a class called Employee:
                instance variables:
                        name, jobTitle, ID, salary
                add a constructor that can initialize name of employee
                add a constructor that can initialize name, jobTitle of the employee
                            (apply constructor call to initialize the name)
                add a constructor that can initialize name, jobTitle, ID of the employee
                            (apply constructor call to initialize the name and jobTitle)
                add a constructor that can initialize name, jobTitle, ID, salary of employee
                            (apply constructor call to initialize the name, jobTitle, ID)
 */



        String name;
        String jobTitle;
        long id;
        double salary;
        char gender;

        public Employee(String name){
            this.name = name;
        }



        public String toString(){
            return "Name: "+name+" id: "+id+" jobTitle: "+jobTitle+" salary: "+salary+" gender: "+gender;
        }

}
