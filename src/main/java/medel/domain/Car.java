package medel.domain;

import medel.vo.CarLocation;
import medel.vo.CarName;

public class Car {
    private int location;
    private final String name;

    public Car(String name) {
        this.name = new CarName(name).getCarName();
        this.location = new CarLocation().getLocation();
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return this.location;
    }

    public void forward() {
        this.location++;
    }
}
