public class LogCabinPlan extends HousePlan {

    public LogCabinPlan() {
        super(2, 10, 1800);
    }

    public void setMaterials() {
        materials.add("Log Siding");
        materials.add("Board and Batten Siding");
        materials.add("White Pine");
    }

    public void setFeatures() {
        features.add("Timbered Roof");
        features.add("High Insulation");
        features.add("Rustic Effect");
    }

    public String toString(){
        return "Log Cabin\n" + super.toString();
    }
}
