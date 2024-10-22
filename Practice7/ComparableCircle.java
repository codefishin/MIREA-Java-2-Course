public class ComparableCircle extends Circle implements Comparable {
    public static String max(ComparableCircle o1, ComparableCircle o2) {
        if (o1.getArea() > o2.getArea()){
            return "Большим объектом является первый объект с площадью: " + o1.getArea();
        }
        else{
            return "Большим объектом является второй объект с площадью: " + o2.getArea();
        }
    }
}
