package WithStrategyPattern.Strategy;

public class Main {

    public static void main(String[] args){
        Vehicle vehicle=new GoodVehicle();
        vehicle.drive();
    }
}
