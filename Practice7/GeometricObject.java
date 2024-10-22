public class GeometricObject implements Comparable, Colorable {
    private String color = "белый";
    private boolean filled;
    private java.util.Date dateCreated;

    /** Создает по умолчанию заданный геометрический объект */
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /** Создает геометрический объект с указанным цветом и заливкой */
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public static String max(GeometricObject o1, GeometricObject o2) {
        if (o1.getArea() > o2.getArea()){
            return "Большим объектом является первый объект с площадью: " + o1.getArea();
        }
        else{
            return "Большим объектом является второй объект с площадью: " + o2.getArea();
        }
    }
    public static String compareTo(Circle o1, Rectangle o2){
        if (o1.getArea() > o2.getArea()) {
            return "Круг больше квадрата ";
        } else if (o1.getArea() < o2.getArea()) {
            return "Квадрат больше круга ";
        }
        else {
            return "Квадрат и круг равны ";
        }
    }

    public double getArea() {
        return 0;
    }
    public void howToColor() {
        System.out.println("Его не раскрасить.");
    }

    /** Возвращает цвет */
    public String getColor() {
        return color;
    }

    /** Присваивает новый цвет */
    public void setColor(String color) {
        this.color = color;
    }

    /** Возвращает заливку. Поскольку filled типа boolean,
     *  getter-метод называется isFilled */
    public boolean isFilled() {
        return filled;
    }

    /** Присваивает новую заливку */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /** Получает dateCreated */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /** Возвращает строковое представление этого объекта */
    public String toString() {
        return "создан " + dateCreated + ",\nцвет: " + color +
                ", заливка: " + filled;
    }
}
