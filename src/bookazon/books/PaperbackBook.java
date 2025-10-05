package bookazon.books;

import java.math.BigDecimal;

public class PaperbackBook extends Book {
    public PaperbackBook(String title, String author, int yearPublished, BigDecimal price) {
        super(title, author, yearPublished, price);
        this.bookType = "paperback";
    }
}
