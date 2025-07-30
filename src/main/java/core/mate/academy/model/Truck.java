package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private int engineCapacity;
    private String typeOfEngine;

    public Truck() {
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
