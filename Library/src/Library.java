import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books = new ArrayList<>();

    public void add(Book book) {

        books.add(book);
    }

    public Book findByTheAuthorNameInList(
            String author) {

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
            throw new IllegalArgumentException("Wrong name or not found");
        }
        return null;
    }

    boolean done = false;
    Book result;
while(done){

            String searchAuthor = result.getAuthor();
            if (searchAuthor.equals("DONE")) {
                done = true;
            } else {

                String searchTitle = result.getTitle();
                // Search the ArrayList.
                for (Book book : books) {
                    // See if the gender is in the ArrayList
                    if (searchTitle.equals(book.getTitle())) {
                        // See if the name matches the gender in the ArrayList
                        if (searchAuthor.equals(book.getAuthor())) {
                            result = book;
                        }
                    }
                }
            }
        }
    }
}