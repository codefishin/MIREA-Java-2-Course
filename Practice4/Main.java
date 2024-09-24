package app;
import vehicles.ElectricCar;
import vehicles.Car;

public class Main {
    public static void main(String[] args) {

        String model = "Car";
        String license = "124";
        String color = "Purple";
        int insuranceNumber = 142;
        String engineType = "car";

        Car car = new Car(model, license, color, engineType, insuranceNumber);
        ElectricCar electricCar = new ElectricCar(model, license, color, engineType, insuranceNumber, 100);

        System.out.println(car.toString());
        System.out.println(electricCar.toString());
    }
}
