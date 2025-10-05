package bookazon.books;

import java.math.BigDecimal;
import java.time.Year;

public class AudioBook extends Book {
    public AudioBook(String title, String author, Year yearPublished, BigDecimal price) {
        super(title, author, yearPublished, price);
        this.bookType = "audio";
    }
}
