package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private String typeBlade;
    private String typeDrive;

    public Bulldozer() {
    }

    public void setTypeBlade(String typeBlade) {
        this.typeBlade = typeBlade;
    }

    public void setTypeDrive(String typeDrive) {
        this.typeDrive = typeDrive;
    }

    public String getTypeBlade() {
        return typeBlade;
    }

    public String getTypeDrive() {
        return typeDrive;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
