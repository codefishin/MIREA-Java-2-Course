package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private int insuranceNumber;
    protected String engineType;

    public Vehicle(String sModel, String sLicense,
                   String sColor, String sEngine, int sInsurance) {
        // Приставка s - Setting (параметр)
        model = sModel;
        license = sLicense;
        color = sColor;
        engineType = sEngine;
        insuranceNumber = sInsurance;
    }
    public Vehicle()
    {
        model = "";
        license = "";
        color = "";
        engineType = "";
        insuranceNumber = 0;
    }

    public abstract String vehicleType();

    public String getModel() { return model; }
    public String getLicense() { return license; }
    public String getColor() { return color; }
    public String getEngineType() { return engineType; }
    public int getInsuranceNumber() { return insuranceNumber; }
    public String toString() {
        return ("Model: " + getModel() + "\nLicense: " + getLicense() + "\nColor: " + getColor() + "\nEngine type: " + getEngineType() + "\nInsurance number: " + getInsuranceNumber());
    }

    public void setModel(String newModel) { model = newModel; }
    public void setLicense(String newLicense) { license = newLicense; }
    public void setColor(String newColor) { color = newColor; }
    public void setEngineType(String newEngineType) { engineType = newEngineType; }
    public void setInsuranceNumber(int newInsurance) { insuranceNumber = newInsurance; }
}
