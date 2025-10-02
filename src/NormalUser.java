import java.math.BigDecimal;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.discountRate = new BigDecimal("0.0");
        this.subscription = "normal";
    }
}
