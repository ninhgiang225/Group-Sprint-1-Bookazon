package bookazon.books;

import java.math.BigDecimal;
import java.time.Year;

public class Ebook extends Book {
    public Ebook(String title, String author, Year yearPublished, BigDecimal price) {
        super(title, author, yearPublished, price);
        this.bookType = "ebook";
    }
}
