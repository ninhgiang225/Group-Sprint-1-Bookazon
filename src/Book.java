/*
 * Author: 
 * Date: 2025-09-27
 * Project: Group Sprint 1 - Bookazon
 * Description:
 * The Book class represents a book in the Bookazon system.
 * Refactored to:
 *  - Fix inconsistent naming for the isPaperback getter/setter.
 *  - Replace double with BigDecimal for price (avoid primitive obsession).
 *  - Ensure validation methods are used inside setters (remove unused methods).
 */

 import java.math.BigDecimal;

 public class Book {
     private String title;
     private String author;
     private int yearPublished;
     private BigDecimal price;
     private boolean isPaperback;  
 
     public Book(String title, String author, int yearPublished, BigDecimal price, boolean isPaperback) {
         setTitle(title);
         setAuthor(author);
         setYearPublished(yearPublished);
         setPrice(price);
         setIsPaperback(isPaperback);
     }
 
     public String getTitle() {
         return title;
     }
 
     public void setTitle(String title) {
         if (!isTitleValid(title)) {
             throw new IllegalArgumentException("Invalid title.");
         }
         this.title = title;
     }
 
     public String getAuthor() {
         return author;
     }
 
     public void setAuthor(String author) {
         if (!isAuthorValid(author)) {
             throw new IllegalArgumentException("Invalid author.");
         }
         this.author = author;
     }
 
     public int getYearPublished() {
         return yearPublished;
     }
 
     public void setYearPublished(int yearPublished) {
         if (!isYearPublishedValid(yearPublished)) {
             throw new IllegalArgumentException("Invalid year published.");
         }
         this.yearPublished = yearPublished;
     }
 
     public BigDecimal getPrice() {
         return price;
     }
 
     public void setPrice(BigDecimal price) {
         if (!isPriceValid(price)) {
             throw new IllegalArgumentException("Invalid price. Must be greater than zero.");
         }
         this.price = price;
     }
 
     
     public boolean getIsPaperback() {
         return isPaperback;
     }
 
     public void setIsPaperback(boolean isPaperback) {
         this.isPaperback = isPaperback;
     }
 
     public void printBookDetails() {
         System.out.println("Title: " + title);
         System.out.println("Author: " + author);
         System.out.println("Year Published: " + yearPublished);
         System.out.println("Price: $" + price);
         System.out.println("Paperback: " + isPaperback);
     }
 
    
     private boolean isPriceValid(BigDecimal price) {
         return price != null && price.compareTo(BigDecimal.ZERO) > 0;
     }
 
     private boolean isTitleValid(String title) {
         return title != null && !title.isEmpty();
     }
 
     private boolean isAuthorValid(String author) {
         return author != null && !author.isEmpty();
     }
 
     private boolean isYearPublishedValid(int yearPublished) {
         return yearPublished > 0;
     }
 }
 