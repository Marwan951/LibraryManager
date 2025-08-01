
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class UserInteractionLogger {
    private static final String LOG_FILE = "src/resources/data/user_interactions.log";
    // Method to log search interactions
    public void logSearch(String searchTerm) {
        log("Search for: " + searchTerm);
    }
    // Method to log sorting interactions
    public void logSort(String sortCriteria) {
        log("Sorted by: " + sortCriteria);
    }
    // Method to log viewing all books
    public void logViewAllBooks() {
        log("Viewed all books");
    }
    // Generic method to log messages with a timestamp
    public void log(String message) {
    // TODO - missing code.
        File file = new File("src/resources/data/user_interactions.log");
        try (FileWriter fileWriter = new FileWriter(file,true);){
            String newLog = LocalDateTime.now() + " - "+ message+"\n";
            fileWriter.write(newLog);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
