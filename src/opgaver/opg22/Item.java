package opgaver.opg22;

public class Item {
    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
