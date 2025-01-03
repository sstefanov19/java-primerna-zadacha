import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class LibraryServer {

    public static void main(String[] args) throws IOException {
        Library library = new Library();
        ServerSocket serverSocket = new ServerSocket(5678);
        System.out.println("Сървърът е стартиран на порт 5678");

        // Добавяме примерни книги
        // Добавяме примерни книги
        library.books.add(new Book("1", "Под игото", "Иван Вазов", "123456", "Централна библиотека"));
        library.books.add(new Book("2", "Под игото", "Иван Вазов", "123457", "Районна библиотека"));
        library.books.add(new Book("3", "Бай Ганьо", "Алеко Константинов", "789012", "Централна библиотека"));


        while(true) {
            Socket socket = serverSocket.accept();
            BufferedReader r = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String command = r.readLine();

            if(command !=null){

            switch (command) {
                case "1":
                    String searchTitle = r.readLine();
                    library.SearchBook(searchTitle);
                    break;
                case "2":
                    String borrowId = r.readLine();
                    library.BorrowBook(borrowId);
                    break;
                case "3":
                    library.ShowAllBooks();
                    break;
            }
            }
            socket.close();
        }



    }
}
