package cars;

public class Car {
    private final int INITIAL_LOCATION = 1;
    private int location;

    Car() {
        this.location = INITIAL_LOCATION;
    }

    public int getLocation() {
        return this.location;
    }

    public void forward() {
        this.location++;
    }
}
