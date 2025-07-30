
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LibraryMenu {
    private Library library;
    private UserInteractionLogger logger = new UserInteractionLogger();
    private LibrarySerializer serializer = new LibrarySerializer();  // Added serializer

    public LibraryMenu(Library library) {
        this.library = library;
        // Load the library data when the program starts
        List<Book> books = serializer.loadLibrary("src/resources/data/library.ser");
        if (books != null) {
            library.setBooks(books);
            System.out.println("Library loaded successfully.");
        } else {
            System.out.println("No saved library found. Loading default books.");
            library.loadBooks("src/resources/data/books.txt");
        }
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean bool = true;
        while (bool) {
            // TODO - missing code
            System.out.println("=== Main Menu ===\n");
            System.out.println("1. View All Books\n" +
                    "2. Sort Books by Title\n" +
                    "3. Sort Books by Author\n" +
                    "4. Sort Books by Year\n" +
                    "5. Search for a Book by keyword\n" +
                    "6. Exit");
            int input = scanner.nextInt();
            switch (input){
                case 1:
                    library.viewAllBooks();
                    break;
                case 2:
                    SortUtil.bubbleSort(library.getBooks(),Comparator.comparing(Book::getTitle));
                    library.viewAllBooks();
                    break;
                case 3:
                    SortUtil.insertionSort(library.getBooks(),Comparator.comparing(Book::getAuthor));
                    library.viewAllBooks();
                    break;
                case 4:
                    SortUtil.quickSort(library.getBooks(),Comparator.comparing(Book::getAuthor),0,library.getBooks().size()-1);
                    library.viewAllBooks();
                    break;
                case 5:
                    System.out.println("Enter keyword to search (title, author, publication year): ");
                    String keyword = scanner.next();
                    library.searchBookByKeyword(keyword);
                    break;
                case 6:
                    bool=false;
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
        }
    }

}
