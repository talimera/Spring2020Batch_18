package OfficeHours.Practice_05_06_2020;

public class Tester {

    String name;
    String jobTitle;
    double salary;
    long employeeId;

    public void setInfo(String name, String jobTitle,double salary, long employeeId){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeId = employeeId;

    }


    public String toString(){
        String result = name + ", Job Title: "+jobTitle+", Salary: "+salary+", ID: "+ employeeId;
        return result;
    }

    public void smokeTesting(){
        System.out.println(name+ " is doing smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name+ " is creating ticket on Jira");
    }


}
