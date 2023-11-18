package opgaver.opg22;

import java.time.LocalDate;

public class FoodItem  extends Item {
    LocalDate expires;
    public FoodItem(String name, double price, LocalDate expires) {
        super(name, price);
        this.expires = expires;
    }

    public LocalDate getExpires() {
        return this.expires;
    }

    @Override
    public String toString() {
        return "FoodItem: " + this.name + " " + this.price + " " + this.expires;
    }
}
