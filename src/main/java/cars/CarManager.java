package cars;

import java.util.ArrayList;
import java.util.List;

public abstract class CarManager {

    private final CarList carList;

    public CarManager() {
        this.carList = new CarList(new ArrayList<>());
    }

    public List<Car> getCarList() {
        return carList.getCarList();
    }

    public abstract void forwardCar();

    public abstract boolean validateForward();
}
