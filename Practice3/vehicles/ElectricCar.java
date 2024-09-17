package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String owner, String insurance, String engine, int battery) {
        super(owner, insurance, engine);
        engineType = "Electric";
        batteryCapacity = battery;
    }
    public ElectricCar() {
        engineType = "Electric";
        batteryCapacity = 0;
    }
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int newBattery) {
        batteryCapacity = newBattery;
    }
}
