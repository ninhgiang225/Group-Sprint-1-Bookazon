import java.math.BigDecimal;

public class SilverUser extends User {
    public SilverUser(String name) {
        super(name);
        this.discountRate = new BigDecimal("0.05");
        this.subscription = "silver";
    }
}
