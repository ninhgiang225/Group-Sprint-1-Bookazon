public class SilverSubscription implements Subscription {
    @Override
    public float applyDiscount(float total) {
        return total * 0.95f; 
    }

    @Override
    public String getType() {
        return "Silver";
    }
}
