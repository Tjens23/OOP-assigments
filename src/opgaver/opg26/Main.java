package opgaver.opg26;
import java.time.*;
public class Main {
    public static void main(String[] args) {
        FoodItem f = new FoodItem("Milk", 10.0, LocalDate.of(2020, 12, 12));
        FoodItem f2 = new FoodItem("Cheese", 10.0, java.time.LocalDate.of(2036, 12, 12));

        Inventory i = new Inventory();
        i.addItem(f);
        i.addItem(f2);

        i.printInventory();
        i.removeExpiredFood();

        i.printInventory();

        System.out.println(Inventory.ExpiredFoods);
    }
}
