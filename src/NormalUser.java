public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.discountRate = 0.0;
        this.subscription = "normal";
    }
}
