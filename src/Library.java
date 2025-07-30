
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void loadBooks(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
               //  TODO - missing code
                String arr[] = line.split(",");
                Book book = new Book(arr[0],arr[1],Integer.parseInt(arr[2]));
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
    public Book searchBookByKeyword(String keyword) {
        // TODO missing code
        for (Book book: books){
            keyword = keyword.toLowerCase();
            if(book.getTitle().toLowerCase().contains(keyword) || book.getAuthor().toLowerCase().contains(keyword) || String.valueOf(book.getPublicationYear()).contains(keyword) ){
                return book;
            }
        }
        return null;
    }
    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}
