public class AutomaticCar extends Car {

    protected String automaticTransmission;

    public AutomaticCar(int acceleration, boolean vehicleBreak, String hydraulicSteering, String engine, int doorsCount, int windowsCount, String color) {
        super(acceleration, vehicleBreak, hydraulicSteering, engine, doorsCount, windowsCount, color);
    }

    public String getAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(String automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }
}
