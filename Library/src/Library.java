import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    List<Book> books = new ArrayList<>();

    public void add(Book book) {

        books.add(book);
    }

    public List<Book> findByAuthorName(String author) {
        return books.stream()
                .filter(e -> e.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

}