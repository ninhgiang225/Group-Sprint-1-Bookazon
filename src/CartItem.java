import java.math.BigDecimal;

public class CartItem {
    private String itemName;
    private BigDecimal price;
    private int quantity;

    public CartItem(String itemName, BigDecimal price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        CartItem other = (CartItem) obj;
        return itemName.equals(other.itemName) &&            
               price.compareTo(other.price) == 0 &&      
               quantity == other.quantity;                     
    }

    public BigDecimal getTotalPrice() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }
}
