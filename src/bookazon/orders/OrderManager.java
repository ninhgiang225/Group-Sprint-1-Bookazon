package bookazon.orders;

import java.util.Queue;
import java.util.LinkedList;
import bookazon.Address;
import bookazon.users.User;
import java.time.LocalDate;

public class OrderManager {
    private static Queue<Order> placedOrders = new LinkedList<>();
    private static Queue<Order> shippedOrders = new LinkedList<>();

    public static void placeOrder(Order order, User user) {
        Address.validateAddress(user.getShippingAddress());
        Address.validateAddress(user.getBillingAddress());
        order.setShippingAddress(user.getShippingAddress());
        order.setBillingAddress(user.getBillingAddress());
        order.setOrderStatus(OrderStatus.PLACED);
        order.setDateCreated(LocalDate.now());
        order.setUserName(user.getName());
        placedOrders.add(order);
    }

    public static void shipAllOrders() {
        for (int i = 0; i < placedOrders.size(); i++) {
            Order order = placedOrders.remove();
            order.setOrderStatus(OrderStatus.SHIPPED);
            order.setDateShipped(LocalDate.now());
            shippedOrders.add(order);
        }
    }

    public static void viewAllOrders() {
        System.out.println("\n\n-------Order-Manager-------");
        viewPlacedOrders();
        viewShippedOrders();
        System.out.println();
    }

    public static void viewPlacedOrders() {
        System.out.println("---Placed Orders---");
        if (placedOrders.isEmpty()) {
            System.out.println("No orders have been placed yet.");
        } else {
            for (Order order : placedOrders) {
                order.printOrderDetails();
                System.out.println("-----");
            }
        }
    }

    public static void viewShippedOrders() {
        System.out.println("---Shipped Orders---");
        if (shippedOrders.isEmpty()) {
            System.out.println("No orders have been shipped yet.");
        } else {
            for (Order order : shippedOrders) {
                order.printOrderDetails();
                System.out.println("-----");
            }
        }
    }

}
