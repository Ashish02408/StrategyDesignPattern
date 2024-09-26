package WithStrategyPattern.Strategy;

public class GoodVehicle extends Vehicle{
    public GoodVehicle() {
        super(new NormalDriveStrategy());
    }
}
