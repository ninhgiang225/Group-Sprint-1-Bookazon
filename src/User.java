
import java.util.ArrayList;

public class User {
    private String name;
    
    private Cart cart;
    private ArrayList<Order> orders;
    private Address shippingAddress;
    private Address billingAddress;
    protected double discountRate;


    public User(String name) {
        this.name = name;
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void viewCart() {
        cart.viewCartDetails();
    }

    public void setShippingAddress(Address address) {
        this.shippingAddress = address;
    }

    public void setBillingAddress(Address address) {
        this.billingAddress = address;
    }

    public void addToCart(Book book, int quantity) {
        cart.addItem(new CartItem(book.getTitle(), book.getPrice(), quantity));
    }

    public void removeFromCart(Book book) {
        for (CartItem item : cart.getItems()) {
            if (item.getName().equals(book.getTitle())) {
                cart.getItems().remove(item);
                break;
            }
        }
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }

    public void checkout() {
        Order order = new Order(cart, this);
        order.setShippingAddress("123 Main St", "", "Springfield", "IL", "62701", "USA");
        order.setBillingAddress("123 Main St", "", "Springfield", "IL", "62701", "USA");
        order.setOrderStatus("Order Placed");
        order.setDateCreated("2024-01-01");
        order.setUserName(this.name);
        orders.add(order);
    }
}


