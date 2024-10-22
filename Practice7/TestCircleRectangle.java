import java.util.Scanner;
public class TestCircleRectangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        String color;
        boolean filled;
        System.out.println("Введите информацию о сторонах");
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();
        System.out.println("Введите информацию о заливке");
        filled = input.nextBoolean();
        System.out.println("Введите информацию о цвете");
        color = input.nextLine();
        color = input.nextLine();
        Triangle triangle = new Triangle(side1, side2, side3, color, filled);

        System.out.println(triangle.toString());

        Circle circle = new Circle(2,"e",true);
        Circle circle2 = new Circle(3,"b",true);

        Rectangle rectangle = new Rectangle(2,3);
        Rectangle rectangle2 = new Rectangle(3,3);

        System.out.println(GeometricObject.max(circle, circle2));
        System.out.println(GeometricObject.max(rectangle, rectangle2));
        System.out.println(GeometricObject.compareTo(circle, rectangle));

        GeometricObject[] GeomOdj = new GeometricObject[5];
        GeomOdj[0] = new Circle(4);
        GeomOdj[1] = new GeometricObject();
        GeomOdj[2] = new Rectangle(3, 7);
        GeomOdj[3] = new Triangle(3, 4, 5, "e", true);
        GeomOdj[4] = new Square(4);

        for (int i = 0; i < 5; i++){
            GeomOdj[i].howToColor();
            System.out.println("Площадь: " + GeomOdj[i].getArea() + "\n");
        }
    }
}
