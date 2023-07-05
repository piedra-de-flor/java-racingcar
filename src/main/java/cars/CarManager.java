package cars;

import filters.CarFilter;
import filters.CarRandomNumberFilter;
import game.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CarManager {
    private final int POSITIVE_INTEGER_START = 0;
    private final CarsContainer carsContainer;
    private final CarFilter carFilter;

    public CarManager(CarFilter carFilter) {
        this.carsContainer = new CarsContainer(new ArrayList<>(), InputView.getInstance().getCarNumber());
        this.carFilter = carFilter;
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
