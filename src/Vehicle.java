public class Vehicle {
    protected double acceleration;
    protected boolean vehicleBreak;
    protected String hydraulicSteering;
    protected String turnLeft;
    protected String turnRight;
    protected int wheelCount;

    public int getWheelCount() {
        return wheelCount;
    }

    public Vehicle(double acceleration, boolean vehicleBreak, String hydraulicSteering,
                   String turnRight, String turnLeft) {
        this.acceleration = acceleration;
        this.vehicleBreak = vehicleBreak;
        this.hydraulicSteering = hydraulicSteering;
        this.turnLeft = turnLeft;
        this.turnRight = turnRight;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public void setVehicleBreak(boolean vehicleBreak) {
        this.vehicleBreak = vehicleBreak;
    }

    public void setHydraulicSteering(String hydraulicSteering) {
        this.hydraulicSteering = hydraulicSteering;
    }

    public boolean getVehicleBreak() {
        return vehicleBreak;
    }

    public String getHydraulicSteering() {
        return hydraulicSteering;
    }
}
