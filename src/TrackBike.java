public class TrackBike extends Bike {
    protected String gumTyres;


    public TrackBike(int acceleration, boolean vehicleBreak, String hydraulicSteering,
                     String pedals, String chain, String seat, String turnLeft, String turnRight) {
        super(acceleration, vehicleBreak, hydraulicSteering, pedals, chain, seat);
    }

    public String getGumTyres() {
        return gumTyres;
    }

    public void setGumTyres(String gumTyres) {
        this.gumTyres = gumTyres;
    }
}
