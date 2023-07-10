package cars;

public class Car {
    private final int INITIAL_LOCATION = 1;
    private int location;
    private String name;

    Car(String name) {
        this.name = name;
        this.location = INITIAL_LOCATION;
    }

    public String getName() {
        return this.name;
    }

    public int getLocation() {
        return this.location;
    }

    public void forward() {
        this.location++;
    }
}
