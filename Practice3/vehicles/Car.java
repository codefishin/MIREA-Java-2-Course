package vehicles;

public class Car {
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Car(String owner, String insurance, String engine) {
        ownerName = owner;
        insuranceNumber = insurance;
        engineType = engine;
    }
    public Car() {
        ownerName = null;
        insuranceNumber = null;
        engineType = null;
    }
    public String GetOwnerName() {
        return ownerName;
    }
    public String GetInsNumber() {
        return insuranceNumber;
    }
    public String getEngineType() {
        return engineType;
    }
    public void SetOwnerName(String newName) {
        ownerName = newName;
    }
    public void SetInsNumber(String newIns) {
        insuranceNumber = newIns;
    }
}
