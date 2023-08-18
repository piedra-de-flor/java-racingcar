package medel.domain;

import medel.vo.CarLocation;
import medel.vo.CarName;

public class Car {
    private final CarLocation carLocation;
    private final CarName name;

    public Car(String name) {
        this.name = new CarName(name);
        this.carLocation = new CarLocation();
    }

    public String getName() {
        return name.getCarName();
    }

    public int getLocation() {
        return this.carLocation.location;
    }

    public void forward() {
        this.carLocation.location++;
    }
}
