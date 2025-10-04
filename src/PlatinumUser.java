import java.math.BigDecimal;

public class PlatinumUser extends User {
    private static final BigDecimal PLATINUM_DISCOUNT_RATE = new BigDecimal("0.10");
    private static final String PLATINUM_SUBSCRIPTION = "platinum";

    public PlatinumUser(String name) {
        super(name);
        this.discountRate = PLATINUM_DISCOUNT_RATE;
        this.subscription = PLATINUM_SUBSCRIPTION;
    }

    public PlatinumUser(User otherUser) {
        super(otherUser);
        this.discountRate = PLATINUM_DISCOUNT_RATE;
        this.subscription = PLATINUM_SUBSCRIPTION;
    }
}
