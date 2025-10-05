package bookazon.users;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import bookazon.Address;
import bookazon.Cart;
import bookazon.orders.Order;
import bookazon.orders.OrderManager;

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
        setShippingAddress(otherUser.getShippingAddress());
        setBillingAddress(otherUser.getBillingAddress());
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
        Address.validateAddress(address);
        this.shippingAddress = address;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setBillingAddress(Address address) {
        Address.validateAddress(address);
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
        OrderManager.placeOrder(order, this);
        orders.add(order);
        cart.clearCart();
    }
}
