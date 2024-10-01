package vehicles;

public class Car extends Vehicle {
    public Car(String sModel, String sLicense,
               String sColor, String sNumber,
               String sOwnerName, int sYear) {
        super(sModel,sLicense,sColor,sOwnerName,sNumber,"Combustion",sYear);
    }
    public String vehicleType() { return "Car"; };
}
