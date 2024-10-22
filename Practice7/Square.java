public class Square extends GeometricObject implements Colorable {
    public double side;

    public Square() { side = 0; }
    public Square(double setSide){ side = setSide; }

    public void howToColor() { System.out.println("Раскрасьте все четыре стороны."); }

    public void SetSide(double setSide){ side = setSide; }
    public double GetSide(){ return side; }
    public double getArea() { return side * side; }
}
