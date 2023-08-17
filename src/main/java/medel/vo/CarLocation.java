package medel.vo;

public class CarLocation {
    private static final int INITIAL_LOCATION = 0;
    private final int location;

    public CarLocation() {
        this.location = INITIAL_LOCATION;
    }

    public int getLocation() {
        return this.location;
    }
}
