import java.math.BigDecimal;

public class HardcoverBook extends Book {
    public HardcoverBook(String title, String author, int yearPublished, BigDecimal price) {
        super(title, author, yearPublished, price);
        this.bookType = "hardcover";
    }
}
