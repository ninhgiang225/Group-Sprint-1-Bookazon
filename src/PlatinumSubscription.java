public class PlatinumSubscription implements Subscription {
    @Override
    public float applyDiscount(float total) {
        return total * 0.90f; 
    }

    @Override
    public String getType() {
        return "Platinum";
    }
}
