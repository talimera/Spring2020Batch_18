package JavaClasses.day41_Inheritance;

public class Ebook extends Book {

    public String size;
    public int pages;


    public void readBook(){
        System.out.println("reading "+title);
    }

    public static void main(String[] args) {

        Ebook obj1 = new Ebook();


    }
}
