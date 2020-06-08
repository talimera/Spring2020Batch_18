package JavaClasses.day39_AccessModifiers;

public class CheckInfo {

    public static void main(String[] args) {

        System.out.println("name: "+ PersonalInfo.name);
        System.out.println("Gender: "+ PersonalInfo.gender);

        //  System.out.println("Grade: "+PersonalInfo.gpa); information initialized as a private so we can have an access to them outside the class
        //  System.out.println("SSN: "+ PersonalInfo.SSN); info is private
        //  System.out.println("Age: "+ PersonalInfo.age); info is private
    }
}
