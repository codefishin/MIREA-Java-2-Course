package app;
import vehicles.Car;
import vehicles.ElectricCar;
import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String model = "model";
        String license = "license3";
        String color = "Red";
        String ownerName = "Niel";
        String insuranceNumber = "hello";
        int year = 0;
        int batteryCapacity = 0;
        Car car = new Car(model,license,color,ownerName,insuranceNumber,year); // engineType = combustion
        ElectricCar ECar = new ElectricCar(model, license, color, ownerName, insuranceNumber, year, batteryCapacity);

        System.out.println("Change year for car: ");
        year = input.nextInt();
        car.SetYear(year);

        System.out.println("Change owner name for car: ");
        ownerName = input.nextLine();
        ownerName = input.nextLine();
        car.SetOwnerName(ownerName);

        System.out.println("Change insurance number for electric car: ");
        insuranceNumber = input.nextLine();
        ECar.SetInsuranceNumber(insuranceNumber);

        System.out.println("Battery capacity: " + ECar.GetBatteryCapacity());

        System.out.println("Car info: " + car.toString());
        System.out.println("Electric car info: " + ECar.toString());
    }
}
