package bookazon.orders;

public enum OrderStatus {
    PLACED("Order Placed"),
    SHIPPED("Order Shipped");

    private final String displayName;

    private OrderStatus(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}