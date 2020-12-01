public class FireTruck extends Truck{
    protected String hose;
    protected String waterTank;
    protected double litersOfWaterCapacity;

    public FireTruck(int acceleration, boolean vehicleBreak,
                     String hydraulicSteering, double loadingCapacity, String turnLeft, String turnRight) {
        super(acceleration, vehicleBreak, hydraulicSteering, loadingCapacity, turnLeft, turnRight);
    }

    public String getHose() {
        return hose;
    }

    public void setHose(String hose) {
        this.hose = hose;
    }

    public void setWaterTank(String waterTank) {
        this.waterTank = waterTank;
    }

    public void setLitersOfWaterCapacity(double litersOfWaterCapacity) {
        this.litersOfWaterCapacity = litersOfWaterCapacity;
    }

    public String getWaterTank() {
        return waterTank;
    }

    public double getLitersOfWaterCapacity() {
        return litersOfWaterCapacity;
    }
}
