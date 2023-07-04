package cars;

import game.InputView;

import java.util.ArrayList;
import java.util.List;

public abstract class CarManager {

    private final CarsContainer carsContainer;

    public CarManager() {
        this.carsContainer = new CarsContainer(new ArrayList<>(), InputView.getInstance().getCarNumber());
    }

    public List<Car> getCarList() {
        return carsContainer.getCarList();
    }

    public abstract void forwardCar();

    public abstract boolean validateForward();
}
