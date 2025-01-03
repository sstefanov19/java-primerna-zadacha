import java.util.*;

public class Library {

    List<Book> books = new ArrayList<>();


    //task 1 - 15 tochki tursim kniga spored zaglavieto pokazvame v koq biblioteka e i dali e naeta.
    void SearchBook(String title) {
        boolean found = false;
        for(Book book: books) {
            if(book.title.toLowerCase().contains(title.toLowerCase())) {
                System.out.println("Намерена книга в библиотека: " + book.library);
                System.out.println("Заглавие: " + book.title);
                System.out.println("Може да бъде наета: " + (book.available ? "да" : "не"));
                System.out.println("---------------");
                found = true;
            }

        }
            if(!found){
                System.out.println("Книгата не е намерена в библиотеката");
            }
    }


    //task 2 -  15 tochki da se naeme kniga chrez id god knows how that guy knows the id
    void BorrowBook(String id) {
    for(Book book : books) {
        if (book.id.equals(id)) {
            if (book.available) {
                book.available = false;
                System.out.println("Успешно е добавена книгата от библиотека : " + book.library);

            } else {
                System.out.println("Книгата вече е наета");

            }

            return;
        }
    }
        System.out.println("Книгата не е намерена в библиотеката");
    }

    //3 task 15 tochki da se pokajat vsichki knigi
    void ShowAllBooks() {

        if(books.isEmpty()) {
            System.out.println("Няма налични книги в библиотеката");
            return;
        }


        for(Book book: books){
            System.out.println("ID: " + book.id);
            System.out.println("Библиотека: " + book.library);
            System.out.println("Заглавие: " + book.title);
            System.out.println("Автор: " + book.author);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Налична: " + (book.available ? "да" : "не"));
            System.out.println("---------------");
        }
    }

}
