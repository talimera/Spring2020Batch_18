package JavaClasses.day17_WhileLoops;

public class RemoveDuplicates {

    public static void main(String[] args) {



    String str = "Java Java Java Java"; // can add toLowerCase or toUpperCase to ignore case sensitivity issues

    int count = 0;

    while(str.contains("Java")){
        count++;
        str = str.replaceFirst("Java"," ");

    }
        System.out.println(count);

    }

}
