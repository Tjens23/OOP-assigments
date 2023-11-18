package opgaver.opg24;

public class opg24 {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            Kitten kitten = new Kitten((double) i*2000/20);
            System.out.println("Kitten " + i + " has a cuteness of " + kitten.cuteness);
        }

        final String add = Adder.add(100000, 204353453);
        System.out.println(add);
    }
}
