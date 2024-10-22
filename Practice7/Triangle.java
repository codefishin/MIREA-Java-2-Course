import static java.lang.Math.sqrt;

public class Triangle extends GeometricObject{
    private double side1, side2, side3;
    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
        setColor("NULL");
        setFilled(false);
    };
    public Triangle(double setSide1,
                    double setSide2, double setSide3,
                    String colour, boolean filled)
            throws IllegalTriangleException {
        side1 = setSide1;
        side2 = setSide2;
        side3 = setSide3;
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Третья сторона не может быть больше суммы двух других");
        }
        setColor(colour);
        setFilled(filled);
    }
    public double getFirstSide() { return side1; };
    public double getSecondSide() { return side2; };
    public double getThirdSide() { return side3; };
    public void setFirstSide(double newSide) { side1 = newSide; };
    public void setSecondSide(double newSide) { side2 = newSide; };
    public void setThirdSide(double newSide) { side3 = newSide; };

    public double getPerimeter() { return side1 + side2 + side3; };
    public double getArea() {
        double halfPer = getPerimeter() / 2;
        return sqrt(halfPer * (halfPer - side1) * (halfPer - side2) * (halfPer - side3));
    }

    public String toString() {
        return "Треугольник: сторона1 = " + side1
                + "\nсторона2 = " + side2
                + "\nсторона3 = " + side3
                + "\nцвет = " + getColor()
                + "\nзаливка = " + isFilled();
    }
}
