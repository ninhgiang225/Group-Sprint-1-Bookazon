import java.util.ArrayList;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private String userName;
    private String orderStatus;
    private Address shippingAddress;
    private Address billingAddress;
    private ArrayList<CartItem> items;
    private float orderPrice;

    public Order(Cart cart, User user) {
        this.items = cart.getItems();
        this.orderPrice = calculatePrice(user);
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

    public void setDateCreated(String date) {
        this.dateCreated = date;
    }

    public void setDateShipped(String date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + (shippingAddress != null ? shippingAddress : "N/A"));
        System.out.println("Billing Address: " + (billingAddress != null ? billingAddress : "N/A"));
        System.out.println("Order Price: $" + orderPrice);
    }

    private float calculatePrice(User user) {
        float totalPrice = 0f;
    
        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }
    
        return totalPrice * (float) user.getDiscountRate();
    }
    
}
