package model.domain;

import model.vo.CarLocation;
import model.vo.CarName;

public class Car {
    private final CarLocation location;
    private final CarName name;

    public Car(String name) {
        this.name = new CarName(name);
        this.location = new CarLocation();
    }

    public String getName() {
        return name.getCarName();
    }

    public int getLocation() {
        return this.location.location;
    }

    public void forward() {
        this.location.location++;
    }
}
