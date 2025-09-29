public class SilverSubscription implements Subscription {
    @Override
    public double applyDiscount(double total) {
        return total * 0.95; // 5% discount
    }

    @Override
    public String getType() {
        return "Silver";
    }
}