public class PlatinumSubscription implements Subscription {
    @Override
    public double applyDiscount(double total) {
        return total * 0.90; // 10% discount
    }

    @Override
    public String getType() {
        return "Platinum";
    }
}