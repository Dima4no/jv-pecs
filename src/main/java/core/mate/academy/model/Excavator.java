package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int sizeOfBoom;
    private String typeOfBucket;

    public Excavator() {
    }

    public void setSizeOfBoom(int sizeOfBoom) {
        this.sizeOfBoom = sizeOfBoom;
    }

    public void setTypeOfBucket(String typeOfBucket) {
        this.typeOfBucket = typeOfBucket;
    }

    public int getSizeOfBoom() {
        return sizeOfBoom;
    }

    public String getTypeOfBucket() {
        return typeOfBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
