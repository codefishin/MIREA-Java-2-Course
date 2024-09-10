import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Enter model, license, color and year.");
        Scanner input = new Scanner(System.in); // Ввод

        String model = input.nextLine();
        String license = input.nextLine();
        String color = input.nextLine();
        int year = input.nextInt();
        // ввод окончен
        Car car_full = new Car(model, license, color, year); // Создание объектов
        Car car_null = new Car();
        Car car_half = new Car(model, year);

        System.out.println("\nInfo about car with all info\n"); // Вызовы методов и т.п.
        car_full.To_String();
        System.out.println("\nInfo about car with half the info\n");
        car_half.To_String();
        System.out.println("\nInfo about car with no info\n");
        car_null.To_String();

        System.out.println("Please change the current year (" + year + ")");

        year = input.nextInt();
        car_full.Modify_Year(year);
        car_full.To_String();
    }
}
