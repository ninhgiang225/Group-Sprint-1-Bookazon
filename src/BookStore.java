
import java.util.ArrayList;

public class BookStore {

    private ArrayList<Book> books;
    private ArrayList<User> users;

    public BookStore() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public ArrayList<Book> getBooks(){
        return this.books;
    }

    public ArrayList<User> getUsers(){
        return this.users;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void viewBooks() {
        for (Book book : books) {
            book.printBookDetails();
        }
    }

    public void viewUsers() {
        for (User user : users) {
            System.out.println(user.getName() + " - Role: " + user.getSubscription());
        }
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void updateBookDetails(Book book, String newTitle, String newAuthor, int newYearPublished, float newPrice, boolean isPaperback) {
        book.setTitle(newTitle);
        book.setAuthor(newAuthor);
        book.setYearPublished(newYearPublished);
        book.setPrice(newPrice);
        book.setIsPaperback(isPaperback);
    }

    public void updateRole(User user, String role) {
        user.setSubscription(role);
    }

    
}
