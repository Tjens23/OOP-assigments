package opgaver.opg33;
public class Main {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage: java Main <number> <number>");
            System.exit(1);
        }
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(a + " + " + b + " = " + (a + b));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format " + e.getMessage());
        }
    }
}
