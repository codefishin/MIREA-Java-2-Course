package vehicles;

public class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String sModel, String sLicense,
                       String sColor, String sEngine,
                       int sInsurance, int sBattery) {
        super(sModel, sLicense, sColor, sEngine, sInsurance);
        batteryCapacity = sBattery;
        engineType = "Electric";
    }

    public void setBatteryCapacity(int newBattery) { batteryCapacity = newBattery; }
    public int getBatteryCapacity() { return batteryCapacity; }

    public String vehicleType() { return "Electric Car"; }
    public String toString() {
        return ("Model: " + getModel() + "\nLicense: " + getLicense() + "\nColor: " + getColor() + "\nEngine type: " + getEngineType() + "\nInsurance number: " + getInsuranceNumber() + "\nBattery capacity: " + getBatteryCapacity());
    }
}
