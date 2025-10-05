package bookazon;

import java.math.BigDecimal;

import bookazon.books.Book;

public class CartItem {
    private String itemName;
    private BigDecimal price;
    private int quantity;

    public CartItem(Book book, int quantity) {
        this.itemName = book.getTitle();
        this.price = book.getPrice();
        setQuantity(quantity);
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
        validateQuantity(quantity);
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        CartItem other = (CartItem) obj;
        return itemName.equals(other.itemName) &&
                price.compareTo(other.price) == 0 &&
                quantity == other.quantity;
    }

    public BigDecimal getTotalPrice() {
        return price.multiply(BigDecimal.valueOf(quantity));
    }

    private void validateQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive.");
        }
    }
}
