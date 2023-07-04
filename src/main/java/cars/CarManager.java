package cars;

import game.InputView;

import java.util.ArrayList;
import java.util.List;

public abstract class CarManager {

    private final CarsMakeFactory carsMakeFactory;

    public CarManager() {
        this.carsMakeFactory = new CarsMakeFactory(new ArrayList<>(), InputView.getInstance().getCarNumber());
    }

    public List<Car> getCarList() {
        return carsMakeFactory.getCarList();
    }

    public abstract void forwardCar();

    public abstract boolean validateForward();
}
