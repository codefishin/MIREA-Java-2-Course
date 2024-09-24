package vehicles;

public class Car extends Vehicle {
    
    public Car(String sModel, String sLicense,
               String sColor, String sEngine,
               int sInsurance) {
        super(sModel, sLicense, sColor, sEngine, sInsurance);
    }

    public String vehicleType() { return "Car"; }
}
