public class Truck extends Vehicle{
    protected double loadingCapacity;

    public Truck(int acceleration, boolean vehicleBreak, String hydraulicSteering, double loadingCapacity,
                 String turnLeft, String turnRight) {
        super(acceleration, vehicleBreak, hydraulicSteering, turnLeft, turnRight);
    }

    public double getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(double loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
}
