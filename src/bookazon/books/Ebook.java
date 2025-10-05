package bookazon.books;

import java.math.BigDecimal;

public class Ebook extends Book {
    public Ebook(String title, String author, int yearPublished, BigDecimal price) {
        super(title, author, yearPublished, price);
        this.bookType = "ebook";
    }
}
