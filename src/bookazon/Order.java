package bookazon;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.time.LocalDate;

import bookazon.users.User;

public class Order {
    private LocalDate dateCreated;
    private LocalDate dateShipped;
    private String userName;
    private String orderStatus;
    private Address shippingAddress;
    private Address billingAddress;
    private ArrayList<CartItem> items;
    private BigDecimal originalOrderPrice;
    private BigDecimal discountAmount;
    private BigDecimal discountedOrderPrice;

    public Order(Cart cart, User user) {
        this.items = cart.getItems();
        this.discountedOrderPrice = calculatePrice(user);
    }

    public void setShippingAddress(Address address) {
        this.shippingAddress = address;
    }

    public void setBillingAddress(Address address) {
        this.billingAddress = address;
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void setDateCreated(LocalDate date) {
        this.dateCreated = date;
    }

    public void setDateShipped(LocalDate date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + (dateShipped != null ? dateShipped : "Order not shipped"));
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + (shippingAddress != null ? shippingAddress : "N/A"));
        System.out.println("Billing Address: " + (billingAddress != null ? billingAddress : "N/A"));
        System.out.println("Original Order Price: $" + originalOrderPrice);
        System.out.println("Discount: - $" + discountAmount);
        System.out.println("Discounted Order Price: $" + discountedOrderPrice);
    }

    private BigDecimal calculatePrice(User user) {
        BigDecimal totalPrice = BigDecimal.ZERO;

        for (CartItem item : items) {
            totalPrice = totalPrice.add(item.getTotalPrice());
        }
        this.originalOrderPrice = totalPrice.setScale(2, RoundingMode.HALF_UP);
        BigDecimal discountRate = user.getDiscountRate();
        this.discountAmount = this.originalOrderPrice.multiply(discountRate).setScale(2, RoundingMode.HALF_UP);
        return this.originalOrderPrice.subtract(this.discountAmount);
    }
}
