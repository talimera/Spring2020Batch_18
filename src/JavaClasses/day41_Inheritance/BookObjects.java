package JavaClasses.day41_Inheritance;

public class BookObjects {

    public static void main(String[] args) {

        Ebook book1 = new Ebook();

        book1.title = "Hamlet";
        book1.author = "Shakespears";
        book1.price = 20;

        book1.size = "1.5 MB";
        book1.pages = 432;

        System.out.println(book1);
        System.out.println("Size: "+book1.size);
        System.out.println("Pages: "+book1.pages);


        book1.readBook();

    }
}
