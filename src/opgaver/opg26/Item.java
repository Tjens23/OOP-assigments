package opgaver.opg26;

public abstract class Item implements IExpireable {
    public final String name;
    private final double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }


    public Double getPrice() {
        return this.price;
    }
}