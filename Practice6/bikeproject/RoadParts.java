package bikeproject;

public interface RoadParts {
    public static String terrain = "track_racing";
    public void setTyreWidth(int newValue);
    public void setPostHeight(int newValue);
    public int getTyreWidth();
    public int getPostHeight();
}
