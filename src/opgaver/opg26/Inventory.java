package opgaver.opg26;

import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    ArrayList<Item> items = new ArrayList<Item>();
    public static ArrayList<Item> ExpiredFoods = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double getInventoryValue() {
        double value = 0;
        for (Item item : items) {
            value += item.getPrice();
        }
        return value;
    }

    public void printInventory() {
        System.out.println("Inventory:");
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
    }

    public void removeExpiredFood() {
        ArrayList<Item> temp = new ArrayList<>(items); // Create a copy of the 'items' list
        items.removeIf(IExpireable::isExpired); // Remove expired items from the 'items' list
        temp.removeAll(items); // Remove the non-expired items from the 'temp' list
        ExpiredFoods.addAll(temp); // Add the expired items to the 'ExpiredFoods' list
    }
}