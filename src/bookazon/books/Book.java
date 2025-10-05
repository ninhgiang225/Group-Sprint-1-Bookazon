package bookazon.books;

import java.math.BigDecimal;
import java.time.Year;

public abstract class Book {
    private String title;
    private String author;
    private Year yearPublished;
    private BigDecimal price;
    protected String bookType;

    public Book(String title, String author, Year yearPublished, BigDecimal price) {
        setTitle(title);
        setAuthor(author);
        setYearPublished(yearPublished);
        setPrice(price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        validateTitle(title);
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        validateAuthor(author);
        this.author = author;
    }

    public Year getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Year yearPublished) {
        this.yearPublished = yearPublished;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        validatePrice(price);
        this.price = price;
    }

    public String getBookType() {
        return this.bookType;
    }

    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
        System.out.println("Book Type: " + bookType);
    }

    private void validatePrice(BigDecimal price) {
        if (price.compareTo(new BigDecimal("0")) <= 0) {
            throw new IllegalArgumentException("Invalid price. Must be greater than zero.");
        }
    }

    private void validateTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Invalid title.");
        }
    }

    private void validateAuthor(String author) {
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("Invalid author.");
        }
    }
}
