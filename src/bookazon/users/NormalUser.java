package bookazon.users;

import java.math.BigDecimal;

public class NormalUser extends User {
    private static final BigDecimal NORMAL_DISCOUNT_RATE = new BigDecimal("0.0");
    private static final String NORMAL_SUBSCRIPTION = "normal";

    public NormalUser(String name) {
        super(name);
        this.discountRate = NORMAL_DISCOUNT_RATE;
        this.subscription = NORMAL_SUBSCRIPTION;
    }

    public NormalUser(User otherUser) {
        super(otherUser);
        this.discountRate = NORMAL_DISCOUNT_RATE;
        this.subscription = NORMAL_SUBSCRIPTION;
    }
}
