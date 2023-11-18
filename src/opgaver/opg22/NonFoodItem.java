package opgaver.opg22;

public class NonFoodItem extends Item {
    String[] materials;
    public NonFoodItem(String name, double price, String[] materials) {
        super(name, price);
        this.materials  = materials;
    }


    public String[] getMaterials() {
        return this.materials;
    }

    @Override
    public String toString() {
        String m = "[";
        for(int i = 0; i < this.materials.length; i++) {
            m += (i == 0 ? "" : ", ")+materials[i];
        }
        return "NonFoodItem: " + this.name + " " + this.price + " " + m + "]";
    }
}
