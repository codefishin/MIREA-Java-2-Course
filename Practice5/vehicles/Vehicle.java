package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private String ownerName;
    private String insuranceNumber;
    private String engineType;
    private int year;

    public Vehicle(){
        model = "";
        license = "";
        color = "";
        ownerName = "";
        insuranceNumber = "";
        engineType = "";
        year = 0;
    }
    public Vehicle(String sModel, String sLicense,
                   String sColor, String sOwnerName,
                   String sNumber, String sType,
                   int sYear) {
        model = sModel;
        license = sLicense;
        color = sColor;
        ownerName = sOwnerName;
        insuranceNumber = sNumber;
        engineType = sType;
        year = sYear;
    }

    public void SetModel (String newModel) { model = newModel; };
    public void SetLicense (String newLicense) { license = newLicense; };
    public void SetColor (String newColor) { color = newColor; };
    public void SetOwnerName (String newOwnerName) { ownerName = newOwnerName; };
    public void SetInsuranceNumber (String newNumber) { insuranceNumber = newNumber; };
    public void SetEngineType (String newEngineType) { engineType = newEngineType; };
    public void SetYear(int newYear) { year = newYear; };

    public String GetModel() { return model; }
    public String GetLicense() { return license; }
    public String GetColor() { return color; }
    public String GetOwnerName() { return ownerName; }
    public String GetInsuranceNumber() { return insuranceNumber; }
    public String GetEngineType() { return engineType; }
    public int GetYear() { return year; }

    public abstract String vehicleType();

    public String toString() { return "\nModel: " + GetModel() + "\nLicense: " + GetLicense() + "\nColor: " + GetColor() + "\nOwner: " + GetOwnerName() + "\nInsurance: " + GetInsuranceNumber() + "\nEngine: " + GetEngineType() + "\nYear: " + GetYear(); };
}
