package JavaClasses.day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Student_Objects {


    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setStudentInfo("Talha","Turkish-American",28,3.02,'M',false);

        Student student2 = new Student();
        student2.setStudentInfo("Mike","German",30,2.5,'M',false);

        Student student3 = new Student();
        student3.setStudentInfo("James Bond", "English", 40, 4.0, 'M', false);

        Student student4 = new Student();
        student4.setStudentInfo("Anna","Ukrainian", 33,2.9, 'F', true);

        Student [] students = {student1,student2,student3,student4};

        Predicate<Student> cantGrad = p -> p.gpa < 3;

        ArrayList<Student> canGrad = new ArrayList<>(Arrays.asList(students));
        canGrad.removeIf(cantGrad);

        for (Student eachGrad : canGrad){
            System.out.println(eachGrad.name);
        }







    }
}
