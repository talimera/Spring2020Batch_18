package JavaClasses.day19_Arrays;

public class Array_Practice1 {

    public static void main(String[] args) {

        String [] names = {"kamil","kezban","muhtar","baho","Omerbasgan"};
                    //        0        1        2       3        4

        String name1 = names[3];
        System.out.println(name1);


        String  [] emails = {"cybertek@yahoo.com", "cybertek@gmail.com","cybertek@hotmail.com","cybertek@outlook.com"};

            for (int i=0; i<=3; i++){
                String email = emails[i];

                if (email.endsWith("gmail.com")){
                    System.out.println(email);
                }
            }



    }
}
