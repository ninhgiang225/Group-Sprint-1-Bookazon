package bookazon.books;

import java.math.BigDecimal;
import java.time.Year;

public class PaperbackBook extends Book {
    public PaperbackBook(String title, String author, Year yearPublished, BigDecimal price) {
        super(title, author, yearPublished, price);
        this.bookType = "paperback";
    }
}
