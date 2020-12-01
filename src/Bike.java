public class Bike extends Vehicle{
    protected String pedals;
    protected String chain;
    protected String seat;

    public Bike(int acceleration, boolean vehicleBreak, String hydraulicSteering,
                String pedals, String chain, String seat, String turnLeft, String turnRight) {
        super(acceleration, vehicleBreak, hydraulicSteering, turnLeft, turnRight);
    }

    public String getPedals() {
        return pedals;
    }

    public void setPedals(String pedals) {
        this.pedals = pedals;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getChain() {
        return chain;
    }

    public String getSeat() {
        return seat;
    }
}
