package bookazon.users;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import bookazon.Address;
import bookazon.Cart;
import bookazon.Order;

public abstract class User {
    private String name;
    private Cart cart;
    private ArrayList<Order> orders;
    private Address shippingAddress;
    private Address billingAddress;
    protected BigDecimal discountRate;
    protected String subscription;

    public User(String name) {
        this.name = name;
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public User(User otherUser) {
        this.name = otherUser.getName();
        this.cart = otherUser.getCart();
        this.orders = otherUser.getOrders();
        this.shippingAddress = otherUser.getShippingAddress();
        this.billingAddress = otherUser.getBillingAddress();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getDiscountRate() {
        return discountRate;
    }

    public String getSubscription() {
        return this.subscription;
    }

    public void setShippingAddress(Address address) {
        this.shippingAddress = address;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setBillingAddress(Address address) {
        this.billingAddress = address;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Cart getCart() {
        return cart;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void viewOrders() {
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }

    public void checkout() {
        Order order = new Order(cart, this);
        order.setShippingAddress(new Address("123 Main St", "", "Springfield", "IL", "62701", "USA"));
        order.setBillingAddress(new Address("123 Main St", "", "Springfield", "IL", "62701", "USA"));
        order.setOrderStatus("Order Placed");
        order.setDateCreated(LocalDate.now());
        order.setUserName(this.name);
        orders.add(order);
        cart.clearCart();
    }
}
