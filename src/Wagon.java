public class Wagon extends Truck{
    protected String bucket;
    protected String hydraulicPiston;

    public Wagon(int acceleration, boolean vehicleBreak, String hydraulicSteering, double loadingCapacity, String turnLeft, String turnRight) {
        super(acceleration, vehicleBreak, hydraulicSteering, loadingCapacity, turnLeft, turnRight);
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public void setHydraulicPiston(String hydraulicPiston) {
        this.hydraulicPiston = hydraulicPiston;
    }

    public String getHydraulicPiston() {
        return hydraulicPiston;
    }
}
