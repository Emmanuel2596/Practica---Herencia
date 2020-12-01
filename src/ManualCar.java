public class ManualCar extends Car {

    protected String manualTransmission;

    public ManualCar(int acceleration, boolean vehicleBreak, String hydraulicSteering, String engine,
                     int doorsCount, int windowsCount, String color,String turnLeft, String turnRight) {
        super(acceleration, vehicleBreak, hydraulicSteering, engine, doorsCount, windowsCount,
                color, turnLeft, turnRight);
    }

    public String getManualTransmission() {
        return manualTransmission;
    }

    public void setManualTransmission(String manualTransmission) {
        this.manualTransmission = manualTransmission;
    }
}
