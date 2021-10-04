import java.util.ArrayList;

public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;

    public HousePlan(int numRooms, int numWindows, int squareFeet) {
        materials = new ArrayList<String>();
        features = new ArrayList<String>();
        setMaterials();
        setFeatures();
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
    }

    public abstract void setMaterials();

    public abstract void setFeatures();

    public int getNumRooms() {
        return numRooms;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public String toString() {
        String result = getShortDescription();
        result += getMaterialsString();
        result += getFeaturesString();

        return result;
    }

    private String getShortDescription() {
        String result = "";

        result += "Square Feet: " + squareFeet + "\n";
        result += "Room: " + numRooms + "\n";
        result += "Windows: " + numWindows + "\n";

        return result;
    }

    private String getMaterialsString() {
        String result = "\nMaterials:\n";

        for (String material : materials) {
            result += " - " + material + "\n";
        }

        return result;
    }

    private String getFeaturesString() {
        String result = "\nFeatures:\n";

        for (String feature : features) {
            result += " - " + feature + "\n";
        }

        return result;
    }
}