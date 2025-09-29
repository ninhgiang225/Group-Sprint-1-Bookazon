public class GoldSubscription implements Subscription {
    @Override
    public float applyDiscount(float total) {
        return total * 0.85f;  
    }

    @Override
    public String getType() {
        return "Gold";
    }
}
