package bookazon.books;

import java.math.BigDecimal;

public class AudioBook extends Book {
    public AudioBook(String title, String author, int yearPublished, BigDecimal price) {
        super(title, author, yearPublished, price);
        this.bookType = "audio";
    }
}
