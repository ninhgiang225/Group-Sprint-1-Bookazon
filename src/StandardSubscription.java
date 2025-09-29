public class StandardSubscription implements Subscription {
    @Override
    public float applyDiscount(float total) {
        return total; 
    }

    @Override
    public String getType() {
        return "Standard";
    }
}
