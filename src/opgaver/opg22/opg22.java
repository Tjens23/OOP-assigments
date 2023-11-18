package opgaver.opg22;

public class opg22 {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            NonFoodItem item = new NonFoodItem("item: " + i, i*20, new String[]{"Item 1", "Item 2", "Item 3"});
            System.out.println(item.toString());
        }
    }
}
