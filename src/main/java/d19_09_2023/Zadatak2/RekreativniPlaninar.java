package d19_09_2023.Zadatak2;

public class RekreativniPlaninar extends Planinar{
    private int equipmentWeight;
    private String districtName;
    private int maxClimbOvercome;

    public RekreativniPlaninar(int id, String fullName, int equipmentWeight, String districtName, int maxClimbOvercome) {
        super(id, fullName);
        this.equipmentWeight = equipmentWeight;
        this.districtName = districtName;
        this.maxClimbOvercome = maxClimbOvercome;
    }

    @Override
    public double membershipFee() {
        return 1000;
    }
    @Override
    public boolean successfulClimb(Planina planina) {
        return this.maxClimbOvercome - this.equipmentWeight * 50 >= planina.getMountainHeight();
    }
    @Override
    public void print() {
        System.out.println("Rekreativac, id: " + this.id);
        System.out.println("Ime: " + this.fullName);
        System.out.println("Okrug: " + this.districtName);
    }

    public int getEquipmentWeight() {
        return equipmentWeight;
    }

    public String getDistrictName() {
        return districtName;
    }

    public int getMaxClimbOvercome() {
        return maxClimbOvercome;
    }
}
