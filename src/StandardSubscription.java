public class StandardSubscription implements Subscription {
    @Override
    public double applyDiscount(double total) {
        return total; 
    }

    @Override
    public String getType() {
        return "Standard";
    }
}
