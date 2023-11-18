package opgaver.rgb;

public class HSV {

    int h, s, v;
    public HSV (int h, int s, int v) {this.h = h;this.s = s;this.v = v;}

    public int getH () {return h;}public int getS () {return s;}public int getV () {return v;}


    public RGB asRGB() {
        double h = (double) this.h * 360 / 255;
        double s = (double) this.s / 255;
        double v = (double) this.v / 255;
        double c = v * s;
        double x = c * (1 - abs(((h / 60) % 2) - 1));
        double m = v - c;
        double r,g,b;
        if(h>=0 && h < 60) {

        }

        return new RGB(0,0,0);
    }
    public String toString () {
        return "HSV("+h+","+s+","+v+")";
    }

    private double abs (double input) {
        return (input<0 ? -input : input);
    }
}
