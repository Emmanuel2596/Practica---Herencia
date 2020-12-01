public class Car extends Vehicle{
    protected String engine;
    protected int doorsCount;
    protected int windowsCount;
    protected String color;

    public Car(int acceleration, boolean vehicleBreak, String hydraulicSteering, String engine,
               int doorsCount, int windowsCount, String color, String turnLeft, String turnRight) {
        super(acceleration, vehicleBreak, hydraulicSteering, turnLeft, turnRight);
    }

    public String getEngine() {
        return engine;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public void setWindowsCount(int windowsCount) {
        this.windowsCount = windowsCount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWindowsCount() {
        return windowsCount;
    }

    public String getColor() {
        return color;
    }
}
