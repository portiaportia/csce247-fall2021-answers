public class TinyHomePlan extends HousePlan {
    public TinyHomePlan() {
        super(1, 5, 200);
    }

    public void setMaterials() {
        materials.add("Lumber");
        materials.add("Insulation");
        materials.add("Metal Roofing");
        materials.add("Hardware");
    }

    public void setFeatures() {
        features.add("Natural Light");
        features.add("Creative Storage");
        features.add("Multipurpose areas");
        features.add("Multi-use applications");
    }

    public String toString(){
        return "Tiny House\n" + super.toString();
    }
}