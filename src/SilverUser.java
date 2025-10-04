import java.math.BigDecimal;

public class SilverUser extends User {
    private static final BigDecimal SILVER_DISCOUNT_RATE = new BigDecimal("0.05");
    private static final String SILVER_SUBSCRIPTION = "silver";

    public SilverUser(String name) {
        super(name);
        this.discountRate = SILVER_DISCOUNT_RATE;
        this.subscription = SILVER_SUBSCRIPTION;
    }

    public SilverUser(User otherUser){
        super(otherUser);
        this.discountRate = SILVER_DISCOUNT_RATE;
        this.subscription = SILVER_SUBSCRIPTION;
    }
}
