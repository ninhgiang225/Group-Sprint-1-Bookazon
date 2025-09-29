public class GoldSubscription implements Subscription {
    @Override
    public double applyDiscount(double total) {
        return total * 0.85; // 15% discount
    }

    @Override
    public String getType() {
        return "Gold";
    }
}