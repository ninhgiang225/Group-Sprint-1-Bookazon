public class BookazonApp {
    public static void main(String[] args) {

        BookStore bookStore = new BookStore();

        // create books
        bookStore.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99f, true));
        bookStore.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99f, false));
        bookStore.addBook(new Book("1984", "George Orwell", 1949, 8.99f, true));

        // create users
        bookStore.addUser(new User("Alice"));
        bookStore.addUser(new User("Bob"));

        // add books to cart
        bookStore.getUsers().get(0).getCart().addItem(
                new CartItem(bookStore.getBooks().get(0).getTitle(), bookStore.getBooks().get(0).getPrice(), 1));
        bookStore.getUsers().get(0).getCart().addItem(
                new CartItem(bookStore.getBooks().get(1).getTitle(), bookStore.getBooks().get(1).getPrice(), 2));

        // view cart
        bookStore.getUsers().get(0).getCart().viewCartDetails();

        // set shipping address and billing address
        bookStore.getUsers().get(0)
                .setShippingAddress(new Address("123 Main St", "", "Springfield", "IL", "62701", "USA"));
        bookStore.getUsers().get(0)
                .setBillingAddress(new Address("456 Elm St", "", "Springfield", "IL", "62702", "USA"));

        // checkout
        bookStore.getUsers().get(0).checkout();

        // view order details
        bookStore.getUsers().get(0).viewOrders();
    }
}
