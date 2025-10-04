import java.math.BigDecimal;

public class BookazonApp {
        public static void main(String[] args) {

                BookStore bookStore = new BookStore();

                // create books
                bookStore.addBook(new PaperbackBook("The Great Gatsby", "F. Scott Fitzgerald", 1925,
                                new BigDecimal("9.99")));
                bookStore.addBook(new Ebook("To Kill a Mockingbird", "Harper Lee", 1960, new BigDecimal("7.99")));
                bookStore.addBook(new AudioBook("1984", "George Orwell", 1949, new BigDecimal("8.99")));

                // create users
                bookStore.addUser(new User("Alice"));
                bookStore.addUser(new User("Bob"));

                // add books to cart
                bookStore.getUsers().get(0).getCart().addItem(
                                new CartItem(bookStore.getBooks().get(0).getTitle(),
                                                bookStore.getBooks().get(0).getPrice(), 1));
                bookStore.getUsers().get(0).getCart().addItem(
                                new CartItem(bookStore.getBooks().get(1).getTitle(),
                                                bookStore.getBooks().get(1).getPrice(), 2));

                // view cart
                bookStore.getUsers().get(0).getCart().viewCartDetails();

                // set shipping address and billing address
                bookStore.getUsers().get(0)
                                .setShippingAddress(
                                                new Address("123 Main St", "", "Springfield", "IL", "62701", "USA"));
                bookStore.getUsers().get(0)
                                .setBillingAddress(new Address("456 Elm St", "", "Springfield", "IL", "62702", "USA"));

                // checkout
                bookStore.getUsers().get(0).checkout();

                // view order details
                bookStore.getUsers().get(0).viewOrders();
        }
}
