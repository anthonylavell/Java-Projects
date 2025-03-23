package vehicle_hasA;
import isA.Vehicle;
public class TestVehicle {

    public static void main(String [] args){
        String carNam = "impala";
        Engine engine = new Engine("Cam Tubro");
        Tire tire = new Tire(205,60);
        Vehicle vehicle = new Vehicle(carNam, engine, tire);
        vehicle.vechicleInformation();
    }
}
