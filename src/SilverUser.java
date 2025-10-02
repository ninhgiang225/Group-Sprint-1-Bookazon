public class SilverUser extends User {
    public SilverUser(String name) {
        super(name);
        this.discountRate = 0.05;
        this.subscription = "silver";
    }
}
