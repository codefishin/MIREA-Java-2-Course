package vehicles;

public class ElectricCar extends Car implements ElectricVehicle {

    private int batteryCapacity;

    public ElectricCar(String sModel, String sLicense,
                       String sColor, String sNumber,
                       String sType, int sYear, int sCapacity){
        super(sModel,sLicense,sColor,sNumber,sType,sYear);
        SetEngineType("Electric");
        batteryCapacity = sCapacity;
    }
    public int GetBatteryCapacity() { return batteryCapacity; };
    public void SetBatteryCapacity(int sCapacity) { batteryCapacity = sCapacity; };
    public String vehicleType() { return "Electric"; };
    public String toString() { return "\nModel: " + GetModel() + "\nLicense: " + GetLicense() + "\nColor: " + GetColor() + "\nOwner: " + GetOwnerName() + "\nInsurance: " + GetInsuranceNumber() + "\nEngine: " + GetEngineType() + "\nYear: " + GetYear() + "\nBattery capacity: " + GetBatteryCapacity(); };
}
