import java.lang.invoke.LambdaConversionException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

public class Books {
    public static void main(String[] args) {

        Library library = new Library();

        library.add(new Book("Green Mile","Poe", LocalDate.now()));
        library.add(new Book("Necronomicon","Lawcraft", LocalDate.now() ));
        library.add(new Book("War and Peace","Tolstoy", LocalDate.now() ));
        library.add(new Book("Bible","Jesus", LocalDate.now()));
        library.add(new Book("Cockroach","Chukovsky", LocalDate.now() ));
        library.add(new Book("Capital","Marks", LocalDate.now() ));
        library.add(new Book("Alice in Wonderland","Carrol", LocalDate.now()));

        library.findByTheAuthorNameInList("Poe");

    }
}
