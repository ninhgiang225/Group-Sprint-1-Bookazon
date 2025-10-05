package bookazon.users;

import java.math.BigDecimal;

public class GoldUser extends User {
    private static final BigDecimal GOLD_DISCOUNT_RATE = new BigDecimal("0.15");
    private static final String GOLD_SUBSCRIPTION = "gold";

    public GoldUser(String name) {
        super(name);
        this.discountRate = GOLD_DISCOUNT_RATE;
        this.subscription = GOLD_SUBSCRIPTION;
    }

    public GoldUser(User otherUser) {
        super(otherUser);
        this.discountRate = GOLD_DISCOUNT_RATE;
        this.subscription = GOLD_SUBSCRIPTION;
    }
}
