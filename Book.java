public class Book {


     String id;
     String title;
     String author;
     String ISBN;
     boolean available;
     String library;

    public Book(String id , String title, String author,  String ISBN , String library) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = true;
        this.library = library;
    }

}
