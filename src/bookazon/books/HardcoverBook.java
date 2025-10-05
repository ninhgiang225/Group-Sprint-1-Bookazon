package bookazon.books;

import java.math.BigDecimal;
import java.time.Year;

public class HardcoverBook extends Book {
    public HardcoverBook(String title, String author, Year yearPublished, BigDecimal price) {
        super(title, author, yearPublished, price);
        this.bookType = "hardcover";
    }
}
