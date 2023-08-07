package medel.cars;

public class Car {
    private static final int INITIAL_LOCATION = 0;
    private int location;
    private final CarName name;

    public Car(String name) {
        this.name = new CarName(name);
        this.location = INITIAL_LOCATION;
    }

    public String getName() {
        return name.getCarName();
    }

    public int getLocation() {
        return this.location;
    }

    public void forward() {
        this.location++;
    }
}
