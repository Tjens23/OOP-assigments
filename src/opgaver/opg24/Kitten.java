package opgaver.opg24;

public class Kitten {
    double cuteness;
    static int kittenCount = 0;

    public Kitten(double cuteness) {
        this.cuteness = cuteness;
        kittenCount++;
    }
}
