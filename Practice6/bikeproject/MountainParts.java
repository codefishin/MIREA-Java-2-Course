package bikeproject;

public interface MountainParts {
    public static String TERRAIN = "off-road";
    public void setSuspension(String newValue);
    public void setType(String newValue);
    public String getSuspension();
    public String getType();
}
