import java.math.BigDecimal;

public class PlatinumUser extends User {
    public PlatinumUser(String name) {
        super(name);
        this.discountRate = new BigDecimal("0.10");
        this.subscription = "platinum";
    }
}
