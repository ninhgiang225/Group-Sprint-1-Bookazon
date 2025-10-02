public class PlatinumUser extends User {
    public PlatinumUser(String name) {
        super(name);
        this.discountRate = 0.10;
        this.subscription = "platinum";
    }
}
