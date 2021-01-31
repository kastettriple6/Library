import java.sql.Time;
import java.time.LocalDate;

public class Book extends Library{

    public String title;
    public String author;
    public LocalDate year = LocalDate.now();

    public String toString(){
        this.year = year;
        return String.valueOf(year);
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author, LocalDate year){
    }
}

