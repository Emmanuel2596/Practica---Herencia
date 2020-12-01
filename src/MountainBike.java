public class MountainBike extends Bike{

    protected String mountainTyres;

    public MountainBike(int acceleration, boolean vehicleBreak, String hydraulicSteering,
                        String pedals, String chain, String seat, String turnLeft, String turnRight) {
        super(acceleration, vehicleBreak, hydraulicSteering, pedals, chain, seat, turnLeft, turnRight);
    }

    public String getMountainTyres() {
        return mountainTyres;
    }

    public void setMountainTyres(String mountainTyres) {
        this.mountainTyres = mountainTyres;
    }
}
