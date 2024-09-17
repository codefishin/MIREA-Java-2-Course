package app;
import vehicles.Car;
import vehicles.ElectricCar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ownerName = input.nextLine();
        String insNum = input.nextLine();
        String engine = input.nextLine();
        int battery = input.nextInt();
        Car car = new Car(ownerName, insNum, engine);
        ElectricCar eCar = new ElectricCar(ownerName, insNum, engine, battery);
        System.out.println("car engine: " + car.getEngineType());
        System.out.println("car ins: " + car.GetInsNumber());
        System.out.println("car owner: " + car.GetOwnerName());
        System.out.println("eCar owner: " + eCar.GetOwnerName());
        System.out.println("eCar battery: " + eCar.getBatteryCapacity());
        eCar.setBatteryCapacity(1);
        System.out.println("eCar battery: " + eCar.getBatteryCapacity());
    }
}
