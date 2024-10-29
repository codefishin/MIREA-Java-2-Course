import java.lang.Comparable;
public class Circle implements Comparable<Circle> {
    private int radius;
    public Circle (int rad) {
        radius = rad;
    }
    public Circle() {
        radius = 0;
    }

    public int getRadius() { return radius; }
    public void setRadius(int rad) { radius = rad; }

    public int compareTo(Circle o) {
        return radius - o.getRadius();
    }
}
