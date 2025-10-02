public class GoldUser extends User {
    public GoldUser(String name) {
        super(name);
        this.discountRate = 0.15;
        this.subscription = "gold";
    }
}
