import java.math.BigDecimal;

public class GoldUser extends User {
    public GoldUser(String name) {
        super(name);
        this.discountRate = new BigDecimal("0.15");
        this.subscription = "gold";
    }
}
