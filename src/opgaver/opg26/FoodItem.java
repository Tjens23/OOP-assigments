package opgaver.opg26;

import java.time.*;
public class FoodItem extends Item{
    private LocalDate date;

    FoodItem(String name, double price, LocalDate expirationDate) {
        super(name, price);
        this.date = expirationDate;
    }

    public LocalDate getExpirationDate() {
        return this.date;
    }

    @Override
    public String toString() {
        return "FoodItem name: " + this.getName() + " price: " + getPrice() + " expires at: " + this.getExpirationDate();
    }

    @Override
    public boolean isExpired() {
        return this.date.isBefore(LocalDate.now());
    }
}