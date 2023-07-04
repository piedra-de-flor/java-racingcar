package cars;

import game.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CarManager {
    private final int POSITIVE_INTEGER_START = 0;
    private final CarsContainer carsContainer;
    private final CarFilter carFilter = new CarRandomNumberFilter();


    public CarManager() {
        this.carsContainer = new CarsContainer(new ArrayList<>(), InputView.getInstance().getCarNumber());
    }

    public List<Car> getCarList() {
        return carsContainer.getCarList();
    }

    public void forwardCar() {
        IntStream.range(POSITIVE_INTEGER_START, getCarList().size())
                .filter(i -> carFilter.validateForward())
                .forEach(i -> getCarList().get(i).forward());
    }
}
