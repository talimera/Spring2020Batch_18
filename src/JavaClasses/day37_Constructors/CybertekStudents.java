package JavaClasses.day37_Constructors;

public class CybertekStudents {

    static String schoolName;
    String studentName;
    int groupNumber;
    String batch;


    public CybertekStudents(String studentName, int groupNumber,String batch){
        schoolName = "Cybertek";
        this.studentName = studentName;
        this.groupNumber = groupNumber;
        this.batch = batch;
    }

    public String toString(){
        return "Student Name: "+studentName+"\nGroup Number:"+groupNumber+"\nBatch: "+batch+"\n"+schoolName;
    }

}

class Cobjects {

    public static void main(String[] args) {




        CybertekStudents student1 = new CybertekStudents("Omer",6,"Batch18");
        student1.schoolName = "MIT";
        System.out.println(student1);



        System.out.println("=============================");

        CybertekStudents student2 = new CybertekStudents("Saban", 8,"Batch18");
        System.out.println(student2);

    }

}