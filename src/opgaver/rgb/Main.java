package opgaver.rgb;

public class Main {
    public static void main(String[] args) {
        RGB rgb = new RGB(255, 0, 0);
        HSV hsv = rgb.asHSV();
        System.out.println(hsv);
        RGB rgb2 = hsv.asRGB();
        System.out.println(rgb2.toString());
    }
}
