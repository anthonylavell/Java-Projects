package isA;
import vehicle_hasA.*;


/**
 * Created by dev on 8/3/15.
 */
public class Vehicle {
    private String name;
    private Engine engine;
    private Tire tire;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, Engine engine, Tire tire){
        this.engine = engine;
        this.tire = tire;
        this.name = name;
    }

    public void vechicleInformation(){
        System.out.println("Model "+name);
        System.out.println("Engine  "+engine.getEngineNam());
        System.out.println("Tire Size "+tire.getTireSize());
    }


}
